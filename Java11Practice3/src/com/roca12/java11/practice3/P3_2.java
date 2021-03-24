package com.roca12.java11.practice3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class P3_2 {

    public static void main(String[] args) {
        double precio = 3.55;
        double ratio = 0.0056;
        precio = precio * ratio;
        precio = Math.round(precio * 100) / 100.0;
        System.out.println(precio);
        BigDecimal preciobd = BigDecimal.valueOf(precio);
        BigDecimal ratiobd = BigDecimal.valueOf(ratio);
        preciobd = preciobd.subtract(preciobd.multiply(ratiobd)).setScale(3, RoundingMode.HALF_UP);
        System.out.println(preciobd);
        ArrayList<Locale> list= new ArrayList<>();
        Locale ingles = Locale.US;
        Locale frances = Locale.FRANCE;
        Locale italiano = Locale.ITALY;
        Locale colombiano = new Locale("es", "CO");
        Locale espanol = Locale.forLanguageTag("es-ES");
        list.add(ingles);
        list.add(frances);
        list.add(italiano);
        list.add(colombiano);
        list.add(espanol);
        System.out.println("___________________");
        for (Locale locale : list) {
            NumberFormat currencyFormat= NumberFormat.getCurrencyInstance(locale);
            NumberFormat percentFormat= NumberFormat.getPercentInstance(locale);
            percentFormat.setMaximumFractionDigits(2);
            System.out.println(currencyFormat.format(precio));
            System.out.println(percentFormat.format(ratio));
        }
        

    }
}
