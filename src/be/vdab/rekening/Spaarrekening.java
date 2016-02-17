/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.rekening;

import be.vdab.util.RekeningNummerException;

public class Spaarrekening extends Rekening {
    private static double intrest;
     
    public Spaarrekening(String reknr, double intrest) throws RekeningNummerException { 
        super (reknr); 
        Spaarrekening.intrest = intrest;
    }

    public Spaarrekening(String reknr, double intrest, double saldo) throws RekeningNummerException {
        super(reknr, saldo);
        Spaarrekening.intrest = intrest;
    } 
    public static double getIntrest() {
        return intrest;
    }

    public static void setIntrest(double intrest) {
        Spaarrekening.intrest = intrest;
    }
    
    @Override
    public void afhalen(double bedrag) { 
        if (bedrag > 0.0) {
            double testSaldo = getSaldo()- bedrag;
            if (testSaldo >= 0) {
                super.afhalen(bedrag);
            }
        }
    }
    
    @Override
    public String toString() { 
        return super.toString() + ", " + intrest; 
    } 
    
    @Override
    public double berekenIntrest() { 
        return getSaldo() * intrest / 100;
    } 
}
