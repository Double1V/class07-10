class Solution {

    public static String isSortedAndHow(int[] array) {
        int len = array.length;
        int detector = 0;
        for (int i = 1; i < len; ++i) {
            if (array[i - 1] <= array[i]) {
                detector = detector + 1;
            }
        }
        if (detector == len - 1) {
            return "yes, ascending";
        }
        detector = 0;
        for (int i = 1; i < len; ++i) {
            if (array[i - 1] >= array[i]) {
                detector = detector + 1;
            }
        }
        if (detector == len - 1) {
            return "yes, descending";
        }
        return "no";
    }

}