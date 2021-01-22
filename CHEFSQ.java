package CodeShef;

import java.util.HashSet;
import java.util.Scanner;

public class CHEFSQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            long a=sc.nextLong();
            long aArr[]=new long[(int) a];
            for (int i=0;i<a;i++){
                aArr[i]=sc.nextLong();
            }
            long b=sc.nextLong();
            long bArr[]=new long[(int) b];
            for (int i=0;i<b;i++){
                bArr[i]=sc.nextLong();
            }
            int count=0;
            for (int i=0;i<b;i++){
                for (int j=0;j<a;j++){
                    if (bArr[i]==aArr[j]){
                        count++;
                        break;
                    }
                }
            }
            if (count==b){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
//        while (t-- > 0) {
//            long a = sc.nextLong();
//            HashSet<Long> hashSet=new HashSet<>();
//
//            for (int i=0;i<a;i++){
//                hashSet.add(sc.nextLong());
//            }
//            long value=hashSet.size();
//            long b=sc.nextLong();
//            for (int i=0;i<b;i++){
//                hashSet.add(sc.nextLong());
//            }
//            if (hashSet.size()==value){
//                System.out.println("Yes");
//            }else {
//                System.out.println("No");
//            }
////            String str1 = "";
////            for (int i = 0; i < a; i++) {
////                str1 += sc.next();
////            }
////            int b = sc.nextInt();
////            String str2 = "";
////            for (int i = 0; i <b; i++) {
////                str2 += sc.next();
////            }
////            if (str2.contains(str1)) {
////                System.out.println("Yes");
////            } else {
////                System.out.println("No");
////            }
//        }
    }
}
