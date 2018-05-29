public class findAnagram {
    public int check(int[] s, int[] t) {
        int slength = s.length;
        int tlength = t.length;
        boolean match = false;
        for (int start = 0; start < slength - tlength + 1; start++) {
            for (int i = 0; i < tlength; i++) {
                if (t[i] != s[start + i]) {
                    break;
                }
                if (i == tlength - 1) {
                    match = true;
                }
            }
            if (match) {
                return start;
            }

        }
        return -1;
    }
}
