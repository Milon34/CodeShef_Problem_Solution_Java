package CodeShef;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class WATSCORE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int arrP[]=new int[n];
            int arrS[]=new int[n];
            int arrF[]=new int[11];
            for (int i=0;i<n;i++){
                int p,s;
                p=sc.nextInt();
                s=sc.nextInt();
                arrF[p-1]=Math.max(arrF[p-1],s);
            }
            int sumValue=0;
            for (int i=0;i<8;i++){
                sumValue+=arrF[i];
            }
            System.out.println(sumValue);
//            for (int i=0;i<n;i++){
//                arrP[i]=sc.nextInt();arrS[i]=sc.nextInt();
//            }
//            Vector<Integer> v=new Vector<>();
//            int sum=0;
//            for (int i=0;i<arrP.length;i++){
//                for (int j=i+1;j<arrP.length;j++){
//                    if (arrP[i]<=8) {
//                        if (arrP[i] == arrP[j]) {
//                            int value = Math.max(arrS[i], arrS[j]);
//                            v.add(value);
//                            sum+=value;
//                        }else {
//
//                        }
//                    }
//                }
//            }
//            System.out.println(sum);
        }
    }
}
class testGG{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        int value=0;
        for (int i=1;i<Integer.MAX_VALUE;i++){
           String s= String.valueOf(i*i);
           if (digit>6){
               return;
           }else {
               if (i * i < 500000 && s.length() <= digit) {
                   value = i * i;
               }else{
                   break;
               }
           }
       }
       String s= String.valueOf(value);
       char ch[]=s.toCharArray();
       int sum=0;
       for (int i=0;i<ch.length;i++){
           sum+=(ch[i])-48;
       }
        System.out.println(value);
        System.out.println(sum);
    }
}
