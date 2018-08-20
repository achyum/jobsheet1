/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author SMK TELKOM
 */
import java.util.Scanner;
public class konversisuhu {
    public static void main(String[] args) {
         Scanner masukan = new Scanner (System.in);
         int c;
         System.out.print("masukkan suhu dalam celcius :");
        c = masukan.nextInt();
        System.out.println("===================================================");
        System.out.println("menghitung celsius ke kelvin, reamur dan fahrenheit");
        System.out.println("===================================================");
        System.out.println(" fahrenheit = " +((c * 9/5) + 32));
        System.out.println(" reamur = " +( c * 4/5));
        System.out.println(" kelvin = " +(c + 273));
    }
}
