/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newshoes;

import java.util.Scanner;

/**
 *
 * @author lee_gerety sba19067
 */
public class NewShoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
        System.out.println("Please Select a brand: ");
        String brand = sc.nextLine();
        
        System.out.println("Please Select a make: ");
        String make = sc.nextLine();
        
        System.out.println("Please Select a colour: ");
        String colour = sc.nextLine();
        
        System.out.println("Please Select a size: ");
        int size = sc.nextInt();
        
        // Output customer request back to them
        
        System.out.println("Here is your Shoe of Choice");
        System.out.println("Brand Selected: " +brand);
        System.out.println("Make Selected: " +make);
        System.out.println("Colour Selected: " +colour);
        System.out.println("Size Selected" +size);
        
    }
    
}
