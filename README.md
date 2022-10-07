# class07-10

## kata task1

[Task link](https://www.codewars.com/kata/580a4734d6df748060000045)    
My solution

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
   
My fav solution

    class Solution {
  
    public static String isSortedAndHow(int[] array) {
      boolean desc = false;
      boolean asc = false;
      for(int i = 1; i < array.length; i++) {
        if(array[i] > array[i-1]) asc = true;
        if(array[i] < array[i-1]) desc = true;
      }
      if(asc && !desc) return "yes, ascending";
      if(desc && !asc) return "yes, descending";
      return "no";
    }
  
    }
