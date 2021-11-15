import java.util.ArrayList;
import java.util.Stack;

public class removeParenthesis {
    public static void main(String[] args){
        String s = "f";
        ArrayList<String> res = new ArrayList<>();
        ArrayList<Character> temp = new ArrayList<>();
        for(char c:s.toCharArray()){
            temp.add(c);
        }
        boolean b = valid(temp);
        System.out.println(b);
    }

    private static boolean valid(ArrayList<Character> cArray){
        int count = 0;
        for(Character c:cArray){
            if(c == '('){
                count++;
            }
            if(c == ')'){
                count--;
            }
            if(count < 0){
                return false;
            }
        }
        return count == 0;
    }
}
