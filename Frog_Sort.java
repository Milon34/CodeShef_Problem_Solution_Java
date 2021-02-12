package CodeShef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Frog_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            List<Integer> weight=new ArrayList<>();
            List<Integer> length=new ArrayList<>();
            int ind[]=new int[n];
            for (int i=0;i<n;i++){
                weight.add(sc.nextInt());
            }
            for (int i=1;i<n;i++){
                length.add(sc.nextInt());
            }
            for (int i=0;i<n;i++){
                ind[i]=weight.indexOf(i);
            }
            int s=0;
            for (int i=1;i<n;i++){
                int temp1=ind[i];
                int temp2=ind[i-1];
                int temp=0;
                if (temp1<=temp2){
                    temp= (int) Math.ceil((double) (temp2+1-temp1)/length.get(temp1));
                }
                s+=temp;
                try {
                    ind[i] += temp * (length.get(temp1));
                }catch (Exception e){

                }
            }
            System.out.println(s);

//            int [] weight=new int[n];
//            int [] length=new int[n];
//           // List<Integer> length=new ArrayList<>();
//            for (int i=0;i<n;i++){
//                weight[i]=sc.nextInt();
//            }
//            for (int i=0;i<n;i++){
//               length[i]=sc.nextInt();
//            }
//            List<Integer> l=new ArrayList<>();
//            for (int i=0;i<n;i++){
//                l.add(weight[i]);
//            }
//
//            int ind[]=new int[n];
//            int s=0;
//            for (int i=0;i<n;i++){
//                ind[i]=l.indexOf(i);
//            }
//            for (int i=1;i<n;i++){
//                int temp1=ind[i];
//                int temp2=ind[i-1];
//                int temp=0;
//                if (temp1<=temp2){
//                    temp= (int) Math.ceil((double) (temp2+1-temp1)/length[temp1]);
//                }
//                s+=temp;
//                ind[i]+=temp*(length[temp1]);//index.get(i)+my);
//            }
//            System.out.println(s);
        }
    }
}
class Dtest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] weight=new int[n];
        int [] length=new int[n];
        // List<Integer> length=new ArrayList<>();
        for (int i=0;i<n;i++){
            weight[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            length[i]=sc.nextInt();
        }
        List<Integer> l=new ArrayList<>();
        for (int i=0;i<n;i++){
            l.add(weight[i]);
        }
        int ind[]=new int[n];
        int s=0;
        for (int i=0;i<n;i++){
            ind[i]=l.indexOf(l.get(i));
        }
        System.out.println(Arrays.toString(ind));
    }
}