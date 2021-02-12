package CodeShef;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Maximise_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long arr[] = new long[(int) n];
            for (long i = 0; i < n; i++) {
                arr[(int) i] = sc.nextInt();
            }
            Arrays.sort(arr);
            List<Long> l = new ArrayList<>();
            if (arr.length % 2 == 0) {
                l.add(arr[0]);
                l.add(arr[(arr.length / 2) + 1]);
                l.add(arr[arr.length - 1]);
            } else {
                l.add(arr[0]);
                l.add(arr[(arr.length / 2)]);
                l.add(arr[arr.length - 1]);
            }
            System.out.println(Math.abs(l.get(0)-l.get(1))+Math.abs(l.get(1)-l.get(2))+Math.abs(l.get(2)-l.get(0)));
        }
    }
}
class G {
    // Custom date format
    public static void main(String[] args) {

        String startDate = "12:00";
        String stopDate = " 11:42";
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");

        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(startDate);
            d2 = format.parse(stopDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Get msec from each, and subtract.
        long diff = d2.getTime() - d1.getTime();
        long diffSeconds = diff / 1000;
        long diffMinutes = diff / (60 * 1000);
        long diffHours = diff / (60 * 60 * 1000);
        List<String> l=new ArrayList<>();
        l.add(diffHours+":"+diffMinutes);
        System.out.println(l);
//        System.out.println("Time in seconds: " + diffSeconds + " seconds.");
//        System.out.println("Time in minutes: " + diffMinutes + " minutes.");
//        System.out.println("Time in hours: " + diffHours + " hours.");
    }
}
class teF{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==6){
            System.out.println(1);
        }else if (n==5){
            System.out.println(2);
        }else if (n==4){
            System.out.println(3);
        }else if (n==3){
            System.out.println(4);
        }else if (n==2){
            System.out.println(5);
        }else if (n==1){
            System.out.println(6);
        }
    }
}