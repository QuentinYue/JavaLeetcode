public class Rand7_10_470 {
}

/*
class Solution extends SolBase {
    public int rand10() {
        int index = (int) Double.POSITIVE_INFINITY;//无限大
        while(index > 39){ // 原图,所有数值应该减 1,所以应该大于 39
            index = 7 * (rand7() - 1) + rand7()-1;
        }
        return index % 10 + 1;
    }
}

Method2:
class Solution extends SolBase {
    public int rand10() {
        //思路二:分解成 rand2() 和 rand5()
        int a = 0, b = 0;
        while(true){
            a = rand7();
            if(a <= 3){
                b = rand7();
                if(b <= 5){
                    return b;
                }
            }
            else if(a <= 6){
                b = rand7();
                if(b <= 5){
                    return b + 5;
                }
            }
        }
    }
}
 */
