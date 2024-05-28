import time

class StopAndWaitProtocol:
    def __init__(self, timeout=1):
        self.timeout = timeout

    def send(self, data):
        print("Sending data:", data)
        time.sleep(0.5)  # Simulating transmission delay
        ack_received = False
        while not ack_received:
            ack = input("Enter 'ACK' to acknowledge receipt: ")
            if ack.strip().upper() == 'ACK':
                ack_received = True
                print("ACK received.")
            else:
                print("Invalid acknowledgment. Retrying...")

    def receive(self):
        received_data = input("Enter received data: ")
        time.sleep(0.5)  # Simulating reception delay
        print("Data received:", received_data)
        time.sleep(0.5)  # Simulating processing delay
        print("Sending ACK...")
        time.sleep(0.5)  # Simulating transmission delay
        print("ACK sent.")

# Example usage
sender = StopAndWaitProtocol()
receiver = StopAndWaitProtocol()

data_to_send = "Hello, world!"
sender.send(data_to_send)

receiver.receive()