public class medianTwoSorted_4 {
    public static void main(String [] args){

    }
}

/*
// Just do it

class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        int l1 = n1.length;
        int l2 = n2.length;
        if(l1 == 0){
            if(l2 % 2 == 0){
                return (n2[l2/2-1]+n2[l2/2])/2.0;
            }
            else{
                return n2[l2/2]/1.0;
            }
        }
        if(l2 == 0){
            if(l1 % 2 == 0){
                return (n1[l1/2-1]+n1[l1/2])/2.0;
            }
            else{
                return n1[l1/2]/1.0;
            }
        }
        //merging two arrays
        int[] m = new int[l1+l2];
        int t = 0;
        int i=0, j=0;
        while(t != l1 + l2){
            if(i == l1){
                while(j != l2){
                    m[t++] = n2[j++];
                }
                break;
            }
            if(j == l2){
                while(i != l1){
                    m[t++] = n1[i++];
                }
                break;
            }
            if(n1[i] <= n2[j]){
                m[t++] = n1[i++];
            }
            else{
                m[t++] = n2[j++];
            }
        }
        if(m.length % 2 ==0){
            return (m[m.length/2-1]+m[m.length/2])/2.0;
        }
        return m[m.length/2]/1.0;
    }
}
 */
