package CodeShef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSUB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long n=sc.nextLong();
            String s=sc.next();
            char ch[]=s.toCharArray();
            long count=0;
            List<Character> l=new ArrayList<>();
            for (long i=0;i<s.length();i++){
                if (ch[(int) i]=='1'){
                    l.add( ch[(int) i]);
                    //count++;
                }
            }

            for (long i=0;i<l.size();i++){
                for (long j=i;j<l.size();j++){
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
