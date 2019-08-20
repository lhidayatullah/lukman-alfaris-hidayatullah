/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi
        Double luas;
        int alas, tinggi;
        
        // membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        //Input
        System.out.println("== Program hitung luas segitiga ==");
        System.out.print("Input alas: ");
        alas = baca.nextInt();
        System.out.print("Input tinggi: ");
        tinggi = baca.nextInt();
        
        // proses
        luas = Double.valueOf((alas * tinggi) / 2);
        
        // output
        System.out.println("Luas = " + luas);
    }   
}
