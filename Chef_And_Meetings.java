package CodeShef;

import java.util.*;

public class Chef_And_Meetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // public  static void solve(){
            // Scanner sc=new Scanner(System.in);

            String pv, pt;
            pv = sc.next();
            pt = sc.next();
            char ch1[] = pv.toCharArray();
            char ch2[] = pt.toCharArray();
            long n;
            n = sc.nextInt();
            if (pt.equals("PM")) {
                if (pv.charAt(0) == '1' && pv.charAt(1) == '2') {

                } else {
                    int temp = pv.charAt(0) - 48;
                    temp *= 10;
                    temp += pv.charAt(1) - 48;
                    temp += 12;
                    int rem = temp % 10;
                    ch1[1] = (char) (rem + 48);
                    ch1[0] = (char) ((temp / 10) + 48);
                }
            } else {
                if (pv.charAt(0) == '1' && pv.charAt(1) == '2') {
                    int temp = pv.charAt(0) - 48;
                    temp *= 10;
                    temp += pv.charAt(1) - 48;
                    temp -= 12;
                    int rem = temp % 10;
                    ch1[1] = (char) (rem + 48);
                    ch1[0] = (char) ((temp / 10) + 48);
                }
            }
//            for (char ch : ch1) {
//                System.out.print(ch);
//            }
//            System.out.println();
            String a, b, c, d;
            for (long i = 0; i < n; i++) {
                a = sc.next();
                b = sc.next();
                c = sc.next();
                d = sc.next();
                char chm1[] = a.toCharArray();
                char chm2[] = b.toCharArray();
                char chm3[] = c.toCharArray();
                char chm4[] = d.toCharArray();
                if (b.equals("PM")) {
                    if (chm1[0] == '1' && chm1[1] == '2') {

                    } else {
                        int temp = a.charAt(0) - 48;
                        temp *= 10;
                        temp += a.charAt(1) - 48;
                        temp += 12;
                        int rem = temp % 10;
                        chm1[1] = (char) (rem + 48);
                        chm1[0] = (char) ((temp / 10) + 48);
                    }
                } else {
                    if (a.charAt(0) == '1' && a.charAt(1) == '2') {
                        int temp = a.charAt(0) - 48;
                        temp *= 10;
                        temp += a.charAt(1) - 48;
                        temp -= 12;
                        int rem = temp % 10;
                        chm1[1] = (char) (rem + 48);
                        chm1[0] = (char) ((temp / 10) + 48);
                    }
                }
                if (d.equals("PM")) {
                    if (c.charAt(0) == '1' && c.charAt(1) == '2') {

                    } else {
                        int temp = c.charAt(0) - 48;
                        temp *= 10;
                        temp += (c.charAt(1) - 48);
                        temp += 12;
                        int rem = temp % 10;
                        chm3[1] = (char) (rem + 48);
                        chm3[0] = (char) ((temp / 10) + 48);
                    }
                } else {
                    if (c.charAt(0) == '1' && c.charAt(1) == '2') {
                        int temp = c.charAt(0) - 48;
                        temp *= 10;
                        temp += c.charAt(1) - 48;
                        temp -= 12;
                        int rem = temp % 10;
                        chm3[1] = (char) (rem + 48);
                        chm3[0] = (char) ((temp / 10) + 48);
                    }
                }
                String s1 = ch1[0] + "" + ch1[1] +""+ ch1[3] + "" + ch1[4];
                String s2 = chm1[0] + "" + chm1[1] + ""+ chm1[3] + "" + chm1[4];
                String s3=chm3[0]+""+chm3[1]+""+chm3[3]+""+chm3[4];
                int m1= Integer.parseInt(s1);
                int m2= Integer.parseInt(s2);
                int m3= Integer.parseInt(s3);
                if (m1>=m2&&m1<=m3){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
//                for (char ch:ch1){
//                    System.out.print(ch);
//                }
//                System.out.println("Main");
//                System.out.println();
//                for (char ch:chm1){
//                    System.out.print(ch);
//                }
//                System.out.println();
//                for (char ch:chm3){
//                    System.out.print(ch);
//                }
//                System.out.println();
            }
            System.out.println();
        }
    }
}

//}//testing code
class Vetest {
    public static long myFun(char u[], char v[]) {
        List<Character> s = new ArrayList<>();
        for (int i = 0; i < u.length; i++) {
            s.add(u[i]);
        }
        long temp = 0;
        for (char x : v) {
            if (s.get(x) != s.get(s.size() - 1)) {
                temp++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Map<String, Vector<Character>>m=new HashMap<>();
        Vector<Character> v = new Vector<>();
        Vector<String> v1 = new Vector<>();
        for (long i = 0; i < n; i++) {
            String s = sc.next();
            v1.add(s);
            if (s.length() > 0) {
                v.add(s.charAt(0));
            }
        }
        System.out.println(v);
        long ans = 0;
        for (String m1 : v1) {
            for (String m2 : v1) {
                if (m1.charAt(0) != m2.charAt(0)) {
                    char ch1[] = m1.toCharArray();
                    char ch2[] = m2.toCharArray();
                    long temp = myFun(ch1, ch2);
                    // ans+=(m1.charAt(1)()-temp)*(j.second.size()-temp);
                }
            }
        }

    }
}
