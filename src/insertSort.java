public class insertSort {
    public static void main(String[] args){
        int temp = 0;

        int[] a = {3, 2, 8, 5, 9, 1, 7, 4};

        for(int i = 1; i < a.length; i++){  //插入排序从数组[1](第二个)位置开始,小的往前放
            for(int j = i; j > 0; j--){
                if(a[j] < a[j-1]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }

        for(int i = 0; i < 8; i++){
            System.out.print(a[i] + " ");
        }
    }
}
