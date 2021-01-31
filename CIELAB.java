package CodeShef;

import java.util.Scanner;

public class CIELAB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int value=a-b;
       // System.out.println(value-b);
        String s= String.valueOf(value);
        char ch[]=s.toCharArray();
        for (int i=0;i<s.length();i++){
            if (ch[i]=='1'){
                ch[i]='2';
            }else if (ch[i]=='2'){
                ch[i]='3';
            }else if (ch[i]=='3'){
                ch[i]='4';
            }else if (ch[i]=='4'){
                ch[i]='5';
            }else if (ch[i]=='5'){
                ch[i]='6';
            }else if (ch[i]=='6'){
                ch[i]='7';
            }else if (ch[i]=='7'){
                ch[i]='8';
            }else if (ch[i]=='8'){
                ch[i]='9';
            }else if (ch[i]=='9'){
                ch[i]='1';
            }
            break;
        }
        for (char c:ch){
            System.out.print(c);
        }
        System.out.println();

    }
}
