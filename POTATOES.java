package CodeShef;

import java.util.Scanner;

public class POTATOES {
    static boolean checkForPrime(int inputNumber) {
        boolean isItPrime = true;
        if (inputNumber <= 1) {
            isItPrime = false;
            return isItPrime;
        } else {
            for (int i = 2; i <= inputNumber / 2; i++) {
                if ((inputNumber % i) == 0) {
                    isItPrime = false;
                    break;
                }
            }
            return isItPrime;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while ( t-- >0){
            int x,y,count=0;
            x=sc.nextInt();
            y=sc.nextInt();
            int value=x+y;
            for (int i=value;i<Integer.MAX_VALUE;i++){
                value++;
                if (checkForPrime(value)){
                    System.out.println(count+1);
                    break;
                }
                count++;
            }
        }
    }


}
