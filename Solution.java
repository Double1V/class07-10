public class Solution {
    public static String vaporcode(String s) {
        int length = s.length();
        s = s.toUpperCase();
        String result = "";
        for (int i = 0; i < length; ++i) {
            if (Character.isWhitespace(s.charAt(i))) {
                result = result;
            } else {
                result = result + (s.charAt(i)) + "  ";
            }
        }
        length = result.length();
        return result.substring(0, length - 2);
    }
  