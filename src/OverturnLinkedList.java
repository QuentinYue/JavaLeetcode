public class OverturnLinkedList {
    public static void main(String[] args) {
        System.out.println("Hi, Quentin! Welcome to Edmonton!");

        int[] a = {3, 2, 8, 5, 9, 1, 7};

        /*for(int i = 0; i < 7; i++){
            System.out.print(a[i] + " ");
            System.out.println(" ");
        }*/

        int temp = 0;
        int min = 0;        //选择排序

        for(int i = 0; i < 5; i++){
            for(int j = i+1; j < 7; j++){
                if(a[min] > a[j]) {
                    min = j;
                }
            }
            System.out.println(min);
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
            min = i+1;
        }

        for(int i = 0; i < 7; i++){
            System.out.print(a[i] + " ");
        }
    }
}
