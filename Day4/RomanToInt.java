import java.util.*;

//Roman to Integer

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 */

public class RomanToInt{
   

    private static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int size = s.length();

        int num = map.get(s.charAt(size-1));

        for(int i = size-2; i >= 0; i--){
            if(map.get(s.charAt(i)) > map.get(s.charAt(i+1)) ){
                num += map.get(s.charAt(i));
            }else{
                num -= map.get(s.charAt(i));
            }
        }

        return num;
    }

    //DRIVER CODE
    public static void main(String[] args) {
       
        Scanner in =  new Scanner(System.in);

        System.out.print("Roman numerals symbols: \nI, V, X, L, C, D and M.\nEnter Roman Number: ");
        String s = in.nextLine();

        int num = romanToInt(s);

        System.out.println("Roman: "+s+"\nInteger: "+num);
    }
}