def calculate_parity(data):
    """
    Calculate the parity bit for the given data.
    Parity bit is set such that the total number of 1s in the data including the parity bit is even.
    """
    count_ones = 0
    for bit in data:
        if bit == '1':
            count_ones += 1
    parity_bit = '0'
    if count_ones % 2 != 0:
        parity_bit = '1'
    return parity_bit

def add_parity_bit(data):
    """
    Add the parity bit to the given data.
    """
    parity_bit = calculate_parity(data)
    return data + parity_bit

def check_parity(data_with_parity):
    """
    Check if the parity bit in the data is correct.
    """
    count_ones = 0
    for bit in data_with_parity:
        if bit == '1':
            count_ones += 1
    if count_ones % 2 == 0:
        return True
    else:
        return False

# Example usage:
data = "1101001"
data_with_parity = add_parity_bit(data)
print("Data with parity bit:", data_with_parity)

is_parity_correct = check_parity(data_with_parity)
if is_parity_correct:
    print("Parity check passed.")
else:
    print("Parity check failed.")