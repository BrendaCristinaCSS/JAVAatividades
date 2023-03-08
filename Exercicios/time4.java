import java.util.Date;
import java.text.SimpleDateFormat;
 
public class time4 {
   
    public static void main(String[] args)
    {
        Date date = new Date();
 
       
        System.out.println("Que horas sao agora : " + date);
 
        SimpleDateFormat formatTime = new SimpleDateFormat("hh.mm aa");
        
 
        String time = formatTime.format(
            date); 
      
        System.out.println(
            "A hora atual no formato AM/PM e : " + time);
    }
}