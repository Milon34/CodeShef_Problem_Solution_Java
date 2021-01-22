package CodeShef;

import java.util.*;

public class DEFITEM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < k; i++) {
                int a = sc.nextInt();
                int sum = 0, max = Integer.MIN_VALUE;
                for (int j = 0; j < n; j++) {
                    sum += arr[j];
                    max = Math.max(sum, max);
                    if (arr[j] == a) {
                        break;
                    }
                }
                int myMax=Integer.MIN_VALUE;
                int sumF=0;
                for (int m=n-1;m>=0;m--){
                    sumF+=arr[m];
                    myMax=Math.max(sumF,myMax);
                    if (arr[m]==a){
                        break;
                    }
                }
                System.out.println(Math.min(max,myMax));
            }
        }

    }
}
class Gtest{
    public static void main(String[] args) {
        HashSet<Integer> al=new HashSet<>();
        for (int i=1;i<=10;i++){
            al.add(i);
        }
        Spliterator<Integer> sp=al.spliterator();
        Spliterator<Integer> sp2=sp.trySplit();
        System.out.println("Sp");
        sp.forEachRemaining(System.out::println);
        System.out.println("SP2");
        sp2.forEachRemaining(System.out::println);
    }
}