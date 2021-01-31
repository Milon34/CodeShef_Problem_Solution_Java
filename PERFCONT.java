package CodeShef;

import java.util.Scanner;

public class PERFCONT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,p;
            n=sc.nextInt();
            p=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int countCakeWalk=0,countHard=0;
            for (int i=0;i<n;i++){
                if (p/2<=arr[i]){
                    countCakeWalk++;
                }else if (p/10>=arr[i]){
                    countHard++;
                }
            }
            if (countCakeWalk==1&&countHard==2){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
}
