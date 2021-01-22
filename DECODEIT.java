package CodeShef;

import java.util.Scanner;

public class DECODEIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = "abcdefghijklmnop";
            char ch[] = sc.next().toCharArray();
            int l = 0, h = 15;
            StringBuilder sb = new StringBuilder();
            for(char c : ch){
                if(c == '0'){
                    h = (h+l)/2;
                }else {
                    l = (h+l)/2 + 1;
                }
                if(l == h){
                    sb.append(s.charAt(l));
                    l = 0; h = 15;
                }
            }
            System.out.println(sb);
        }
    }
}
