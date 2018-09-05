/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;
import java.util.Scanner;
/**
 *
 * @author Taka
 */
public class TesBBI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manusia laki = new Laki_laki(0);
        Manusia perempuan = new Perempuan(0);
        String Kelamin;
        System.out.println("User 1");
        System.out.print("Masukan Tinggi Badan Anda (cm) : ");
        laki.TinggiBadan = perempuan.TinggiBadan = input.nextDouble();
        System.out.print("Masukan Jenis Kelamin Anda (L/P) : ");
        Kelamin = input.next();
        switch (Kelamin)
        {
            case "L" : System.out.println("Berat Badan Ideal Laki-laki ini adalah : " + laki.HtgBBI());
            break;
            case "P" : System.out.println("Berat Badan Ideal Perempuan ini adalah : " + perempuan.HtgBBI());
            break;
        }
        System.out.println("\n");
        System.out.println("User 2");
        System.out.print("Masukan Tinggi Badan Anda (cm) : ");
        laki.TinggiBadan = perempuan.TinggiBadan = input.nextDouble();
        System.out.print("Masukan Jenis Kelamin Anda (L/P) : ");
        Kelamin = input.next();
        switch (Kelamin)
        {
            case "L" : System.out.println("Berat Badan Ideal Laki-laki ini adalah : " + laki.HtgBBI());
            break;
            case "P" : System.out.println("Berat Badan Ideal Perempuan ini adalah : " + perempuan.HtgBBI());
            break;
        }
    }
}
