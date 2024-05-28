def hamming_distance(str1, str2):
    if len(str1) != len(str2):
        raise ValueError("Strings must be of equal length")
    return sum(c1 != c2 for c1, c2 in zip(str1, str2))

def min_hamming_distance(data):
    min_distance = float('inf')
    for i in range(len(data)):
        for j in range(i+1, len(data)):
            distance = hamming_distance(data[i], data[j])
            if distance < min_distance:
                min_distance = distance
    return min_distance

# Example usage:
data = ["10101", "11001", "01010", "11100", "10011"]
min_dist = min_hamming_distance(data)
print("Minimum Hamming distance:", min_dist)