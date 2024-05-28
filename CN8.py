import time

class Sender:
    def __init__(self, window_size, timeout):
        self.window_size = window_size
        self.timeout = timeout
        self.base = 0
        self.next_seq_num = 0
        self.timer = None
        self.packets = []

    def send_packet(self):
        # Simulate sending packet
        print("Sending packet with seq_num:", self.next_seq_num)
        self.packets.append(self.next_seq_num)
        self.next_seq_num += 1

        if self.timer is None:
            self.start_timer()

    def start_timer(self):
        self.timer = time.time()

    def stop_timer(self):
        self.timer = None

    def timeout_handler(self):
        print("Timeout occurred, resending packets in window...")
        for seq_num in range(self.base, self.next_seq_num):
            print("Resending packet with seq_num:", seq_num)
        self.start_timer()

    def receive_ack(self, ack_num):
        print("Received ack:", ack_num)
        if ack_num >= self.base:
            self.base = ack_num + 1
            if self.base == self.next_seq_num:
                self.stop_timer()
            else:
                self.start_timer()

class Receiver:
    def __init__(self, window_size):
        self.window_size = window_size
        self.expected_seq_num = 0

    def receive_packet(self, seq_num):
        if seq_num == self.expected_seq_num:
            print("Received packet with seq_num:", seq_num)
            self.expected_seq_num += 1
        else:
            print("Received out-of-order packet with seq_num:", seq_num)
        self.send_ack()

    def send_ack(self):
        print("Sending ack:", self.expected_seq_num - 1)

def main():
    window_size = 4
    timeout = 3

    sender = Sender(window_size, timeout)
    receiver = Receiver(window_size)

    # Simulate sending packets
    for _ in range(10):
        sender.send_packet()
        time.sleep(1)

    # Simulate receiving acks
    for seq_num in sender.packets:
        receiver.receive_packet(seq_num)

if __name__ == "__main__":
    main()
