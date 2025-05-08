/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author TEGAR RASYID
 */
public class Perpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        Buku_lokal MalinKundang = new Buku_lokal();
        Buku_lokal MalinKunang = new Buku_lokal();
        Buku_lokal SalahAsuhan = new Buku_lokal();
        Buku_asing ArtificialIntelegensi = new Buku_asing();
        
        MalinKundang.insert_data(1," MalinKundang"," Marah Rusli");
        SalahAsuhan.insert_data(2, "Salah Asuhan", "Marah Rusli");
        ArtificialIntelegensi.insert_data(3," Data Science"," Van Rosum");
        MalinKundang.update_data();
        ArtificialIntelegensi.update_data();
        
        MalinKunang.cetak_buku();
        
    }
    
}
