package CodeShef;

import java.util.Scanner;

public class COMM3 {
    public  static double distance(double d1,double d2,double d3,double d4){
        return Math.sqrt(((d1-d3)*(d1-d3))+((d2-d4)*(d2-d4)));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            double n=sc.nextDouble();
            double x1,y1,x2,y2,x3,y3;
            x1=sc.nextDouble();
            y1=sc.nextDouble();
            x2=sc.nextDouble();
            y2=sc.nextDouble();
            x3=sc.nextDouble();
            y3=sc.nextDouble();
            double a,b,c;
            a=distance(x1,y1,x2,y2);
            b=distance(x1,y1,x3,y3);
            c=distance(x3,y3,x2,y2);
            if ((a<=n) &&((b<=n)||(c<=n))||((b<=n)&&(c<=n))){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
