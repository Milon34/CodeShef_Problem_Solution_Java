package CodeShef;

import java.util.Scanner;

public class STRPALIN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-- >0){
            String s1,s2;
            s1=sc.next();
            s2=sc.next();
            char ch1[]=s1.toCharArray();
            char ch2[]=s2.toCharArray();
            boolean check=false;
            for (int i=0;i<ch1.length;i++){
                for (int j=0;j<ch2.length;j++){
                    if (ch1[i]==ch2[j]){
                        check=true;
                        break;
                    }
                }
            }
            if (check){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
