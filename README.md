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

## kata task2

[Task link](https://www.codewars.com/kata/5966eeb31b229e44eb00007a)    
My solution

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
  
        }
        
My fav solution

        interface Solution {
            static String vaporcode(String s) {
                s = s.replace(" ", "").replace("", "  ");
                return s.toUpperCase().substring(2, s.length() - 2);
            }
        }
