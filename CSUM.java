package CodeShef;

import java.util.Scanner;

public class CSUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            boolean check=false;
            for (int i=0;i<n;i++){
                for (int j=i+1;j<n;j++){
                    if (arr[i]+arr[j]==k){
                        check=true;
                        break;
                    }
                }
            }
            if (check){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
