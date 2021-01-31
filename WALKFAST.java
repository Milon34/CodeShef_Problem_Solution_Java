package CodeShef;

import java.util.Scanner;

public class WALKFAST {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,a,b,c,d,p,q,y;
            n=sc.nextInt();
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            p=sc.nextInt();
            q=sc.nextInt();
            y=sc.nextInt();
            int arr[]=new int[n+1];
            for (int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
            }
            int walkValue=Math.abs(arr[b]-arr[a])*p;
            int startValue=arr[c];
            int trainValue=0;
            trainValue+=Math.abs(arr[c]-arr[a])*p;
            if (trainValue<y){
                trainValue+=y-startValue;
            }
            if (trainValue==y){
                trainValue+=Math.abs(arr[d]-arr[c])*q+ Math.abs(arr[d]-arr[b])*p;
            }else {
                trainValue=Integer.MAX_VALUE;
            }
            System.out.println(Math.min(walkValue,trainValue));
        }
    }
}
