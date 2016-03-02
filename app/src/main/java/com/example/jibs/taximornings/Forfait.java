package com.example.jibs.taximornings;

import java.util.Date;

/**
 * Created by DJibs on 17-Feb-16.
 */
public class Forfait {

    private Date date;
    private int kmDepart;
    private int kmArrivee;
    private double cheques;
    private double factur;
    private double carte;
    private double prix;
    private final double forfait=102;


    public Forfait(int kmDepart, int kmArrivee, double cheques, double factur, double carte) {
        this.kmDepart = kmDepart;
        this.kmArrivee = kmArrivee;
        this.cheques = cheques;
        this.factur = factur;
        this.carte = carte;
        this.date = new Date();
    }

    public int getKmArrivee() {
        return kmArrivee;
    }

    public double getCheques() {
        return cheques;
    }

    public double getFactur() {
        return factur;
    }

    public double getCarte() {
        return carte;
    }

    public int getKmDepart() {
        return kmDepart;
    }

    public Date getDate() {
        return date;
    }
}
