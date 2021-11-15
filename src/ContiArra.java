import java.util.ArrayList;

public class ContiArra {
    public static void main(String[] args){
        ArrayList<Integer> tran = new ArrayList<>();
        int[] nums = {0,1};
        for(int i:nums){
            if(i == 0){
                tran.add(-1);
            }
            else{
                tran.add(1);
            }
        }
        int sum = 0;
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        do{
            sum += tran.get(i);
            if(sum == 0){
                list.add(i);
            }
            i++;
        }while(i<tran.size());
        int res1;
        if(list.size() == 1){
            res1 = list.get(0);
        }
        //int n = 0;
        //Integer res;
        //res = list.get(list.size());
        //res1 = res.intValue();
        //return res1;
    }
}
