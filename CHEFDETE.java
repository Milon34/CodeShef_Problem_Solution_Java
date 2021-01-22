package CodeShef;

import java.util.*;

public class CHEFDETE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       // List<Integer> l[]=new ArrayList[(int) (t+1)];
        int arr[]=new int[t+1];
        for (int i=0;i<t;i++){
           int a=sc.nextInt();
           arr[a]++;
        }
        for (int i=1;i<=t;i++){
           if (arr[i]==0){
               System.out.print(i+" ");
           }
        }
        System.out.println();
//        Arrays.sort(arr);
//       // System.out.println(hashSet);
//        for (int i=1;i<=hashSet.size();i++){
//            System.out.print(i+arr[arr.length-1]+" ");
//        }
//        System.out.println();
    }
}
class tesFF{
    public static void main(String[] args) {
        int l = 1;
        l|=l+1;
        System.out.println(l);
    }
}