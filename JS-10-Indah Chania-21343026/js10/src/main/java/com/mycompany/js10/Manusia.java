package com.mycompany.js10;

import java.util.Scanner;

/**
 * created by indah chania 21343026
 * @author indah
 */
public class Manusia {
    String nama, tempat_lahir, tgl_lahir;
    int berat_badan, tinggi_badan;
    
    public void inputdata(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama lengkap\t: ");
        nama = input.nextLine();
        System.out.print("Masukan tempat lahir\t: ");
        tempat_lahir = input.nextLine();
        System.out.print("Masukan tanggal lahir\t: ");
        tgl_lahir = input.nextLine();
        System.out.print("Masukan Berat Badan\t: ");
        berat_badan = input.nextInt();
        System.out.print("Masukan Tinggi Badan\t: ");
        tinggi_badan = input.nextInt();
    }
    
    public void identitas(){
        System.out.println("Nama saya \t: "+nama);
        System.out.println("Tempat Lahir \t: "+tempat_lahir);
        System.out.println("Tanggal Lahir \t: "+tgl_lahir);
        System.out.println("Berat Badan \t: "+berat_badan +"kg");
        System.out.println("Tinggi Badan \t: "+tinggi_badan +"cm");
    }
    
    public static void main(String[] args){
        Manusia A = new Manusia();
        A.inputdata();
        A.identitas();
    }
}
