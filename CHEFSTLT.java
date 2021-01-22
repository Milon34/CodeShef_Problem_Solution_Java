package CodeShef;

import java.util.Scanner;

public class CHEFSTLT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            char ch1[] = sc.next().toCharArray();
            char ch2[] = sc.next().toCharArray();
            int count = 0;
            for (int i = 0; i < ch1.length; i++) {
                if ((ch1[i] != ch2[i]) || (ch1[i] == '?') || (ch2[i] == '?')) {
                    count++;
                }
            }
            int count1=0;
            for (int i = 0; i < ch1.length; i++) {
                if ((ch1[i]=='?'&&ch2[i]!='?')||(ch1[i]!='?'&&ch2[i]=='?')||(ch1[i]=='?'&&ch2[i]=='?')||(ch1[i]==ch2[i])){
                    count1++;
                }
            }
            System.out.println((ch1.length-count1)+" "+count);
        }
    }
}
