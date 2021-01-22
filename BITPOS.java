package CodeShef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BITPOS {
    public  static int countMaxSetBits(int l,int r)
    {
        while ((l|(l+1))<= r) {
            l |= l + 1;
        }

        return l;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(countMaxSetBits(a,b));
//           // List<Integer> lF=new ArrayList<>();
//            long arr[]=new long[(int) (b-a+1)];
//            long m=0;
////            for (long i=a;i<=b;i++){
//                arr[(int) m]=Integer.bitCount((int) i);
//                m++;
//                //lF.add(Integer.bitCount((int) i));
////                String s=Integer.toBinaryString(i);
////                char ch[]=s.toCharArray();
////                int count=0;
////                for (int j=0;j<s.length();j++){
////                    if (ch[j]=='1'){
////                        count++;
////                    }
////                }
////                lF.add(count);
//          }
           // System.out.println(lF);
            //List<String> lg=new ArrayList<>();
//            String[] s=new String[(int)((b-a+1))];
//            long n=0;
//            for (long i=a;i<=b;i++){
//                s[(int) n]=Integer.toBinaryString((int) i);
//                n++;
//                //lg.add(Integer.toBinaryString((int) i));
//            }
//           // System.out.println(lg);
//            long max= arr[0];
//            String sFast="";
//            for (long i=1;i<arr.length;i++){
//                //max=lF.get(i);
//                if (max<arr[(int) i]){
//                    max= arr[(int) i];
//                    sFast=s[(int) i];
//                }
//            }
//            long decimal=Integer.parseInt(sFast,2);
//            System.out.println(decimal);

//            List<String> l=new ArrayList<>();
//            int max=0;
//            for (int i=a;i<=b;i++){
//
//
//
//                String s=Integer.toBinaryString(i);
//                l.add(s);
//                char ch[]=s.toCharArray();
//                int count=0;
//                for (int j=0;j<s.length();j++){
//                    if (ch[i]=='1'){
//                        count++;
//                    }
//                }
//                max=Math.max(max,count);
//            }

        }
    }
}
class testFFF{
    public static void main(String[] args) {
        int i,fact=1;
        int number=400;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        String s= String.valueOf(fact);
        System.out.println(s);

    }
}