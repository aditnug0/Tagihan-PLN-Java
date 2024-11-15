/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listrikpln;

import java.util.ArrayList;

/**
 *
 * @author aditn
 */
public class pelanggan extends user {

    ArrayList<Integer> golongan = new java.util.ArrayList<Integer>();
    ArrayList<Integer> harga = new java.util.ArrayList<Integer>();

    public pelanggan() {
        this.golongan.add(1);
        this.harga.add(1000);

        this.golongan.add(2);
        this.harga.add(3500);

        this.golongan.add(3);
        this.harga.add(7000);

    }

    public int getGol() {
        return golongan.size();
    }

    public int totalBiaya(int harga, int kwh){
        return harga * kwh;
    }
    

//    public int totalBarang(int jumlah, int harga) {
//        return jumlah * harga;}
}
