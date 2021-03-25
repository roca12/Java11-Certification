
package com.roca12.java11.practice3;


public class P3_1 {

 
    public static void main(String[] args) {
       String frase = "hola mundo";
       String copia=frase.intern();
       String parte=frase.substring(3, 7);
       System.out.println(frase+" "+copia+" "+parte);
    }
    
}
