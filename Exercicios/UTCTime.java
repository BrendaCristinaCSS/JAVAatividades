import java.time.LocalDateTime;  
import java.time.LocalTime;  
import java.time.ZoneId;  
import java.time.ZonedDateTime;  
import java.util.Scanner;  
public class UTCTime {    
    public static void main(String[] args)  
    {  
        int hour1, hour2, min1, min2, sec1, sec2, yr1, yr2, month1, month2, day1, day2;  
        LocalDateTime date1, date2;  
        
        Scanner sc = new Scanner(System.in);  
       
        System.out.println("Enter Datetime for initializing the first LocaleDateTime object:");  
        System.out.println("Enter year:");  
        yr1 = sc.nextInt();  
        System.out.println("Enter month:");  
        month1 = sc.nextInt();  
        System.out.println("Enter day:");  
        day1 = sc.nextInt();  
        System.out.println("Enter hours:");  
        hour1 = sc.nextInt();  
        System.out.println("Enter minutes:");  
        min1 = sc.nextInt();  
        System.out.println("Enter seconds:");  
        sec1 = sc.nextInt();  

        date1 = LocalDateTime.of(yr1, month1, day1, hour1, min1, sec1);  
        System.out.println("Date1: " + date1);  

        System.out.println("UTC Time: "+getCurrentUtcTime(date1));  

        System.out.println("Enter Datetime for initializing the second LocaleDateTime object:");  
        System.out.println("Enter year:");  
        yr2 = sc.nextInt();  
        System.out.println("Enter month:");  
        month2 = sc.nextInt();  
        System.out.println("Enter day:");  
        day2 = sc.nextInt();  
        System.out.println("Enter hours:");  
        hour2 = sc.nextInt();  
        System.out.println("Enter minutes:");  
        min2 = sc.nextInt();  
        System.out.println("Enter seconds:");  
        sec2 = sc.nextInt();  

        sc.close();  

        date2 = LocalDateTime.of(yr2, month2, day2, hour2, min2, sec2);  
        System.out.println("Date2: " + date2);  

        System.out.println("UTC Time:"+getCurrentUtcTime(date2));  
    }  

    public static LocalTime getCurrentUtcTime(LocalDateTime ldt) {  

        LocalTime lTime;  

        ZonedDateTime ldtZoned = ldt.atZone(ZoneId.systemDefault());  

        ZonedDateTime utcZoned = ldtZoned.withZoneSameInstant(ZoneId.of("UTC"));  
        lTime =  utcZoned.toLocalTime();  

        return lTime;  
    }  
}  