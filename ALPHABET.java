package CodeShef;

import java.util.Scanner;

public class ALPHABET {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sTest=sc.next();
        char ch1[]=sTest.toCharArray();
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            String s2=sc.next();
            char ch2[]=s2.toCharArray();
            int count=0;
            for (int j=0;j<ch2.length;j++){
                for (int k=0;k<ch1.length;k++){
                    if (ch2[j]==ch1[k]){
                        count++;
                    }
                }
            }
            if (count==ch2.length){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
