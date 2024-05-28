def detect_error(data):
    # Calculate the number of redundant bits
    r = 0
    while 2 ** r <= len(data) + r + 1:
        r += 1
    
    # Create a list to store parity bits
    parity_bits = []
    for i in range(r):
        parity_bits.append(2 ** i)

    # Initialize error position
    error_pos = 0

    # Calculate parity bits
    for i in range(r):
        xor = 0
        for j in range(1, len(data) + 1):
            if j & parity_bits[i]:
                xor ^= int(data[j - 1])

        if xor != 0:
            error_pos += parity_bits[i]

    # Correct the error
    if error_pos > 0:
        data = list(data)
        if data[error_pos - 1] == '0':
            data[error_pos - 1] = '1'
        else:
            data[error_pos - 1] = '0'
        print("Error detected and corrected at position:", error_pos)
        print("Corrected data:", ''.join(data))
    else:
        print("No error detected.")

# Test the function
data = "10101010101"  # Example data with a single bit error
detect_error(data)
