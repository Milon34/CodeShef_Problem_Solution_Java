package CodeShef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FLOW005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            List<Integer> list=new ArrayList<>();
            for (int i=0;i<6;i++){
                list.add(100);
                list.add(50);
                list.add(10);
                list.add(5);
                list.add(2);
                list.add(1);
            }
            int count=0;
            while (n!=0){
                for (int i=0;i<list.size();i++) {
                    count += n / list.get(i);
                    n =n%list.get(i);
                    if (n==0){
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
