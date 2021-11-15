public class Bubble {
    public static void main(String[] args){ //冒泡
        int temp = 0;

        int[] a = {3, 2, 8, 5, 9, 1, 7};

        for(int i = a.length; i > 0; i--){
            for(int j = 0; j < i - 1; j++){
                if(a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < 7; i++){
            System.out.print(a[i] + " ");
        }
    }
}
