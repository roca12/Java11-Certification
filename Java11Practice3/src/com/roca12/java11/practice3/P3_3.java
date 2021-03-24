
package com.roca12.java11.practice3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class P3_3 {

    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);
        System.out.println(hoy.plusYears(1).getDayOfWeek());
        LocalTime tiempo= LocalTime.of(12, 03);
        Duration duracion = Duration.between(LocalTime.now(), tiempo);
        System.out.println(duracion.toMinutes());
        LocalDateTime ahora = LocalDateTime.now();
        ZoneId bogota = ZoneId.of("America/Bogota");
        ZoneId katmandu = ZoneId.of("Asia/Katmandu");
        ZonedDateTime tiempobog = ZonedDateTime.of(ahora, bogota);
        System.out.println(tiempobog);
        ZonedDateTime tiempokat = ZonedDateTime.of(ahora, katmandu);
        System.out.println(tiempokat);
        String pattern ="EE' 'd' de 'MMMM yyyy' a las 'HH:mm z";
        DateTimeFormatter dateformat=DateTimeFormatter.ofPattern(pattern, Locale.forLanguageTag("es-CO"));
        System.out.println(dateformat.format(tiempobog));
    }
    
}
