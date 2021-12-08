public class medianTwoSortedArrays_4 {
    public static void main(String [] args){

    }
}
/* Moving window
class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        if(n1.length > n2.length){// 保证第一个参数中数组的长度更小
            return findMedianSortedArrays(n2, n1);
        }

        int low = 0;
        int high = n1.length;//low, high 都是对应n1 的
        int k = (n1.length+n2.length+1)/2;//见图 2
        int n1Mid = 0, n2Mid = 0;
        while(low <= high){
            n1Mid = low + (high - low)/2;
            n2Mid = k - n1Mid;//第二个分界随第一个变动
            if(n1Mid > 0 && (n1[n1Mid-1] > n2[n2Mid])){//n1 的分界要左移
                high = n1Mid - 1;
            }
            else if(n1Mid != n1.length &&(n1[n1Mid] < n2[n2Mid-1])){//n1 的分界要右移
                low = n1Mid + 1;
            }
            else{//分界线没毛病了,退出循环
                break;
            }
        }
        //左找最大
        int midLeft = 0;
        if(n1Mid == 0){
            midLeft = n2[n2Mid - 1];
        }
        else if(n2Mid == 0){
            midLeft = n1[n1Mid - 1];
        }
        else{
            midLeft = Math.max(n1[n1Mid - 1], n2[n2Mid - 1]);
        }
        if((n1.length+n2.length) % 2 == 1){//长度和为基数,直接返回中间那个
            return (double) midLeft;
        }

        //长度和为偶数,才需要 midRight
        //右找最小
        int midRight = 0;
        if(n1Mid == n1.length){
            midRight = n2[n2Mid];
        }
        else if(n2Mid == n2.length){
            midRight = n1[n1Mid];
        }
        else{
            midRight = Math.min(n1[n1Mid], n2[n2Mid]);
        }
        return (double) (midLeft+midRight)/2;
    }
}

 */