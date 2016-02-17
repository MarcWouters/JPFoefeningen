/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.rekening;

import be.vdab.util.RekeningNummerException;

/**
 *
 * @author marc.wouters
 */
public class Zichtrekening extends Rekening {
    private int maxKrediet; 
    private static double INTREST_ZICHTREKENING = 0.25; 

    public Zichtrekening(String rekeningNummer,int bedrag) throws RekeningNummerException { 
        super(rekeningNummer);
        maxKrediet = bedrag;
    }
     
    public Zichtrekening(String rekeningNummer, double saldo, int bedrag) throws RekeningNummerException {
        super(rekeningNummer, saldo);
        maxKrediet = bedrag;
    }
 
    public int getMaxKrediet() {
        return maxKrediet;
    }
 
    public void setMaxKrediet(int maxKrediet) {
        this.maxKrediet = maxKrediet;
    }  
    
    @Override
    public void afhalen(double bedrag) {
        if (bedrag > 0.0) { 
            double testSaldo = getSaldo() - bedrag + maxKrediet;
            if (testSaldo >= 0) 
                super.afhalen(bedrag); 
        } 
    } 
    
    @Override
    public String toString() { 
        return super.toString() + ", " + maxKrediet;
    } 
    
    @Override
    public double berekenIntrest() { 
        if (getSaldo() > 0)         
            return getSaldo() * INTREST_ZICHTREKENING / 100;
        else
            return 0.0;
    } 
}
