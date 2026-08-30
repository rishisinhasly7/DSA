class ATM {
    private long[] notes = {20, 50, 100, 200, 500};
    private long[] counts = new long[5];

    public ATM() {}

    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < 5; i++) {
            counts[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        long[] used = new long[5];
        long remaining = amount;

        // Greedy from largest note to smallest
        for (int i = 4; i >= 0; i--) {
            long take = Math.min(remaining / notes[i], counts[i]);
            used[i] = take; 
            remaining -= take * notes[i];
        }

        if (remaining != 0) {
            return new int[]{-1}; // can't make exact amount
        }

        // Commit: only deduct if successful
        int[] result = new int[5];
        for (int i = 0; i < 5; i++) {
            counts[i] -= used[i];
            result[i] = (int) used[i];
        }
        return result;
    }
}