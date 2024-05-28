import time
import random

class StopAndWaitARQ:
    def __init__(self, timeout=1):
        self.timeout = timeout

    def send(self, frame):
        print("Sending frame:", frame)
        time.sleep(random.uniform(0.5, 1))  # Simulating transmission delay
        ack_received = False
        start_time = time.time()
        while not ack_received:
            if time.time() - start_time >= self.timeout:
                print("Timeout occurred. Resending frame:", frame)
                time.sleep(random.uniform(0.5, 1))  # Simulating transmission delay
                start_time = time.time()
            else:
                ack_received = self.receive_ack()

    def receive_ack(self):
        # Simulating acknowledgment reception, 80% chance of success
        if random.random() < 0.8:
            print("Acknowledge received.")
            return True
        else:
            print("Acknowledge not received.")
            return False

# Example usage
if __name__ == "__main__":
    arq = StopAndWaitARQ(timeout=1)  # Set timeout to 1 second
    frames_to_send = ["Frame1", "Frame2", "Frame3", "Frame4", "Frame5"]
    for frame in frames_to_send:
        arq.send(frame)
    print("All frames sent successfully.")