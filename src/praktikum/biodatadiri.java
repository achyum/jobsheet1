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
public class biodatadiri {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        String nama, nis, tmp, tgl, jns, alamat, motto;
        System.out.println();
        System.out.print("nama :");
        nama = masukan.nextLine();
        System.out.print("nis :");
        nis = masukan.nextLine();
        System.out.print("tempat lahir :");
       tmp = masukan.nextLine();
       System.out.print("tanggal lahir :");
       tgl = masukan.nextLine();
       System.out.print("jenis kelamin :");
      jns = masukan.nextLine();
       System.out.print("alamat di malang :");
      alamat = masukan.nextLine();
       System.out.print("motto hidup :");
      motto = masukan.nextLine();
    }
    
}

