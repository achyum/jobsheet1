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
public class fungsipengembaliannilai {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a,b,c;
        System.out.println("program menjumlahkan 2 nilai");
        System.out.print("masukkan nilai a: ");
        a = masukan.nextInt();
        System.out.print("masukkan nilai b: ");
        b = masukan.nextInt();
        System.out.print("masukkan nilai c: ");
        c = masukan.nextInt();
        System.out.println();
        System.out.println("jumlah a+b :" +(jumlah(a,b)));
        System.out.println("jumlah b+c :" +(jumlah(b,c)));
        System.out.println("jumlah a+c :" +(jumlah(a,c)));
    }
    private static int jumlah(int a,int b){
    int hasil = a+b;
    return hasil;
    }

    
}
