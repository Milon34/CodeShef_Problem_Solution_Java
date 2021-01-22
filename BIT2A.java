package CodeShef;

import java.util.*;

public class BIT2A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            List<Integer> l=new ArrayList<>();
            for (int i=0;i<n;i++){
                int count=0;
                for (int j=i+1;j<n;j++) {
                    if (arr[i] < arr[j]) {
                        count++;
                    }
                }
                l.add(count);
            }
            for (int i:l){
                System.out.print(i+" ");
            }
            System.out.println();
          //  arr[0]=arr.length-1;
//            System.out.print(arr.length-1+" ");
//            for (int i=1;i<n-1;i++){
//                for (int j=i+1;j<n-1;j++) {
//                    if (arr[i] == arr[j]) {
//
//                    }
//                }
//            }
//            System.out.print(arr[0]+" ");
//            HashSet<Integer> ha=new HashSet<>();
//            for (int i=1;i<n;i++){
//                ha.add(arr[i]);
//            }
//            int myValue=ha.size();
//            int arrayValue=arr.length;
//            int check=arrayValue-myValue;
//            //System.out.print(check);
//            Iterator<Integer> it=ha.iterator();
//            while (it.hasNext()){
//                System.out.println(it.next());
//                if (it==)
//            }
//            for (int i:ha){
//                System.out.print(i+" ");
//            }
        }
    }
}
class PrimeNumbers
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long m, n;
            m = sc.nextLong();
            n = sc.nextLong();
            //boolean prime[] = new boolean[(int) (n+1)];
            int arr[]=new int[(int) (n+1)];
            for(long i=2;i<=n;i++)
                arr[(int) i] = 1;
            for(long p = 2; p*p <=n; p++)
            {
                if(arr[(int) p] == 1)
                {
                    for(long i = p*p; i <= n; i += p)
                        arr[(int) i] = 0;
                }
            }
           milon: for(long i = m; i <= n; i++)
            {
                if(arr[(int) i] == 1) {
                    System.out.print(i + " ");
                }else {
                    continue milon;
                }
            }
            System.out.println();
        }
    }
}