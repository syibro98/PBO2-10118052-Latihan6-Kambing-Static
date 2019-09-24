/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan6.kambing.pkgstatic;

/**
 * @author 
 * NAMA      : Bagus Syibro Malisi
 * KELAS     : PBO2
 * NIM       : 10118052
 * Deskripsi Program : Latihan ini bertujuan untuk menggunakan multi class dan
 * cara mengakes variabel dari class tersebut
 */
public class PBO210118052Latihan6KambingStatic {
    
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                            + Mamalia.jumlahKambing);
    }
    
}
