public class addStrings_415 {
    public static void main(String[] args){
        String n1 = "123";
        String n2 = "11";
        int i = n1.length()-1;
        int j = n2.length()-1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;  //进位

        while(i>=0 || j>=0){
            int v1 = (i>=0) ? n1.charAt(i)-'0' : 0;
            int v2 = (j>=0) ? n2.charAt(j)-'0' : 0;
            int sum = v1 + v2 + carry;
            carry = (sum>=10) ? 1 : 0;
            sum = (sum>=10) ? sum-10: sum;
            sb.append(sum);
            i--;
            j--;
        }

        if(carry == 1){
            sb.append(carry);
        }
        System.out.println(sb.reverse().toString());
        //return sb.reverse().toString();
    }
}

//m2:
//妙 1, 用StringBuilder & reverse()
/*
class Solution {
    public String addStrings(String n1, String n2) {
        int i = n1.length()-1;
        int j = n2.length()-1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;  //进位

        while(i>=0 || j>=0 || carry>0){//最后只剩一carry的情况并入
            int v1 = 0;
            int v2 = 0;
            if(i >= 0){
                v1 = n1.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                v2 = n2.charAt(j) - '0';
                j--;
            }
            int sum = v1 + v2 + carry;
            carry = (sum>=10) ? 1 : 0;
            sum = (sum>=10) ? sum-10: sum;
            sb.append(sum);
        }
        /*并到上面 while
        if(carry == 1){
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
*/