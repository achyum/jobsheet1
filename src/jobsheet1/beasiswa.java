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
public class beasiswa {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("masukan nilai TPA :");
        int TPA = masukan.nextInt();
        System.out.print("masukan nilai bahasa inggris :");
        int bahasainggris = masukan.nextInt();
        if ((TPA > 85) && (bahasainggris > 80))
            System.out.println("siswa dapat beasiswa");
        else
            System.out.println("siswa tidak dapat beasiswa");
    }
}
