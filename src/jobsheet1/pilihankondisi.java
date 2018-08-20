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
public class pilihankondisi {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("silakan pilih 1-3 :");
        int bil = masukan.nextInt();
        switch(bil){
            case 1 : System.out.println("satu");
            break;
            case 2 : System.out.println("dua");
            break;
            case 3 : System.out.println("tiga");
            break;
        }
    }
}
