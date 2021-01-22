package CodeShef;

import java.util.Scanner;

public class SPLITIT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            char ch[]=sc.next().toCharArray();
            boolean check=false;
            for (int i=0;i<n-1;i++){
                if (ch[i]==ch[n-1]){
                    check=true;
                }
            }
            if (check){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
