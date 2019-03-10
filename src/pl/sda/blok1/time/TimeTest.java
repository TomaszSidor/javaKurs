package pl.sda.blok1.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeTest {

    public static void main(String[] args) {
        LocalDateTime myBirhday = LocalDateTime.of(1985,07,27,19,12);
        System.out.println(myBirhday + " " + myBirhday.getDayOfWeek() + " " + myBirhday.getMonth());

    }
}
