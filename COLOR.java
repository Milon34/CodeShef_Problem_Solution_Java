package CodeShef;

import java.util.Scanner;

public class COLOR {
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            char ch[]=sc.next().toCharArray();
            int countR=0,countG=0,countB=0;

            for (int i=0;i<n;i++){
                if (ch[i]=='R'){
                    countR++;
                }else if (ch[i]=='G'){
                    countG++;
                }else if (ch[i]=='B'){
                    countB++;
                }
            }
           int testVal=Math.max(countR,Math.max(countG,countB));
            System.out.println(n-testVal);



        }
    }
}
