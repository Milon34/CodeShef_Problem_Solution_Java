package CodeShef;

import java.util.Arrays;
import java.util.Scanner;

public class LAPIN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            String s=sc.next();
            int length=s.length();
            String a=s.substring(0,length/2);
            int subLength=a.length();
            String b=s.substring(length-subLength);
            String m=a;
            String n=b;
            char ch1[]=m.toCharArray();
            char ch2[]=n.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1,ch2)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
