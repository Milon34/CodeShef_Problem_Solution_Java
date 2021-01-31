package CodeShef;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CHEFA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long n=sc.nextLong();
            long arr[]=new long[(int) n];
            for (long i=0;i<n;i++){
                arr[(int) i]=sc.nextLong();
            }
            Arrays.sort(arr);
            long sum=0;
            for (long i=arr.length-1;i>=0;i-=2){
                sum+=arr[(int) i];
            }
            System.out.println(sum);
        }
    }
}
class testLL{
    public static void main(String[] args) {

        //int n,a[26],c=0,k=0,ma=0,o;
        //string s;
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
       // getchar();
        while(n-->0)
        {

            int c=0,k = 0,ma = 0,o;
            char ch,ch1;
            String s1;
            s1=sc.next();
            int a[]=new int[26];
            for(int i=0; i<=25; i++)
            {
                ch= (char) (97+i);
                ch1= (char) (65+i);
                //cout<<" ch "<<ch;
                //cout<<s[i];
                for(int j=0; j<s1.length(); j++)
                {
                    // cout<<s1[0];
                    if(ch==s1.charAt(j)||ch1==s1.charAt(j))
                    {
                        c++;
                        // cout<<c;
                    }
                }
                if(ma<c)
                {
                    ma=c;
                }
                a[k]=c;
                k++;
                c=0;
            }
            String s="";
            for(int i=0; i<25; i++)
            {
                if(a[i]==ma)
                {
                    ch= (char) (97+i);
                    s+=ch;
                   // System.out.print(ch);
                }
            }
            System.out.print(s);
            //System.out.println();
        }
    }
}
