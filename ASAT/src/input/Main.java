/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;


/**
 *
 * @author TEGAR RASYID
 */



import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Masukkan sesuatu:");

    String input = myObj.nextLine();

    try {
        double angka = Double.parseDouble(input);
        System.out.println("Angkanya adalah : " + angka);
    } catch (NumberFormatException e) {
        System.out.println("Input adalah String.");
    }

  }
}
