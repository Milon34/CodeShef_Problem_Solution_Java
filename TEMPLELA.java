package CodeShef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TEMPLELA {
    public static boolean equalLists(List<Integer> one, List<Integer> two){
        if (one == null && two == null){
            return true;
        }

        if((one == null && two != null)
                || one != null && two == null
                || one.size() != two.size()){
            return false;
        }

        //to avoid messing the order of the lists we will use a copy
        //as noted in comments by A. R. S.
        one = new ArrayList<Integer>(one);
        two = new ArrayList<Integer>(two);

        Collections.sort(one);
        Collections.sort(two);
        return one.equals(two);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(sc.nextInt());
            }
            if (l.size() % 2 == 0) {
                System.out.println("no");
            } else {
                int length = (l.size() + 1) / 2;
                List<Integer> sub1 = new ArrayList<>();
                sub1 = l.subList(0, length);
                List<Integer> sub2 = new ArrayList<>();
                sub2 = l.subList(length, l.size());
                int diff = 0;
                for (int i = 0; i < sub1.size() - 1; i++) {
                    int check = sub1.get(i) + 1;
                    if (check == sub1.get(i + 1)) {
                        diff = 1;
                    } else {
                        diff = 0;
                        break;
                    }
                }
                boolean myCheck = false;
                if (diff == 1) {
                    myCheck = true;
                } else {
                    myCheck = false;
                }
                int subDiff = 0;
                for (int i = 0; i < sub2.size() - 1; i++) {
                    int check = sub2.get(i) - 1;
                    if (check == sub2.get(i + 1)) {
                        subDiff = 1;
                    } else {
                        subDiff = 0;
                    }
                }
//                System.out.println(sub1);
//                System.out.println(sub2);
               // List<Integer> tec=new ArrayList<>();
               // tec=sub1.subList(0,sub1.size()-1);
                //System.out.println(tec);
//                if (equalLists(tec,sub2)){
//                    System.out.println("Yes");
//                }else {
//                    System.out.println("No");
//                }
                boolean headCheck = false;
                if (subDiff == 1) {
                    headCheck = true;
                } else {
                    headCheck = false;
                }
                if (l.get(0) != 1 || l.get(l.size() - 1) != 1) {
                    System.out.println("no");
                } else {
                    if (myCheck == false || headCheck == false) {
                        System.out.println("no");
                    } else {
                        System.out.println("yes");
                    }
//                    if (myCheck==headCheck) {
//                        System.out.println("Yes");
//                    } else {
//                        System.out.println("No");
//                    }

                }
            }
        }
    }
}

class TEMPLELAF {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int mid = 0;
            if (n % 2 == 0) {
                mid = n / 2;
            } else {
                mid = (n + 1) / 2;
            }
            int count = 0;
            boolean check = true;
            for (int i = 0; i < n; i++) {
                if (i < mid) {
                    count++;
                } else {
                    count--;
                }
                if (arr[i] != count) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}