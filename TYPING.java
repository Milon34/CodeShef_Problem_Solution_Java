package CodeShef;

import java.util.HashMap;
import java.util.Scanner;

public class TYPING {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        HashMap<Character,Integer> count=new HashMap<>();
        count.put('f',1);
        count.put('d',1);
        count.put('j',0);
        count.put('k',0);
        //System.out.println(count);
        while(T-->0){
            int n=sc.nextInt();
            int ans=0;
            HashMap<String,Integer> map=new HashMap<>();
            for (int i=0;i<n;i++){
                String s=sc.next();
                if (map.containsKey(s)){
                    ans+=(map.get(s)/2);
                    continue;
                }
                int flag=count.get(s.charAt(0));
                int temp=2;
                for (int j=1;j<s.length();j++){


                    if (flag==count.get(s.charAt(j))){
                        temp+=4;
                        flag=count.get(s.charAt(j));
                    }
                    else{
                        temp+=2;
                        flag=count.get(s.charAt(j));
                    }

                }

                ans+=temp;
                map.put(s,temp);
                System.out.println(ans);
                //System.out.println(temp+" "+s);
            }
            System.out.println(ans);
        }
    }
}
