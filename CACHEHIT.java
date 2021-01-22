package CodeShef;

import java.util.Scanner;

public class CACHEHIT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,b,m;
            n=sc.nextInt();
            b=sc.nextInt();
            m=sc.nextInt();
            int a=0;
            int loadedBlock=0,cacheLoad=0,currentBlock=0;
            for (int i=0;i<m;i++){
                a=sc.nextInt();
                if (a<b){
                    currentBlock=1;
                }else if (a==b){
                    currentBlock=2;
                }else {
                    currentBlock=(a/b)+1;
                }
                if (currentBlock!=loadedBlock){
                    cacheLoad++;
                    loadedBlock=currentBlock;
                }
            }
            System.out.println(cacheLoad);
        }
    }
}
