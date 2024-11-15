/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listrikpln;

import java.util.Scanner;

/**
 *
 * @author aditn
 */
public class ListrikPLN {

    /**
     * @param args the command line arguments
     */
    public int jmlPakai;
    public int hasil;

    public int getJmlPakai() {
        return jmlPakai;
    }

//    pembayaran 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        pelanggan p = new pelanggan();
        user u = new user();
        kasir k = new kasir();

        System.out.println("Pembayaran PLN \n");
        System.out.println("Pilih profil pelanggan");
        System.out.println("No\tNama pelanggan\t\tAlamat\t\tJenis kelamin\tSaldo (Rp.)");
        for (int o = 0; o < u.getJumlahPlg(); o++) {
            System.out.println(o + 1 + "\t" + u.namaPlg.get(o) + "\t\t" + u.Alamat.get(o) + "\t\t" + u.Kelamin.get(o) + "\t" + u.Saldo.get(o));
        }

        System.out.println("Pilih id pelanggan : ");
        int plg = scan.nextInt();

        System.out.println("\nPilh Golongan Listrik : ");
        System.out.println("No   Golongan\tHarga/Kwh");
        for (int g = 0; g < p.getGol(); g++) {
            System.out.println(g + 1 + "    " + p.golongan.get(g) + "\t\tRp." + p.harga.get(g));
        }

        System.out.println("Nomor : ");
        int gl = scan.nextInt();

        System.out.println("\nJumlah Pakai : (Kwh)");
        int listrik = scan.nextInt();
        if (gl == 1) {
            int hasil = listrik * 1000;
            System.out.println("Total biaya : Rp." + hasil);

        } else if (gl == 2) {
            int hasil = listrik * 3500;
            System.out.println("Total biaya : Rp." + hasil);

        } else if (gl == 3) {
            int hasil = listrik * 7000;
            System.out.println("Total biaya : Rp." + hasil);

        } else {
            System.out.println("Data tidak valid");
        }
        System.out.println("tagihan atas nama " + u.namaPlg.get(plg - 1));
//        int total = p.totalBiaya(getJmlPakai(), p.harga.get(g1 - 1));
        /*   int jmlPakai = u.Total(gl, kwh);
        System.out.println(jmlPakai);
         */
//        int total = p.totalBarang(t.getJumlahBeli(), p.harga.get(pilJen - 1));
    }

}
