class SeatManager {
    private PriorityQueue<Integer> freeSeats;
    private int nextNew;

    public SeatManager(int n) {
        freeSeats = new PriorityQueue<>();
        nextNew = 1;
    }

    public int reserve() {
        if (!freeSeats.isEmpty()) {
            return freeSeats.poll();
        }
        return nextNew++;
    }

    public void unreserve(int seatNumber) {
        freeSeats.offer(seatNumber);
    }
}