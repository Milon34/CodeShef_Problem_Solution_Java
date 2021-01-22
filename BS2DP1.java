package CodeShef;

import java.util.*;

public class BS2DP1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        List<Integer> addList=new ArrayList<>();
        for (int i=0;i<n;i++){
            addList.add(sc.nextInt());
        }
        Collections.sort(addList);
        List<Integer> l=new ArrayList<>();
        int sum=0;
        for (int i=0;i<n;i++){
            if (addList.get(i)>=0){
                l.add(addList.get(i));
                sum+=addList.get(i);
            }
        }
        //System.out.println(sum);
        List<Integer> negative=new ArrayList<>();
        negative=addList.subList(0,addList.size()-l.size());
        //System.out.println(negative);
        for (int i=0;i<k;i++){
            sum+=Math.abs(negative.get(i));
        }
        System.out.println(sum);
    }
}
class testMAx{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]>=0){
                sum+=arr[i];
            }else {
                break;
            }
        }
        //System.out.println(sum);
        for (int i=0;i<k;i++){

            if (arr[i]<=0){
                sum+=Math.abs(arr[i]);
            }
        }
        System.out.println(sum);
    }
}