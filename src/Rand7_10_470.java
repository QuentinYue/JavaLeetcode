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

Method3:
//把 9 份也利用起来
class Solution extends SolBase {
    public int rand10() {
        //思路三:一开始两个 rand7()=rand49(), 剩下 9 个
        //相当于 rand9(),再 rand7()一次=63 剩下 3 个
        //相当于 rand3(),再 rand7()一次=21 剩下 1 个,不管了,如此就重来
        int a = 0, b = 0;
        int index = 0;
        while(true){
            a = rand7();
            b = rand7();
            index = 7 * (a - 1) + b - 1;
            if(index <= 39){
                return index % 10 + 1;
            }
            else{//rand9(), 再 rand7()
                a = index - 39; // index 1~9
                b = rand7();
                index = 7 * (a - 1) + b - 1; // index 0~62
                if(index <= 59){
                    return index % 10 + 1;
                }
                else{//rand3(), 再 rand7()
                    a = index - 59; // index 1~3
                    b = rand7();
                    index = 7 * (a - 1) + b - 1; // index 0~20
                    if(index <= 19){
                        return index % 10 + 1;
                    }
                }
            }
        }
    }
}
 */
