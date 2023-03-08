import java.time.OffsetDateTime;  
import java.time.ZoneOffset;  
import java.util.Date;  

public class time2 {    

    public static void main(String args[])  
    {  

        System.out.println("BRT - Que horas são agora:"+new Date());  

        System.out.println("UTC  - Que horas são agora: "+getCurrentUtcTime());  
    }  

    public static OffsetDateTime getCurrentUtcTime() {        

        OffsetDateTime d1;  

        d1 = OffsetDateTime.now(ZoneOffset.UTC);  

        return d1;  
    }  
}  