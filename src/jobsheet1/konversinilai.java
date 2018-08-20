/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet1;

/**
 *
 * @author SMK TELKOM
 */
import java.util.Scanner;
public class konversinilai {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("masukan niali WEB :");
        int nilai = masukan.nextInt();
        if (nilai >= 90)
            System.out.println("nilai a");
        else if (nilai >= 75)
            System.out.println("niali b");
        else if (nilai >= 50)
            System.out.println("nilai c");
        else if (nilai >= 35)
            System.out.println("nilai d");
        else 
            System.out.println("nilai e");

    }
}
