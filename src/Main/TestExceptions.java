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
public class TestExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String test = "yes";
        //String test = "no";
        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");
        } 
        catch (ScaryException ex ) { 
            System.out.println("scary exception");
        } 
        finally {
            System.out.println("finally");
        }
        System.out.println("end of main");
    }
       
    static void doRisky(String test) throws ScaryException {
        System.out.println("start risky"); 
        if ("yes".equals(test)) {
            throw new ScaryException();
        } else { 
        }
        System.out.println("end risky");

    }
    
}
