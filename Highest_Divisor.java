package CodeShef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Highest_Divisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for (int i=1;i<=10;i++){
            if (n%i==0){
                l.add(i);
            }
        }
        System.out.println(Collections.max(l));
    }
}
