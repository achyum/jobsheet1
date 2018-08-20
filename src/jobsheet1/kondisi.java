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
public class kondisi {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.print("masukan nilai akhir PBO :");
        nilai = masukan.nextInt();
        if (nilai < 70)
        System.out.println("siswa tidak lulus");
        if (nilai > 70)
        System.out.println("siswa lulus");
    }
}
