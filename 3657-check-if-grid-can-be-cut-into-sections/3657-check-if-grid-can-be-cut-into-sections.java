class Solution {
     static class Pair {
        int coord, type; // type: 1 (start), -1 (end)
        Pair(int coord, int type) {
            this.coord = coord;
            this.type = type;
        }
    }

    private boolean countDistinctCuts(List<Pair> coordinates) {
        int active = 0;
        int distinctSegments = 0;

        for (Pair coord : coordinates) {
            if (coord.type == 1) {  // Start of a segment
                if (active == 0) distinctSegments++;  // New segment begins
                active++;
            } else {  // End of a segment
                active--;
            }
        }

        return distinctSegments >= 3; // Ensure at least 3 completely separate cuts
    }

    public boolean checkValidCuts(int n, int[][] rectangles) {
        List<Pair> yCoordinates = new ArrayList<>();
        List<Pair> xCoordinates = new ArrayList<>();

        for (int[] rect : rectangles) {
            yCoordinates.add(new Pair(rect[1], 1));  // Start of rectangle (y)
            yCoordinates.add(new Pair(rect[3], -1)); // End of rectangle (y)
            xCoordinates.add(new Pair(rect[0], 1));  // Start of rectangle (x)
            xCoordinates.add(new Pair(rect[2], -1)); // End of rectangle (x)
        }

        // Sort: First by coordinate, then by type (-1 should come before 1 for correct counting)
        Comparator<Pair> comparator = (a, b) -> {
            if (a.coord == b.coord) return Integer.compare(a.type, b.type);
            return Integer.compare(a.coord, b.coord);
        };

        yCoordinates.sort(comparator);
        xCoordinates.sort(comparator);

        return countDistinctCuts(yCoordinates) || countDistinctCuts(xCoordinates);
    }
}