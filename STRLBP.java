package CodeShef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class STRLBP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-- >0){
            String s=sc.next();
            char ch[]=s.toCharArray();
            List<Character> l=new ArrayList<>();
            for (int i=0;i<s.length();i++){
                l.add(ch[i]);
            }
            int count=0;
             for (int i=0;i<l.size()-1;i++){
                 if (l.get(i)!=l.get(i+1)){
                     count++;
                 }
             }
             if (count>2){
                 System.out.println("non-uniform");
             }else {
                 System.out.println("uniform");
             }

        }
    }
}
