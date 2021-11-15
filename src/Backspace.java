import java.util.ArrayList;
import java.util.Stack;

public class Backspace {
    public static void main(String[] args){
        //String s = "ab#c";
        //String t = "ab#c";
        String s = "a##c";
        String t = "#a#c";
        //String t = "ab#c";
        ArrayList<Character> l1 = toArrList(s);
        Stack<Character> stack = getResultStack(l1);

        ArrayList<Character> l2 = toArrList(t);
        Stack<Character> stack2 = getResultStack(l2);

        boolean b = false;
        b = stack.equals(stack2);
        System.out.println(b);
    }

    private static ArrayList toArrList(String s){
        char [] c = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<c.length; i++){
            list.add(c[i]);
        }
        return list;
    }

    private static Stack getResultStack(ArrayList<Character> list){
        Stack<Character> stack = new Stack<>();
        for(Character c:list){
            if(c!='#'){
                stack.push(c);
            }
            else {
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        return stack;
    }



}
