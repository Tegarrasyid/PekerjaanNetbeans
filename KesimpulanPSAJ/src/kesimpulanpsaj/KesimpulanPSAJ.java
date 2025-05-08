/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kesimpulanpsaj;

import Operator.matematika;
import java.time.LocalDate;

/**
 *
 * @author TEGAR RASYID
 */
public class KesimpulanPSAJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Tipe data String
        String nama;
        String Nama; //case Sensitive
        int a=100;
        float b;
        boolean c;
        long d=10;
        d = a * d;
        
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date
        nama = "Latihan";
        
        matematika kubus = new matematika(); 
        matematika balok = new matematika(); 
        matematika limas = new matematika(); 
        matematika tabung = new matematika(); 
        
        int angka01 = kubus.tambah();
        kubus.tambah1(3);
        balok.tambah2(4, 3, 8);
        limas.tambah3(8, 12, 5);
        tabung.tambah4(2, 1, 4);
        System.out.println("Angka tambahnya :"+ angka01 );
    }
    
}
