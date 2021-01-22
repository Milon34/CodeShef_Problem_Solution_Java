package CodeShef;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class XYSTR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            String s=sc.next();
            char ch[]=s.toCharArray();
            List<Character> l=new ArrayList<>();
            for (int j=0;j<ch.length;j++) {
                l.add(ch[j]);
            }
            int count=0;
            StringBuffer s1=new StringBuffer("xy");
            StringBuffer sb=new StringBuffer();
            for (int k=0;k<s.length()-1;k++){
                List<Character> myList=l.subList(k,k+2);
                //System.out.println(myList);
                Iterator<Character> it=myList.iterator();
                while (it.hasNext()){
//                    s2+= String.valueOf(it.next());
                    sb.append(it.next());
                }
                if ((s.charAt(k)=='x'&&s.charAt(k+1)=='y')||(s.charAt(k)=='y'&& s.charAt(k+1)=='x')){
                    k++;
                    count++;
                }
                sb.delete(0,2);
            }
            System.out.println(count);
        }

    }
}
