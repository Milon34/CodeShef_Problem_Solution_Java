package CodeShef;

import java.util.Scanner;

public class CODERLIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int arr[] = new int[30];

            for (int i = 0; i < 30; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            boolean check=false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    count++;
                }else {
                    count=0;
                }
                if (count>5) {
                    check=true;
                }
            }
            if (check) {
                System.out.println("#coderlifematters");
            } else {
                System.out.println("#allcodersarefun");
            }
        }
    }

}
