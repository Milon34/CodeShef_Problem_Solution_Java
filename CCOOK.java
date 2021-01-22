package CodeShef;

import java.util.Scanner;

public class CCOOK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[5];
        for (int i=0;i<t;i++){
            arr[0]=sc.nextInt();
            arr[1]=sc.nextInt();
            arr[2]=sc.nextInt();
            arr[3]=sc.nextInt();
            arr[4]=sc.nextInt();
            int sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
            if (sum==0){
                System.out.println("Beginner");
            }else if (sum==1){
                System.out.println("Junior Developer");
            }else if (sum==2){
                System.out.println("Middle Developer");
            }else if(sum==3){
                System.out.println("Senior Developer");
            }else if (sum==4){
                System.out.println("Hacker");
            }else if (sum==5){
                System.out.println("Jeff Dean");
            }

        }
    }
}
