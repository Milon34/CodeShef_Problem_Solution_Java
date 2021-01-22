package CodeShef;

import java.util.Scanner;

public class ENCMSG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s1 = "abcdefghijklmnopqrstuvwxyz";
            String s2 = "zyxwvutsrqponmlkjihgfedcba";
            char ch[] = sc.next().toCharArray();
            int a = 0, b = 1, temp;
            for (int i = 0; i < ch.length / 2; i++) {
                temp = ch[a];
                ch[a] = ch[b];
                ch[b] = (char) temp;
                a = b + 1;
                b = a + 1;
            }

            for (int i=0;i<ch.length;i++){
                ch[i]= (char) (122-(ch[i]-97));
            }
            for (char c:ch){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
