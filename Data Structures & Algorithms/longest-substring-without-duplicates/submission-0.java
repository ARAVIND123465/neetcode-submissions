class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            boolean[] vis = new boolean[256];

            for (int j = i; j < n; j++) {
                if (vis[s.charAt(j)])
                    break;

                vis[s.charAt(j)] = true;
                res = Math.max(res, j - i + 1);
            }
        }

        return res;
    }
}

