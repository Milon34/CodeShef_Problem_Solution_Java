package CodeShef;

import java.util.Scanner;

public class TTENIS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            char ch[]=sc.next().toCharArray();
            int count1=0,count0=0;
            for (int i=0;i<ch.length;i++){
                if (ch[i]=='1'){
                    count1++;
                }else {
                    count0++;
                }
            }
            if (count1>count0){
                System.out.println("WIN");
            }else {
                System.out.println("LOSE");
            }
        }
    }
}
