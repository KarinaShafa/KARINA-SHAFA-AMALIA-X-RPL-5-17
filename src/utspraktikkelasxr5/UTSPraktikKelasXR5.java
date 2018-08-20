/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspraktikkelasxr5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class UTSPraktikKelasXR5 {

public static void main (String [] args){
 String toko = "Karina Mart";
 System.out.println("Toko "+ toko);
 String alamat = "Jl. Danau Kerinci V, Sawojajar";
 System.out.println("Alamat "+ alamat);
 Scanner  scanner = new Scanner(System.in);

   //Harga barang
        int a = 20000;
        int Buku = a;
        System.out.println("Harga Buku = Rp "+a);
        
        int b = 10000;
        int Bolpoin = b;
        System.out.println("Harga Bolpoin = Rp "+b);
        
        int c = 7500;
        int Pensil = c;
        System.out.println("Harga Pensil = Rp "+c);
        
        int d = 5000;
        int Penggaris = d;
        System.out.println("Harga Penggaris = Rp "+d);
        
        int e = 25000;
        int TipeX = e;
        System.out.println("Harga TipeX = Rp "+e);
        
        System.out.println("Berapa Buku yang ingin anda beli?");
        int JumlahBuku = scanner.nextInt();
        System.out.println("Jumlah harga Buku yang ingin anda beli adalah = " + JumlahBuku);
        int JumlahHargaBuku = a*JumlahBuku;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaBuku);
        
        System.out.println("Berapa Penghapus yang ingin anda beli?");
        int JumlahBolpoin = scanner.nextInt();
        System.out.println("Jumlah harga Bolpoin yang ingin anda beli adalah = " + JumlahBolpoin);
        int JumlahHargaBolpoin = b*JumlahBolpoin;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaBolpoin);
        
        System.out.println("Berapa Pensil yang ingin anda beli?");
        int JumlahPensil = scanner.nextInt();
        System.out.println("Jumlah harga Pensil yang ingin anda beli adalah = " + JumlahPensil);
        int JumlahHargaPensil = c*JumlahBuku;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaPensil);
        
        System.out.println("Berapa Tas yang ingin anda beli?");
        int JumlahPenggaris = scanner.nextInt();
        System.out.println("Jmlah harga Tas yang ingin anda beli adalah = " + JumlahPenggaris);
        int JumlahHargaPenggaris = d*JumlahPenggaris;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaPenggaris);
        
        System.out.println("Berapa TipeX yang ingin anda beli?");
        int JumlahTipeX = scanner.nextInt();
        System.out.println("Jmlah harga Bolpoin yang ingin anda beli adalah = " + JumlahTipeX);
        int JumlahHargaTipeX = e*JumlahTipeX;
        System.out.println("Total Harga = "+ "Rp "+ JumlahHargaTipeX); 
        
        int TotalBarang = JumlahHargaBuku + JumlahHargaBolpoin + JumlahHargaPensil +
                             JumlahHargaPenggaris + JumlahHargaTipeX;
        
        System.out.println("       ");
        System.out.println("====TOTAL HARGA====");
        
        if (TotalBarang >= 500000){
               System.out.println("Total Harga Awal = "+"Rp "+ TotalBarang);
               System.out.println("Total Pembelian Lebih dari 500000 diskon 50%");
               int TotalSetelahDiskon = (TotalBarang / 2);
               System.out.println("Total Harga = "+"Rp "+TotalSetelahDiskon);
        }
        else if (TotalBarang >= 200000){
               System.out.println("Total Harga Awal = "+"Rp "+ TotalBarang);
               System.out.println("Total Pembelian Lebih dari 200000 diskon 20%");
               int TotalSetelahDiskon = (TotalBarang-TotalBarang *2/10);
               System.out.println("Total Harga = "+"Rp "+TotalSetelahDiskon);
    }
        else if (TotalBarang >= 100000){
               System.out.println("Total Harga Awal = "+"Rp "+ TotalBarang);
               System.out.println("Total Pembelian Lebih dari 100000 diskon 10%");
               int TotalSetelahDiskon = (TotalBarang-TotalBarang *1/10);
               System.out.println("Total Harga = "+"Rp "+TotalSetelahDiskon);
    }
        else System.out.println("Total Harga = "+"Rp "+ TotalBarang);
        System.out.println("Kasir : Karina Shafa Amalia");
        System.out.println("Terimaksih Sudah Berbelanja Disini");
}
}
