/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author marc.wouters
 */
public class IntroInExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try { 
            int result = 7 / 0;
            System.out.println("Deze code wordt alleen uitgevoerd" + 
                               " wanneer er geen fout optreedt.");
            System.out.println(result);

        } 
        catch (ArithmeticException ex) { 
            System.out.println(ex.getMessage()); 
        }
        try {
            String tekst = "abc";
            int tekstInGetalwaarde  = Integer.parseInt(tekst);
            int result = tekstInGetalwaarde / 4;
            System.out.println(result); 
        }
        catch (NumberFormatException ex) { 
        // kan ook zijn: catch (IllegalArgumentException ex) 
            System.out.println(ex.getMessage());
        } 
        try {
            int[] cijfers = { 12, 5, 28, 37};
            System.out.println("Het 7e element is: " + cijfers[6]);
        } 
        catch (ArrayIndexOutOfBoundsException ex) {             
            System.out.println(ex.getMessage()); 
        } 
        
       //String tekst = "2";
        //  String tekst = "6";
          String tekst = "abc";

    try {
       int[] cijfers = { 12, 5, 28, 37};
       System.out.println("Element uit de array: " + cijfers[Integer.parseInt(tekst)]); 
       System.out.println("Deze code wordt alleen uitgevoerd" + " wanneer er geen fout optreedt.");
    }
    catch(ArrayIndexOutOfBoundsException ex) {
       System.out.println("ArrayIndexOutOfBoundsException: " + ex.getMessage());
    }
    catch(NumberFormatException ex) {
       System.out.println("NumberFormatException: " + ex.getMessage());
    }
    catch(RuntimeException ex) {
       System.out.println("RuntimeException: " + ex.getMessage());
    } 
    }
    
}
