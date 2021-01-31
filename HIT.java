package CodeShef;

import java.util.*;

public class HIT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            List<Integer> l=new ArrayList<>();
            for (int i=0;i<n;i++){
                l.add(sc.nextInt());
            }
//            LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
//            for (int i=0;i<n;i++){
//                linkedHashSet.add(l.get(i));
//            }
            Collections.sort(l);
            int x=n/4;
            if (l.get(x)>l.get(x-1)&& l.get(2*x)>l.get(2*x-1) && l.get(3*x)>l.get(3*x-1)){
                System.out.println(l.get(x)+" "+l.get(2*x)+" "+l.get(3*x));
            }else {
                System.out.println("-1");
            }
        }
    }
}
