package CodeShef;

import java.util.Scanner;

public class RPD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int value=0;
            int finalValue=0,sum=0,levelValue=0;
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    value=arr[i]*arr[j];
                    String s= String.valueOf(value);
                    char ch[]=s.toCharArray();
                    for (int k=0;k<ch.length;k++){
                        finalValue=ch[k]-48;
                        sum+=finalValue;
                    }
                    levelValue=Math.max(sum,levelValue);
                    sum=0;
                }
            }
            System.out.println(levelValue);
        }
    }
}
//class test{
//    public static void main(String[] args) {
//
//    }
//}
//class Bound <T extends  Hi & Hello>{
//    T obj;
//    Bound(T obj){
//        this.obj=obj;
//    }
//    void print(){
//        obj.sayHello();
//        obj.print();
//    }
//}
//class Wishes implements Hello,Hi{
//    public void print(){
//        System.out.println("Hi");
//    }
//
//    @Override
//    public void sayHello() {
//
//    }
//}
//interface Hi{
//    void print();
//}
//class Hello{
//    void sayHello(){
//        System.out.println("Hello");
//    }
//}