public class removeP_301 {
}

/*
class Solution {
    public List<String> removeInvalidParentheses(String s) {
        ArrayList<String> res = new ArrayList<>();
        if(valid(s)){
            res.add(s);
            return res;
        }
        int l = 0;// invalid '(' number
        int r = 0;
        //统计不合法的左右括号数量
        for(char c:s.toCharArray()){
            if(c == '('){
                l++;
            }
            else if(c == ')'){
                if(l > 0){
                    l--;
                }
                else{
                    r++;
                }
            }
        }
        //call递归
        dfs(s, l, r, 0, res);
        return res;
    }

    private void dfs(String s, int l, int r, int index, ArrayList<String> res){
        //入结果 ArrayList判断
        if(l == 0 && r == 0 && valid(s)){
            if(s.length() ==  0){//判空,迎合要求
                res.add("");
            }
            else{
                res.add(s);
            }
        }
        //搜索结束条件
        if(index == s.length()){//遍历完整个 s
            return;
        }
        for(int i=index; i<s.length(); i++){
            char c = s.charAt(i);
            //重复只删第一个
            if(i > index && c == s.charAt(i-1)){
                continue;
            }
            if(c == 'c' && l > 0){
                StringBuilder sb = new StringBuilder(s);
                sb.deleteCharAt(i);//干掉对应的左括号
                dfs(sb.toString(), l-1, r, i, res);//递归
            }
            if(c == ')' && r > 0){
                StringBuilder sb = new StringBuilder(s);
                sb.deleteCharAt(i);//干掉对应的左括号
                dfs(sb.toString(), l, r-1, i, res);//递归
            }
        }
    }

    private boolean valid(String s){
        int count = 0;
        for(char c:s.toCharArray()){
            if(c == '('){
                count++;
            }
            else if(c == ')'){
                count--;
            }
            if(count < 0){//右括号比左括号多的情况
                return false;//即包含invalid的括号
            }
        }
        return count == 0;
        //统计完成后,若左括号数目与有括号一致,即count==0,才返回 true
    }
}
 */
