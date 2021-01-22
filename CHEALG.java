package CodeShef;

import java.util.HashSet;
import java.util.Scanner;
public class CHEALG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            StringBuilder st = new StringBuilder();
            for (int i = 0; i < s.length();) {
                int count = 0;
                int j = i;
                for (; j < s.length();) {
                    if (s.charAt(i) == s.charAt(j)) {
                        count++;
                        j++;
                    } else
                        break;
                }
                st.append(s.charAt(i));
                st.append(count);
                i = j;
            }
            if (s.length()>st.length()){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
//            String s = sc.next();
//            int count = 0;
//            HashSet<String> myS = new HashSet<>();
//            for (int i = 0; i < s.length(); i++) {
//                String myString ="";
//                int j;
//                for ( j = i; j < s.length(); j++) {
//                    if (s.charAt(i) == s.charAt(j)) {
//                        count++;
//                        j++;
//                        myString = String.valueOf(s.charAt(i))+""+count;
//                    }
//                }
//                myS.add(myString);
//                count = 0;
//                i=j;
//            }
//            int sum=0;
//           for (String s1:myS){
//              sum+=s1.length();
//           }
//            System.out.println(sum);
//            if (sum < s.length()) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
        }
    }
}
