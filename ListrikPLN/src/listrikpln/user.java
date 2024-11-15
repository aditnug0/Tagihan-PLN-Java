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
public class user {

    ArrayList<String> namaPlg = new java.util.ArrayList<String>();
    ArrayList<String> Alamat = new java.util.ArrayList<String>();
    ArrayList<String> Kelamin = new java.util.ArrayList<String>();
    ArrayList<Integer> Saldo = new java.util.ArrayList<Integer>();

    public user() {
        this.namaPlg.add("Ahmad Yusuf");
        this.Alamat.add("Dinoyo");
        this.Kelamin.add("Laki-laki");
        this.Saldo.add(250000);

        this.namaPlg.add("Muhammad Aldino");
        this.Alamat.add("Malang");
        this.Kelamin.add("Laki-laki");
        this.Saldo.add(300000);

        this.namaPlg.add("Hudan Islah ");
        this.Alamat.add("Prigen");
        this.Kelamin.add("Laki-laki");
        this.Saldo.add(100000);

        this.namaPlg.add("Muhammad Syafiq");
        this.Alamat.add("Lawang");
        this.Kelamin.add("Laki-laki");
        this.Saldo.add(400000);

        this.namaPlg.add("Muhammad Aditya");
        this.Alamat.add("Malang");
        this.Kelamin.add("Laki-laki");
        this.Saldo.add(420000);

        this.namaPlg.add("Daniel Dhanis");
        this.Alamat.add("Batu");
        this.Kelamin.add("Laki-laki");
        this.Saldo.add(200000);

    }

    public int getJumlahPlg() {
        return namaPlg.size();
    }
/*
    public int Total(int harga, int kwh) {
        return harga * kwh ;
    }
    
    public int sisaSaldo(int saldo, int Hitung){
        return saldo - Hitung ;
        
    }
  */  
}
