/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan9tugas2.java;
import java.util.Scanner; //Import statement untuk Scanner

/**
 *
 * @author HP
 */
public class Pertemuan9tugas2Java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input nilai awal dan nilai akhir
        System.out.print("Masukan bilangan awal: ");
        int nilaiAwal = scanner.nextInt();
        
        System.out.print("Masukan bilangan akhir: ");
        int nilaiAkhir = scanner.nextInt();
        
        // Validasi input
        if (nilaiAwal > nilaiAkhir) {
            System.out.println("Bilangan akhir harus lebih besar atau sama dengan bilangan awal.");
        } else {
            // Menampilkan hasil deret bilangan dengan pertambahan 5
            System.out.println("Hasil deret bilangan:");
            
            for (int i = nilaiAwal; i <=nilaiAkhir; i +=5) {
                System.out.println(i);
                
                if(i + 5 <= nilaiAkhir) {
                   System.out.print(",");                  
                }
            }
            System.out.println(); //Baris baru setelah deret selesai
        }
        scanner.close();
    }
}
