package CodeShef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KOL15A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int t=0;t<n;t++){
            String s=sc.next();
            char ch[]=s.toCharArray();
            int sum=0;
            for (int i=0;i<s.length();i++){
                if (ch[i]>=48&&ch[i]<=57){
                    sum+=ch[i]-48;
                }
            }
            System.out.println(sum);
        }
    }
}
class Ftest{
    static int birthday(List<Integer> s, int d, int m) {
        int sum = 0,ways=0;
        for (int i=0;i<m;i++){
            sum += s.get(i);
        }
        for (int i=0;i<s.size()-m+1;i++) {
            if (sum==d) {
                ways++;
            }
            if (i+m <s.size()){
                sum =sum-s.get(i)+s.get(i+m);
            }
        }
        return ways;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for (int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int d,m;
        d=sc.nextInt();
        m=sc.nextInt();
        int sum = 0,ways=0;
        for (int i=0;i<m;i++){
            sum += l.get(i);
        }
        for (int i=0;i<l.size()-m+1;i++) {
            if (sum==d) {
                ways++;
            }
            if (i+m <l.size()){
                sum =sum-l.get(i)+l.get(i+m);
            }
        }
        System.out.println(ways);
    }
}