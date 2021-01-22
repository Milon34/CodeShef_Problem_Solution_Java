package CodeShef;

import java.util.Scanner;

public class LONGSEQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            String s=sc.next();
            char ch[]=s.toCharArray();
            int count1=0,count0=0;
            for (int j=0;j<ch.length;j++){
                if (ch[j]=='1'){
                    count1++;
                }else if (ch[j]=='0'){
                    count0++;
                }
            }
            if (count1==1||count0==1){
                System.out.println("Yes");
            }else
            {
                System.out.println("No");
            }


        }

    }
}
