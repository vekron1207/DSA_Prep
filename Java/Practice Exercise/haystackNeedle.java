class haystackNeedle {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean matchstring = true;

            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    matchstring = false;
                    break;
                }
            }
            if (matchstring == true) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "llo";

        haystackNeedle obj = new haystackNeedle();

        int result = obj.strStr(haystack, needle);
        System.out.println(result);
    }
}
