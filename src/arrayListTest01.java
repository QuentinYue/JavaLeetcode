import java.util.ArrayList;

public class arrayListTest01 {
    public static void main(String[] args){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(4);
        myNumbers.add(3);
        myNumbers.add(2);
        myNumbers.add(1);

        //myNumbers.remove(3);

        myNumbers.set(0, 8);

        for(int i : myNumbers){
            System.out.println(i);
        }

        System.out.println(myNumbers.get(1));
    }
}
