/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pahamobjectke3;

/**
 *
 * @author TEGAR RASYID
 */
public class PahamObjectke3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tinggisegitiga,alassegitiga,luassegitiga;
        
        Segitiga segitiga01 = new Segitiga();
        segitiga01.setAlas(1.5);
        segitiga01.setTinggi(21);
        
        tinggisegitiga = segitiga01.getTinggi();
        alassegitiga = segitiga01.getAlas();
        luassegitiga = 0.5*(alassegitiga*tinggisegitiga);
        
        System.out.println("Alas segitiga : " + segitiga01.alas);
        System.out.println("Tinggi segitiga : " + segitiga01.tinggi);
        System.out.println(segitiga01.alas+segitiga01.tinggi);
    
        System.out.println("luas segitiga nya : " +luassegitiga);
        
        
        System.out.println();
        System.out.println();
        
        double sisikubus,luaskubus;
        
        Bangunruang kubus = new Bangunruang();
        kubus.setSisi(12);
        
        sisikubus = kubus.getSisi();
        luaskubus = 6*(sisikubus*sisikubus);
        
        System.out.println("Sisi kubusnya : " +kubus.sisi);
        System.out.println("Luas kubus nya : " + luaskubus);
        
        System.out.println();
        System.out.println();
        
        double panjangbalok,tinggibalok,lebarbalok,luasbalok;
        
        Bangunruang balok = new Bangunruang();
        balok.setLebar(5);
        balok.setPanjang(12);
        balok.setTinggi(4);
        
        panjangbalok = balok.getPanjang();
        lebarbalok = balok.getLebar();
        tinggibalok = balok.tinggi;
        luasbalok = 2* (panjangbalok*lebarbalok + panjangbalok*tinggibalok + lebarbalok*tinggibalok);
        
        System.out.println("Panjang balok : " +balok.panjang);
        System.out.println("Lebar balok : " +balok.lebar);
        System.out.println("Tinggi balok : " +balok.tinggi);
        System.out.println("Luas balok nya : " +luasbalok);
        
        
        System.out.println();
        System.out.println();
        
        
        double phibola, jarijaribola, luasbola;
        Bangunruang bola = new Bangunruang();
        bola.setJarijari(21);
        bola.setPhi(3.14);
        
        jarijaribola = bola.getJarijari();
        phibola = bola.getPhi();
        luasbola = 4* (phibola*jarijaribola*jarijaribola);
        
        System.out.println("Jari jari bola : " + bola.jarijari);
        System.out.println("Phi bola : " + bola.phi);
        System.out.println("Luas bola : " + luasbola);
        
        
        System.out.println();
        System.out.println();
        
        
        double phitabung,jarijaritabung, tinggitabung, luastabung;
        Bangunruang tabung = new Bangunruang();
        tabung.setJarijari(7);
        tabung.setPhi(3.14);
        tabung.setTinggi(12);
        
        jarijaritabung = tabung.getJarijari();
        phitabung = tabung.getPhi();
        tinggitabung =  tabung.getTinggi();
        luastabung = 2* (phitabung*jarijaritabung*tinggitabung)+ 2*(phitabung*jarijaritabung*jarijaritabung);
        
        System.out.println("Jari jari tabung : " +tabung.jarijari);
        System.out.println("Phi tabung : " +tabung.phi);
        System.out.println("Tinggi tabung : " +tabung.tinggi);
        System.out.println("Luas tabung : " +luastabung);
    }
}
