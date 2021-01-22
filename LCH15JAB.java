package CodeShef;
import java.util.Scanner;

public class LCH15JAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char ch[] = s.toCharArray();
            int num = 0, count = 0;
            for (int j = 0; j < ch.length; j++) {
              count=0;
              for (int k=j+1;k<ch.length;k++){
                  if (ch[j]==ch[k]){
                      count++;
                  }
              }
              if (count>num){
                  num=count;
              }
            }
            int different=s.length()-num-1;
            if (num+1==different){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
}
