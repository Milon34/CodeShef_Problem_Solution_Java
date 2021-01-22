package CodeShef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NICAR {
    static int nice(int i, int b[]) {
        int max = 0;
        for (int j = 0; j < i; j++) {
            if (b[j] > max)
                max = b[j];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c[] = new int[n];
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            a[i - 1] = c[i - 1] + nice(i, a);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
//        long n = sc.nextLong();
//        List<Integer> l = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            l.add(sc.nextInt());
//        }
//        long sum = l.get(0), nice = 0, a;
//        //int a;
//        for (int i = 1; i < n; i++) {
//            sum = sum + l.get(i);
//            nice=nice+sum;
//            sum=nice;
//            l.set(i, (int) sum);
//            nice=0;
//            if (sum == 0) {
//                nice = l.get(i - 1);
//            }
//        }
//        for (int i : l) {
//            System.out.print(i + " ");
//        }
//        System.out.println();


//        int arr[]=new int[n];
//        for (int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int arrMy[]=new int[n];
//        arrMy[0]=arr[0];
//        int sum=arr[0];
//int myCheck=0;
//        for (int i=1;i<n;i++){
//           // myCheck=sum;
//            sum +=arr[i];
//            arrMy[i]=sum;
//        }
//        for (int i=1;i<n;i++){
//            if (arrMy[n-1]==0){
//               // break;
//            }else if (arrMy[i]==0){
//                arrMy[i+1]=arrMy[i+1]+arrMy[i-1];
//            }
//        }
//        for (int i=0;i<n;i++){
//            System.out.print(arrMy[i]+" ");
//        }
//        System.out.println();

