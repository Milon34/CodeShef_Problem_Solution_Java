package CodeShef;

import java.util.*;

public class POPGATES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            List<String> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(sc.next());
            }
            // int a=l.size()-1;

            Collections.reverse(l);
            //System.out.println(l);
            for (int i = 0; i < k; i++) {
                int a = 0;
                if (l.get(a).equals("T")) {
                    l.remove(a);
                } else {
                    l.remove(a);
                    for (int j = 0; j < l.size(); j++) {
                        if (l.get(j).equals("H")) {
                            l.set(j, "T");
                        } else {
                            l.set(j, "H");
                        }
                    }
                }
            }
            int countH = 0;
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i).equals("H")) {
                    countH++;
                }
            }
            System.out.println(countH);


//           for (int i=l.size()-1;i>=l.size()-k;i--){
//               int a=l.size()-1;
//               if (l.get(a).equals("T")){
//                   l.remove(a);
//               }else{
//                   l.remove(a);
//                   for (int j=0;j<l.size();j++){
//                       if (l.get(j).equals("H")){
//                           l.set(j,"T");
//                       }else {
//                           l.set(j,"H");
//                       }
//                   }
//                   //a=l.size();
//               }
//               //a=l.size();
//           }
//            System.out.println(l);
        }
    }
}

class testKK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arrn1[]=new int[n1];
        for (int i=0;i<n1;i++){
            arrn1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int arrn2[]=new int[n2];
        for (int i=0;i<n2;i++){
            arrn2[i]=sc.nextInt();
        }
        Arrays.sort(arrn1);
        Arrays.sort(arrn2);
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<n1;i++){
            for (int j=0;j<n2;j++){
                if (arrn1[i]==arrn2[j]){
                    list.add(arrn1[i]);
                }
            }
        }
        Collections.sort(list);
       for (int i:list){
           System.out.print(i+" ");
       }
        System.out.println();
    }
}
class FtestGG{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()){
            int a=sc.nextInt();
            if (a==42){
                break;
            }
            System.out.println(a);
        }
    }
}