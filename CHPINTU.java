package CodeShef;

import java.util.*;

public class CHPINTU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            int arrF[] = new int[n];
            int arrP[] = new int[n];
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arrF[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arrP[i] = sc.nextInt();
            }

            for (int j = 1; j <= m; j++) {
                int sum = 0;
                boolean myCheck = false;
                for (int k = 0; k < n; k++) {
                    if (j == arrF[k]) {
                        sum += arrP[k];
                        myCheck = true;
                    }
                }
                if (myCheck) {
                    l.add(sum);
                }

            }
            if (l.size() > 0) {
                System.out.println(Collections.min(l));
            } else {
                System.out.println(0);
            }
        }
    }
}
