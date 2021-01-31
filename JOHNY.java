package CodeShef;

import java.util.*;

public class JOHNY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            List<Integer> l=new ArrayList<>();
            for (int i=0;i<n;i++){
                l.add(sc.nextInt());
            }
            int k=sc.nextInt();
            int value=l.get(k-1);
            Collections.sort(l);
            for (int i=0;i<l.size();i++){
                if (l.get(i)==value){
                    System.out.println(i+1);
                    break;
                }
            }

        }
    }
}
