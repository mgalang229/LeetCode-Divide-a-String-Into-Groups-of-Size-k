class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length(), len = (n+k-1)/k;
        String[] ans = new String[len];
        Arrays.fill(ans, "");
        int id = 0;
        for (int i = 0; i < n; i++) {
            ans[id] += s.charAt(i);
            if ((i + 1) % k == 0) {
                id++;
            }
        }
        if (id < len) {
            while (ans[id].length() < k) {
                ans[id] += fill;
            }
        }
        return ans;
    }
}
