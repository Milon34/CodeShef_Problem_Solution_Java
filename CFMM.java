package CodeShef;

import java.util.*;

public class CFMM {
    static long mostFrequent(long arr[], long n)
    {
        Arrays.sort(arr);
        long max_count = 1, res = arr[0];
        int curr_count = 1;
        for (long i = 1; i < n; i++)
        {
            if (arr[(int) i] == arr[(int) (i - 1)])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = arr[(int) (i - 1)];
                }
                curr_count = 1;
            }
        }
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = arr[(int) (n - 1)];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        String sf="";
        while (t-- > 0) {
            long n = sc.nextLong();

            long countC = 0, countO = 0, countD = 0, countE = 0, countH = 0, countF = 0;
            for (long i = 0; i < n; i++) {
                String s = sc.next();
                char ch[] = s.toCharArray();
                for (int j = 0; j < s.length(); j++) {
                    if (ch[j] == 'c') {
                        countC++;
                    } else if (ch[j] == 'o') {
                        countO++;
                    } else if (ch[j] == 'd') {
                        countD++;
                    } else if (ch[j] == 'e') {
                        countE++;
                    } else if (ch[j] == 'h') {
                        countH++;
                    } else if (ch[j] == 'f') {
                        countF++;
                    }
                }
            }

            List<Long> arr = new LinkedList<>();

            countC /=2;
            countE /=2;

            arr.add(countC);
            arr.add(countO);
            arr.add(countE);
            arr.add(countD);
            arr.add(countH);
            arr.add(countF);

            Collections.sort(arr);

            long res =  arr.get(0);
            sf+=res+"\n";


        }
        System.out.println(sf);
        //sf=null;
//for (long i=0;i<arr.length;i++){
//    System.out.print(arr[(int) i]+" ");
//}
//            System.out.println();
            //System.out.println(mostFrequent(arr,arr.length));

//           int max=0,count=0;
//           for (int i=0;i<arr.length;i++){
//               for (int j=0;j<arr.length;j++){
//                   if (arr[i]==arr[j]){
//                       count++;
//                   }
//               }
//           }
//            System.out.println(max);
            //System.out.println(countE);

        }
    }

