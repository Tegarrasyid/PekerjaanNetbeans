/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg1;

/**
 *
 * @author TEGAR RASYID
 */
public class Tes1Tegar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Tegar Rasyid AL Aziz ");
        System.out.print("RPL XI 1 ");
        
        System.out.println("");
        System.out.println("");
         
        HDarat sapi = new HDarat ();
        HDarat beruang = new HDarat ();
        HDarat harimau = new HDarat ();
        
       
        sapi.makan = "Sapi Makan Rumput";
        System.out.println(sapi.makan);
        beruang.makan = "Beruang Makan Rumput";
        System.out.println(beruang.makan);
        harimau.makan = "Harimau Makan Rumput";
        System.out.println(harimau.makan);
        
        System.out.println("");
        
        HLaut Hiu = new HLaut ();
        HLaut cumicumi = new HLaut ();
        HLaut lobster = new HLaut ();
        
        Hiu.makan = "Hiu Makan Daging";
        System.out.println(Hiu.makan);
        cumicumi.makan = "cumicumi Makan ikan";
        System.out.println(cumicumi.makan);
        lobster.makan = "lobster Makan ikan kecil";
        System.out.println(lobster.makan);
        
        System.out.println("");
        
        HUdara merpati = new HUdara ();
        HUdara elang = new HUdara ();
        HUdara kelelawar = new HUdara ();
        
        merpati.makan = "Merpati Makan Jagung";
        System.out.println(merpati.makan);
         elang.makan = "Elang Makan Daging";
        System.out.println(elang.makan);
         kelelawar.makan = "Kelelawar Makan Serangga";
        System.out.println(kelelawar.makan);
    }
    
}
