package CodeShef;

import java.util.Scanner;

public class FLOW011 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            float f=sc.nextFloat();
            float value;
            if (f<1500){
                value= (float) (f+(f*0.1)+(f*0.9));
                System.out.printf("%.2f\n",value);
            }else {
                value= (float) (f+500+(f*0.98));
                System.out.printf("%.2f\n",value);
            }
        }
    }
}
