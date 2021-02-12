package CodeShef;

import java.util.*;
import java.util.function.Predicate;

public class Team_Name {
    public static long solve(String[] a, int n) {
        //Arrays.sort(a);
        String p, q;
        long ans = 0;
        char temp;
        List<String> finalS=new ArrayList<>();
        for (int i=0;i<a.length;i++){
            finalS.add(a[i]);
        }

        //System.out.println(finalS);
        for (long i = 0; i < n; i++) {
            for (long j = i + 1; j < n; j++) {
                p = a[(int) i];
                q = a[(int) j];
                char ch[] = p.toCharArray();
                char ch1[] = q.toCharArray();
                temp = ch[0];
                ch[0] = ch1[0];
                ch1[0] = temp;
                //System.out.println(Arrays.stream(a).anyMatch(Predicate.isEqual(p)));
                //System.out.println(Arrays.toString(ch));
                //System.out.println(Arrays.toString(ch1));
                String m= String.valueOf(ch);
                String m1= String.valueOf(ch1);
//                for (char c:ch){
//                    m+=c;
//                }
//                for (char c:ch1){
//                    m1+=c;
//                }
                //System.out.println("h1:"+m);
                //System.out.println("h2:"+m1);
                if (m.charAt(0) == m1.charAt(0)) {

                }else if (m.equals(m1)){

                }else if (!finalS.contains(m)&&!finalS.contains(m1)){
                    ans+=2;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            String s[]=new String[ n];
            for (int i=0;i<n;i++){
                s[i]=sc.next();
            }
            System.out.println(solve(s,n));
        }

    }
}
