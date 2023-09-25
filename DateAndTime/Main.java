package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
       System.out.println(System.currentTimeMillis());
       System.out.println(System.nanoTime());

       LocalDate localDate = LocalDate.now();
       System.out.println(localDate);

       LocalTime localTime = LocalTime.now();
       System.out.println(localTime);

       LocalDateTime localdt = LocalDateTime.now();
       System.out.println(localdt);
       
       Date date = new Date();
       System.out.println(date);

       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
       String formatteddate = localDate.format(formatter);
       System.out.println(formatteddate);

       DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm:ss");
       String formatteddate2 = localTime.format(formatter2);
       System.out.println(formatteddate2);






       

    }
}
