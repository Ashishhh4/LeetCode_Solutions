class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int l = 0; // Left boundary of the window
        int res = 0;

        for (int i = 0; i < n + k - 1; i++) {
            // Use modulo to handle the circular nature of the array
            if (i > 0 && colors[i % n] == colors[(i - 1) % n]) {
                l = i; // Reset left pointer when the sequence breaks
            }
            
            // Ensure window size doesn't exceed k
            if (i - l + 1 > k) {
                l++; 
            }

            // If we found a valid alternating group of size k, count it
            if (i - l + 1 == k) {
                res++;
            }
        }
        return res;
    }
}