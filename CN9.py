class LinkStateRouting:
    def __init__(self, num_nodes):
        self.num_nodes = num_nodes
        self.adjacency_matrix = [[float('inf')] * num_nodes for _ in range(num_nodes)]

    def add_link(self, node1, node2, cost):
        self.adjacency_matrix[node1][node2] = cost
        self.adjacency_matrix[node2][node1] = cost

    def remove_link(self, node1, node2):
        self.adjacency_matrix[node1][node2] = float('inf')
        self.adjacency_matrix[node2][node1] = float('inf')

    def dijkstra(self, src):
        visited = [False] * self.num_nodes
        distance = [float('inf')] * self.num_nodes
        distance[src] = 0

        for _ in range(self.num_nodes):
            u = self.min_distance_vertex(distance, visited)
            visited[u] = True

            for v in range(self.num_nodes):
                if (not visited[v]) and (self.adjacency_matrix[u][v] != float('inf')) and \
                   (distance[u] + self.adjacency_matrix[u][v] < distance[v]):
                    distance[v] = distance[u] + self.adjacency_matrix[u][v]

        return distance

    def min_distance_vertex(self, distance, visited):
        min_distance = float('inf')
        min_vertex = -1

        for v in range(self.num_nodes):
            if (not visited[v]) and (distance[v] < min_distance):
                min_distance = distance[v]
                min_vertex = v

        return min_vertex


# Example Usage:
num_nodes = 5
lsr = LinkStateRouting(num_nodes)

# Adding links
lsr.add_link(0, 1, 10)
lsr.add_link(0, 2, 5)
lsr.add_link(1, 2, 3)
lsr.add_link(1, 3, 1)
lsr.add_link(2, 3, 8)
lsr.add_link(3, 4, 4)

# Calculating shortest paths from node 0
shortest_paths_from_node_0 = lsr.dijkstra(0)
print("Shortest paths from node 0:", shortest_paths_from_node_0)
