/*
 * Copyright (C) 2021 roca12
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.roca12.java11.app;

import com.roca12.java11.data.Product;
import com.roca12.java11.data.Rating;
import java.math.BigDecimal;

/**
 * {@code Shop} class representa una aplicación que administra productos
 * @version 4.0
 * @author roca12
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p1 = new Product(101,"Te",BigDecimal.valueOf(1.99));
        Product p2 = new Product(102,"Café",BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        Product p3 = new Product(103,"Pastel",BigDecimal.valueOf(3.99), Rating.FIVE_STAR);
        Product p4 = new Product();
        System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getPrice()+" "+p1.getDiscount()+" "+p1.getRating().getStars());
        System.out.println(p2.getId()+" "+p2.getName()+" "+p2.getPrice()+" "+p2.getDiscount()+" "+p2.getRating().getStars());
        System.out.println(p3.getId()+" "+p3.getName()+" "+p3.getPrice()+" "+p3.getDiscount()+" "+p3.getRating().getStars());
        System.out.println(p4.getId()+" "+p4.getName()+" "+p4.getPrice()+" "+p4.getDiscount()+" "+p4.getRating().getStars());
    }
    
}
