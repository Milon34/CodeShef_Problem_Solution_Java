package CodeShef;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DEVARRAY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int arrN[]=new int[n];
        int arrT[]=new int[t];
        for (int i=0;i<n;i++){
            arrN[i]=sc.nextInt();
        }
        Arrays.sort(arrN);
        HashSet<Integer> ha=new HashSet<>();
        for (int i=0;i<t;i++){
            ha.add(sc.nextInt());
        }
        HashSet<Integer> haF=new HashSet<>();
        int m=arrN[0];
        for (int i=m;i<=arrN[arrN.length-1];i++){
            haF.add(i);
        }
        if (ha.size()==haF.size()){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
