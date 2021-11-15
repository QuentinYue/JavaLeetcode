import static java.util.Arrays.sort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class queueConsByHeight {
    public static void main(String[] args){


        int[][] people = {{9,0},{7,0},{1,9},{3,0},{2,7},{5,3},{6,2},{3,4},{6,0},{5,2}};
        sort(people, (a, b) -> (b[0] == a[0])?a[1] - b[1]:b[0] - a[0]); //a[0] - b[0]即为升序排列,(身高相同则从小到大排序?) M!!!!!
        for(int i=0; i<10; i++){
            for(int j=0; j<2; j++){
                System.out.print(people[i][j]);
            }
        }
        //int[][] res;
        List<int[]> res = new ArrayList<>();
        for(int[] i : people){
            res.add(i[1], i);
            //System.out.println(i[1]);
        }
        //res.toArray(new int[0][]);

        System.out.println("\n");

    }
}
