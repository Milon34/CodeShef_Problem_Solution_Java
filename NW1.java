package CodeShef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int days = sc.nextInt();
            String day = sc.next();
           // int index_day = 0;
            int[] ans =new int[7];
            List<String> s=new ArrayList<>();
            s.add("mon");
            s.add("tues");
            s.add("wed");
            s.add("thurs");
            s.add("fri");
            s.add("sat");
            s.add("sun");
            int index_day=s.indexOf(day);
            while (days-->0){
                ans[index_day]++;
                index_day++;
                if(index_day>6){
                    index_day=0;
                }
            }
            for (int j = 0; j < 7; j++) {
                System.out.print(ans[j]+" ");
            }
            //System.out.println(ans[s.indexOf(day)]);
            System.out.println();
        }
    }
}
