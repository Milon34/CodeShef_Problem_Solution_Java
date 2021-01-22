package CodeShef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SEGM01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            char ch[]=s.toCharArray();
            List<Character> l=new ArrayList<>();
            for (int m=0;m<s.length();m++){
             l.add(ch[m]);
            }
            int count=0;
            for (int i=0;i<s.length();i++){
                if (ch[i]=='0'){
                    count++;
                }
            }
            if (count==s.length()){
                System.out.println("NO");
            }else {
                int index1 = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (l.get(j) == '1') {
                        index1 = l.indexOf(new Character('1'));
                        break;
                    }
                }
                //System.out.println(index1);
                int index2 = 0;
                for (int k = s.length() - 1; k >= 0; k--) {
                    if (l.get(k) == '1') {
                        index2 = l.lastIndexOf(new Character('1'));
                    }
                }
                // System.out.println(index2);
                List<Character> list = new ArrayList<>();
                list = l.subList(index1, index2);
                boolean check = true;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == '0') {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
