class Router:
    def __init__(self, name):
        self.name = name
        self.adjacent_routers = {}
        self.routing_table = {}

    def add_neighbor(self, neighbor, cost):
        self.adjacent_routers[neighbor] = cost

    def update_routing_table(self, source_router):
        for router in self.adjacent_routers:
            if router == source_router:
                continue
            new_cost = self.adjacent_routers[router] + source_router.routing_table[self.name]
            if router not in self.routing_table or new_cost < self.routing_table[router][0]:
                self.routing_table[router] = (new_cost, source_router.name)

    def get_shortest_path(self, destination):
        path = [destination]
        next_hop = self.routing_table[destination][1]
        while next_hop != self.name:
            path.insert(0, next_hop)
            next_hop = self.routing_table[next_hop][1]
        path.insert(0, self.name)
        return path

class Network:
    def __init__(self):
        self.routers = {}

    def add_router(self, router):
        self.routers[router.name] = router

    def link_routers(self, router1, router2, cost):
        self.routers[router1].add_neighbor(router2, cost)
        self.routers[router2].add_neighbor(router1, cost)

    def dijkstra(self, source):
        visited = set()
        current = source
        source_router = self.routers[source]

        for router_name in self.routers:
            self.routers[router_name].routing_table = {source: (float('inf'), None)}
        source_router.routing_table[source] = (0, None)

        while len(visited) < len(self.routers):
            visited.add(current)
            current_router = self.routers[current]
            current_router.update_routing_table(current_router)

            min_router = None
            min_cost = float('inf')

            for router_name in self.routers:
                if router_name not in visited:
                    cost, _ = current_router.routing_table[router_name]
                    if cost < min_cost:
                        min_cost = cost
                        min_router = router_name

            if min_router is None:
                break

            current = min_router

    def print_routing_tables(self):
        for router_name in self.routers:
            print(f"Routing table for Router {router_name}:")
            router = self.routers[router_name]
            for destination in router.routing_table:
                path = router.get_shortest_path(destination)
                cost, next_hop = router.routing_table[destination]
                print(f"Destination: {destination}, Cost: {cost}, Next hop: {next_hop}, Path: {' -> '.join(path)}")
            print()


# Example usage:
network = Network()

router_a = Router('A')
router_b = Router('B')
router_c = Router('C')
router_d = Router('D')
router_e = Router('E')

network.add_router(router_a)
network.add_router(router_b)
network.add_router(router_c)
network.add_router(router_d)
network.add_router(router_e)

network.link_routers('A', 'B', 1)
network.link_routers('A', 'C', 5)
network.link_routers('B', 'C', 3)
network.link_routers('B', 'D', 6)
network.link_routers('C', 'D', 2)
network.link_routers('C', 'E', 4)
network.link_routers('D', 'E', 7)

network.dijkstra('A')
network.print_routing_tables()