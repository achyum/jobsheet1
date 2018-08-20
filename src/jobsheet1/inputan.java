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
public class inputan {
    public static void main(String[] args) {
       Scanner masukan = new Scanner (System.in);
        int a, b;
        System.out.print("masukkan nilai a:");
        a = masukan.nextInt();
        System.out.print("masukan nilai b:");
        b = masukan.nextInt();
        System.out.println();
        System.out.println("nilai variabel yang ada pada program :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
