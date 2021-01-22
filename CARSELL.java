package CodeShef;

import java.util.*;

public class CARSELL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(sc.nextInt());
            }
            Collections.sort(l);
            Collections.reverse(l);
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.max(0, l.get(i) - i);
            }
            System.out.println(sum % 1000000007);
//
//              int  profit=l.get(0);
//               for (int i=1;i<l.size();i++){
//                   if (l.get(i)>0){
//
//                       List<Integer> sub=l.subList(i,l.size());
//                       //System.out.println(sub);
//                       for (int m=0;m<sub.size();m++) {
//                           sub.set(m, sub.get(m) - 1);
//                       }
//                       for (int ms=0;ms<sub.size();ms++){
//                           profit=profit+sub.get(0);
//                           break;
//                       }
//                   }else {
//
//                   }
        }
//                System.out.println(profit);
    }
}

class testG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(sc.nextInt());
            }
            Collections.sort(l);
            Collections.reverse(l);
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.max(0, l.get(i) - i);
            }
            System.out.println(sum % 1000000007);
        }
    }
}