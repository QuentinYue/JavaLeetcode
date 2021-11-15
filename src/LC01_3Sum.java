import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class LC01_3Sum {

    //复制的代码:将输入的 ArrayList 转化为 int 数组
    public static Integer[] convertToIntArray(String[] arr) {
        int index = 0;
        Integer[] numbers = new Integer[arr.length];

        for (int i = 0; i < arr.length; ++i) {
            try {
                numbers[index] = Integer.parseInt(arr[i]);
                ++index;
            } catch (NumberFormatException nfe) {
                // This part skips invalid input, which is not a number.
                // by not saving the skipped element to the array.
            }
        }
        return numbers;
    }
    //////////////////

    public static void main(String[] args){
        int[] a = {-1,0,1,2,-1,-4};

        System.out.println("Input numbers: ");
        ArrayList<String> intList = new ArrayList<String>(); //存输入数据
        Scanner inputArr = new Scanner(System.in);
        String s = inputArr.nextLine();
        // Split sentence into words.
        String[] arr = s.split("\\W+");
        // Convert string array of numbers to int.
        Integer[] numbers = convertToIntArray(arr);
        System.out.println(Arrays.toString(numbers));
        ////

        ArrayList<String> outList = new ArrayList<String>(); //存输出数据

        /*for(int i=0; i<a.length; i++){
            for(int j=1; j<a.length; j++){
                for(int k=2; k<a.length; k++){
                    if(a[i] + a[j] + a[k] == 0){
                        outList.add(a[i]);
                        outList.add(a[j]);
                        outList.add(a[k]);
                    }
                }
            }
        }*/

        for(int i=0; i<a.length-3; i++){
            for(int j=i+1; j<a.length-1; j++)
            if(a[i] + a[j] + a[j+1] == 0){
                outList.add("[");
                outList.add(String.valueOf(a[i]));
                outList.add(String.valueOf(a[j]));
                outList.add(String.valueOf(a[j+1]));
                outList.add("]");
            }
        }



        for(String i : outList){
            System.out.println(i);
        }
    }
}
