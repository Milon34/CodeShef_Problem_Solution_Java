package CodeShef;

import java.util.Scanner;
public class TWOSTR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            String s1=sc.next();
            char[] ch1=s1.toCharArray();
            String s2=sc.next();
            char[] ch2=s2.toCharArray();
            int count=0;
            if (ch1.length==ch2.length) {
                for (int i = 0; i < s1.length(); i++) {
                    if ((ch1[i] == ch2[i]) || ch1[i] == '?' || ch2[i] == '?') {
                        count++;
                    }
                }
            }
            if (count==s1.length()){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
