package CodeShef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SIMPSTAT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n,k;
            n=sc.nextLong();
            k=sc.nextLong();
            long arr[]=new long[(int) n];
            List<Long> l=new ArrayList<>();
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                l.add(arr[i]);
            }
            long valueK=2*k;
            Collections.sort(l);
            for (long i=0;i<valueK/2;i++){
                l.remove(l.get((int) i));
                l.remove(l.get(l.size()-1));
            }
            double sum=0;
            for (int i=0;i<l.size();i++){
                sum+=l.get(i);
            }
            System.out.printf("%.6f\n",sum/l.size());

        }
    }
}
