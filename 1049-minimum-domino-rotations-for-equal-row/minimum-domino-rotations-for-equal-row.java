class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int ans = Math.min(
            getRotations(tops[0], tops, bottoms),
            getRotations(bottoms[0], tops, bottoms)
        );
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int getRotations(int x, int[] tops, int[] bottoms) {
        int topRot = 0, bottomRot = 0;
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != x && bottoms[i] != x) return Integer.MAX_VALUE;
            if (tops[i] != x) topRot++;
            if (bottoms[i] != x) bottomRot++;
        }
        return Math.min(topRot, bottomRot);
    }
}

