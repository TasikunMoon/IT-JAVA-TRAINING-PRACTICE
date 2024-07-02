package java_basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateTopic {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfWeek());

        LocalDateTime nowInBangladesh = LocalDateTime.now(ZoneId.of("Asia/Dhaka"));
        System.out.println("nowInBangladesh");

        LocalDateTime nowInSydney = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println("nowInSydney");

        System.out.println("Australia = "+ nowInSydney);


        for (String Zone: ZoneId.getAvailableZoneIds()){
            System.out.println(Zone);
        }







    }
}
