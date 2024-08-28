/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6tugas1.java;

/**
 *
 * @author HP
 */
public class Pertemuan6tugas1Java {

    public static void main(String[] args) {
        
        // Input pertama
        String niml = "1111";
        String namal = "Agustus";
        int nilail = 85;
        
        // Display input pertama
        System.out.println("NIM ? : " + niml);
        System.out.println("NAMA ? : " + namal);
        System.out.println("NILAI ? : " + nilail);
        
        // Output pertama
        System.out.println("grade " + determinGrade(nilail));
        
        // Input kedua
        String nim2 = "1112";
        String nama2 = "Indah";
        int nilai2 = 75;
        
        // Display input kedua
        System.out.println("NIM  ? : " + nim2);
        System.out.println("NAMA ? : " + nama2);
        System.out.println("NILAI? : " + nilai2);
        
        // Output kedua
        System.out.println("grade " + determinGrade(nilai2));
        
        // Input ketiga
        String nim3 = "1113";
        String nama3 = "Rendi";
        int nilai3 = 65;
        
        // Display input ketiga
        System.out.println("NIM  ? : " + nim3);
        System.out.println("NAMA ? : " + nama3);
        System.out.println("NILAI? : " + nilai3);
        
        // Output ketiga
        System.out.println("grade " + determinGrade(nilai3));
    }

    // Method untuk menentukan grade berdasarkan nilai
    public static String determinGrade(int nilai) {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 75) {
            return "B";
        } else if (nilai >= 65) {
            return "C";
        } else if (nilai >= 55) {
            return "D";
        } else {
            return "E";
        }
    }
}
