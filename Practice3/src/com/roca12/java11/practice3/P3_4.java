package com.roca12.java11.practice3;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class P3_4 {

    public static void main(String[] args) {
        double precio = 3.55;
        double ratio = 0.0056;
        precio = precio * ratio;
        precio = Math.round(precio * 100) / 100.0;
        Locale colombia = new Locale("es", "CO");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(colombia);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(colombia);
        percentFormat.setMaximumFractionDigits(2);
        String preciotxt = currencyFormat.format(precio);
        String descuentotxt = percentFormat.format(ratio);
        LocalDateTime ahora = LocalDateTime.now();

        String objeto = "carro";

        ResourceBundle msg = ResourceBundle.getBundle("resources/messages", colombia);
        String pattern = msg.getString("dateFormat");
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern(pattern, Locale.forLanguageTag("es-CO"));
        ZoneId bogota = ZoneId.of("America/Bogota");
        ZonedDateTime tiempobog = ZonedDateTime.of(ahora, bogota);
        String tiempotxt = dateformat.format(tiempobog);
        String offerPattern = msg.getString("offer");
        System.out.println(MessageFormat.format(offerPattern, objeto, preciotxt, descuentotxt, tiempotxt));

        Locale usa = new Locale("en", "US");
        ResourceBundle msg2 = ResourceBundle.getBundle("resources/messages", usa);
        String pattern2 = msg2.getString("dateFormat");
        DateTimeFormatter dateformat2 = DateTimeFormatter.ofPattern(pattern2, usa);
        ZoneId nuevayork = ZoneId.of("America/Los_Angeles");
        ZonedDateTime tiempousa = ZonedDateTime.of(ahora, nuevayork);
        String tiempotxt2 = dateformat2.format(tiempousa);
        String offerPattern2 = msg2.getString("offer");
        System.out.println(MessageFormat.format(offerPattern2, objeto, preciotxt, descuentotxt, tiempotxt2));

    }
}
