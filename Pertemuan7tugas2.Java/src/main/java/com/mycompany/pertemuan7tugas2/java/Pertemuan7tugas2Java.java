/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan7tugas2.java;

/**
 *
 * @author HP
 */
public class Pertemuan7tugas2Java {

    public static void main(String[] args) {
        String NIM = "1111111";
        String NAMA = "Agustav";
        int TAHUN = 3;
        char PEMINATAN = 'M';
        
        switch( TAHUN ) {
            case 1:
            System.out.println("Bahasa Inggris, Matematika, Sain");
            break;
            case 2:
            System.out.println("Algoritma, Logika Informatika");
            break;
            case 3:
        switch (PEMINATAN) {
            case 'M':
            System.out.println("Pemograman Mobile, Pemograman Java 2");
            break;
            case 'C':
            System.out.println("Organisasi Komputer, Multimedia");
            break;
            case 'E':
            System.out.println("Perancangan Sistem,Pemograman WEB");
            break;
        }
        }
    }
}
