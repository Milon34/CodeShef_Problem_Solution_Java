package CodeShef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRICECON {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
//            int arr[]=new int[n];
            List<Integer> l=new ArrayList<>();
            int sum1=0;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                sum1+=a;
                l.add(a);
            }

            for (int i=0;i<n;i++){
                if (l.get(i)>k){
                    l.set(i,k);
                }
            }
            int sum2=0;
            for (int i=0;i<n;i++){
                sum2+=l.get(i);
            }
            System.out.println(Math.abs(sum2-sum1));
        }
    }
}
