package CodeShef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SNAKPROC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            char ch[] = sc.next().toCharArray();
            boolean check = true;
            List<Character> list = new ArrayList<>();
            int count=0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i]=='H'){
                    count++;
                }else if (ch[i]=='T'){
                    count--;
                }
                if (count>1||count<0){
                 break;
                }
            }
            if (count==0){
                System.out.println("Valid");
            }else {
                System.out.println("Invalid");
            }
//            if (list.size()==0){
//                System.out.println("Valid");
//            }else if (list.get(0)!='H' || list.get(list.size()-1)!='T') {
//                System.out.println("Invalid");
//            }else {
//                for(int i=0;i<list.size()-1;i++) {
//                    if (list.get(i) == list.get(i+1)) {
//                        System.out.println(("Invalid"));
//                        break;
//                    }else {
//                        System.out.println("Valid");
//                        break;
//                    }
//                }
//
//            }

//            else {
//                if (list.get(0) == 'H' && list.get(list.size() - 1) == 'T') {
//                    StringBuffer sb = new StringBuffer();
//                    for (int i = 0; i < list.size(); i++) {
//                        sb.append(list.get(i));
//                    }
//                    String s1 = String.valueOf(sb);
//                    if (s1.length() % 2 == 0) {
//                        String newString = s1.substring(0, s1.length() - 1);
//                        StringBuffer sb1 = new StringBuffer(newString);
//                        String sb2 = String.valueOf(sb1);
//                        String s2 = String.valueOf(sb1.reverse());
//                        if (sb2.equals(s2)) {
//                            System.out.println("Valid");
//                        } else {
//                            System.out.println("Invalid");
//                        }
//                    } else {
//                        String s2 = String.valueOf(sb.reverse());
//
//                        if (s1.equals(s2)) {
//                            System.out.println("Valid");
//                        } else {
//                            System.out.println("Invalid");
//                        }
//                    }
//                }else {
//                    System.out.println("Invalid");
//                }
//            }
//            if (s1.equals()){
//                System.out.println("true");
//            }else {
//                System.out.println("false");
//            }

//            for (char ch1:list){
//                System.out.print(ch1);
//            }
//            System.out.println();

        }
    }
}
//class test <T>{
//    private T t;
//    public void set(T t){
//        this.t=t;
//    }
//    public T get(){
//        return  t;
//    }
//    public <U extends Number>void inspect(U u){
//        System.out.println(" T:"+t.getClass().getName());
//        System.out.println("U:"+u.getClass().getName());
//    }
//    public static void main(String[] args) {
//        test<Integer> t=new test<>();
//        t.set(10);
//        t.inspect(new Float("12.5"));
//    }
//}
