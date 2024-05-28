import sys

class Node:
    def __init__(self, name):
        self.name = name
        self.neighbors = {}
        self.routing_table = {}

    def add_neighbor(self, neighbor, cost):
        self.neighbors[neighbor] = cost

    def update_routing_table(self, destination, cost):
        self.routing_table[destination] = cost

    def print_routing_table(self):
        print(f"Routing table for Node {self.name}:")
        print("Destination\tCost")
        for dest, cost in self.routing_table.items():
            print(f"{dest}\t\t{cost}")

class Network:
    def __init__(self):
        self.nodes = {}

    def add_node(self, name):
        if name not in self.nodes:
            self.nodes[name] = Node(name)

    def add_edge(self, node1, node2, cost):
        self.nodes[node1].add_neighbor(node2, cost)
        self.nodes[node2].add_neighbor(node1, cost)

    def update_routing_tables(self):
        for node_name, node in self.nodes.items():
            node.routing_table = {neighbor: cost for neighbor, cost in node.neighbors.items()}
            node.routing_table[node_name] = 0  # Distance to itself is 0

    def distance_vector_routing(self):
        self.update_routing_tables()
        updated = True
        while updated:
            updated = False
            for node_name, node in self.nodes.items():
                for neighbor, cost in node.neighbors.items():
                    for dest, dist in self.nodes[neighbor].routing_table.items():
                        if dest != node_name:
                            new_cost = cost + dist
                            if (dest not in node.routing_table) or (new_cost < node.routing_table[dest]):
                                node.update_routing_table(dest, new_cost)
                                updated = True

    def print_network_status(self):
        for node_name, node in self.nodes.items():
            node.print_routing_table()
            print()

# Example usage:
network = Network()

# Add nodes
network.add_node("A")
network.add_node("B")
network.add_node("C")
network.add_node("D")

# Add edges
network.add_edge("A", "B", 1)
network.add_edge("A", "C", 5)
network.add_edge("B", "C", 3)
network.add_edge("B", "D", 6)
network.add_edge("C", "D", 2)

# Run Distance Vector Routing algorithm
network.distance_vector_routing()

# Print routing tables for each node
network.print_network_status()