package CodeShef;

import java.util.HashSet;
import java.util.Scanner;

public class TICKETS5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            char ch[]=sc.next().toCharArray();
            HashSet<Character> hashSet=new HashSet<>();
            for (int i=0;i<ch.length;i++){
                hashSet.add(ch[i]);
            }
            if (hashSet.size()==2){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
