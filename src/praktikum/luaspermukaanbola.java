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
public class luaspermukaanbola {
    public static void main(String[] args) {
         Scanner masukan = new Scanner (System.in);
         int r;
         System.out.print("masukkan nilai jari jari :");
        r = masukan.nextInt();
        System.out.println("===============================");
        System.out.println("menghitung luas permukaan bola");
        System.out.println("===============================");
        System.out.println("luas permukaan balok = " + 4 * 3.14 * 7 * 7);
       
    }
}
