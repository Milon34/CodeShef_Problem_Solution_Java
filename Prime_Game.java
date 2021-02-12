package CodeShef;

import java.util.*;
import java.util.stream.IntStream;

public class Prime_Game {
    static boolean isPrime(long number) {
        if (number <= 2)
            return number == 2;
        else
            return (number % 2) != 0
                    &&
                    IntStream.rangeClosed(3, (int) Math.sqrt(number))
                            .filter(n -> n % 2 != 0)
                            .noneMatch(n -> (number % n == 0));
    }

    static boolean isp(long n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    //    public static void magicPrime() {
//        Arrays.fill(sieve,true);
//        sieve[0] = true;
//        sieve[1] = true;
//        for (long i = 2; i * i < N + 1; i++) {
//            if (sieve[(int) i] == false) {
//                for (long j = i * i; j < N + 1; j += i) {
//                    sieve[(int) j] = true;
//                }
//            }
//        }
//    }
//    public static void fun() {
//        Arrays.fill(sieve,true);
//        long temp = 0;
//        for (long i = 2; i < N + 1; i++) {
//            if (sieve[(int) i]==true) {
//                temp++;
//            }
//            countPrime[(int) i] = temp;
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p[] = new int[1000001];
        p[0] = 0;
        p[1] = 0;
        int count = 0;
        for (long i = 2; i < 1000001; i++) {
            if (isPrime(i)) {
                count++;
            }
            p[(int) i] = count;
        }
        long t = sc.nextLong();
        while (t-- > 0) {
            long n, k;
            n = sc.nextLong();
            k = sc.nextLong();
            if (p[(int) n] > k) {
                System.out.println("Divyam");
            } else {
                System.out.println("Chef");
            }

        }
    }
}

class testList {
    public static long solve(String[] a, int n) {
        Arrays.sort(a);
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
                //System.out.println(Arrays.toString(ch));
                //System.out.println(Arrays.toString(ch1));
                String m="";
                String m1="";
                for (char c:ch){
                    m+=c;
                }
                for (char c:ch1){
                    m1+=c;
                }
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