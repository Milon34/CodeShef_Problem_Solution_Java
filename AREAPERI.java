package CodeShef;

import java.util.Scanner;

public class AREAPERI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int area, peri = 0;
        area = a * b;
        peri=2*(a+b);
        if (area>peri){
            System.out.println("Area");
            System.out.println(area);
        }else if(area<peri) {
            System.out.println("Peri");
            System.out.println(peri);
        }else {
            System.out.println("Eq");
            System.out.println(area);
        }


    }
}
