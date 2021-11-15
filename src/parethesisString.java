public class parethesisString {
    public static void main(String[] args){
        String s = "(((()))())))*))())()(**(((())(()(*()((((())))*())(())*(*(()(*)))()*())**((()(()))())(*(*))*))())";
        boolean b = checkValidString(s);
        System.out.println(b);
    }
    private static boolean checkValidString(String s) {
        int l = 0; //least number of )
        int m = 0; // most number of )
        for(char i:s.toCharArray()){
            if(i == '('){
                l+=1;
                m+=1;
            }
            else if(i == '*'){
                if(l > 0){
                    l-=1;
                }
                m+=1;
            }
            else{
                if(l > 0){
                    l-=1;
                }
                m-=1;
            }

            if(m<0){
                return false;
            }
        }
        return l==0;
    }
}
