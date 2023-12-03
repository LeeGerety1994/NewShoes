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
        Scanner sc = new Scanner (System.in);
        // Menu page where user agrees to continue picking shoe
        System.out.println("Please Say yes/no if you want to continue choosing your");
        String agreement = sc.nextLine();
        if (agreement.equals("yes")){
            System.out.println("Exciting! lets pick some shoes");
    }
        
        
        
        
    }
    
}
