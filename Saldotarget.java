/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldotarget;

/**
 *Nama : Moch Rizki Maulana N
 * Kelas : IF-1/S1/III
 * NIM : 10118012
 * Deskripsi Program: menghitung saldo tabungan berdasarkan saldo target
 * @author LENOVO
 */
public class Saldotarget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int saldo;
        int bunga;
        saldo = 3500000;
        for(int i =1; i <=12; i++){
            bunga = saldo * 8/100;
            saldo = bunga + saldo;
            if(saldo <= 6500000){
                System.out.println("Saldo Dibulan Ke-"+i+" Rp "+saldo);
            }
        }
    }
    
}
