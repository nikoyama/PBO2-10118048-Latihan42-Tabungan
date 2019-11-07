/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : penarikan uang
 */
public class Tabungan {
    
    private int saldo;
    Scanner scanner = new Scanner(System.in);

    public int getSaldo() {
        return saldo;
    }

    public Tabungan(int saldo) {
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : " );
        this.saldo = scanner.nextInt();
    }

    public int ambilUang(int jumlah) {
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = scanner.nextInt();
        System.out.print("Saldo Anda Sekarang : " + (saldo - jumlah));
        return saldo - jumlah;
    }
}
