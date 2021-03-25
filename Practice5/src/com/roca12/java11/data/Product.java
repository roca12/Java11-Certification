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
package com.roca12.java11.data;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * {@code Product} class representa las propiedades y comportamientos de los
 * objetos producto, en el sistema de administración de productos
 * <br>
 * Cada producto tiene un id, name y price
 * <br>
 * Cada producto puede tener un descuento, calculado en base a
 * {@link DESCUENTO descuento}
 *
 * @version 4.0
 * @author roca12
 */
public class Product {

    /**
     * Una constante que define un {@link java.math.BigDecimal BigDecimal} valor
     * del descuento
     * <br>
     * El descuento es de 10%
     */
    public static final BigDecimal DESCUENTO = BigDecimal.valueOf(0.1);
    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;

    public Product() {
        this(0,"no name",BigDecimal.ZERO);
    }

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, Rating.NOT_RATED);
    }

    public Rating getRating() {
        return rating;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public BigDecimal getPrice() {
        return price;
    }

//    public void setPrice(final BigDecimal price) {
//        this.price = price;
//    }

    /**
     * Calcula el descuento basado en el precio de un producto y
     * {@link DESCUENTO descuento}
     *
     * @return un {@link java.math.BigDecimal Bigdecimal} valor del descuento
     */
    public BigDecimal getDiscount() {
        return price.multiply(DESCUENTO).setScale(2, RoundingMode.HALF_UP);
    }
    
    public Product applyRating(Rating newRating){
        return  new Product(id, name, price, newRating);
    }

}
