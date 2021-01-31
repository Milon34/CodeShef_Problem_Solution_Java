package CodeShef;

import java.util.Scanner;

public class PASSWD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            String s=sc.next();
            char ch[]=s.toCharArray();
            int count1=0,count2=0,count3=0,count4=0;
            for(int i=1;i<s.length()-1;i++){
                if(ch[i]>=97&&ch[i]<=122)
                    count1++;
                else if(ch[i]>=65&&ch[i]<=90)
                    count2++;
                else if(ch[i]>=48&&ch[i]<=57)
                    count3++;
                else if(ch[i]==64||ch[i]==63||ch[i]==35||ch[i]==37||ch[i]==38)
                    count4++;
            }
            if(ch[0]>=97&&ch[0]<=122||ch[s.length()-1]>=97&&ch[s.length()-1]<=122)
                count1++;
            if(s.length()>=10&&count1>0&&count2>0&&count3>0&&count4>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
