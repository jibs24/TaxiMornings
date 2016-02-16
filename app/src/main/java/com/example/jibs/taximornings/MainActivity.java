package com.example.jibs.taximornings;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private int kmDep;
    private int kmArr;
    private double fact;
    private double carte;
    private double cheque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void setKmDep(EditText kmDep) {
        this.kmDep = Integer.valueOf(String.valueOf(kmDep.getText()));
    }

    public void setKmArr(EditText kmArr) {
        this.kmArr = Integer.valueOf(String.valueOf(kmArr.getText()));
    }

    public void setFact(EditText fact) {
        this.fact = Double.valueOf(String.valueOf(fact.getText()));
    }

    public void setCarte(EditText carte) {
        this.carte = Double.valueOf(String.valueOf(carte.getText()));
    }

    public void setCheque(EditText cheque) {
        this.cheque = Double.valueOf(String.valueOf(cheque.getText()));
    }

    public int getKmDep() {
        return kmDep;
    }

    public int getKmArr() {
        return kmArr;
    }

    public double getFact() {
        return fact;
    }

    public double getCarte() {
        return carte;
    }

    public double getCheque() {
        return cheque;
    }

    public double calcul(int kmArr, int kmDep, double fact, double carte, double cheque){
        double price  =107;
        price += (kmArr-kmDep)*0.15;
        price =price- (fact + cheque)*0.975;
        price =price - carte*0.95;

        return price;

    }

    public void okButtonClick(View view) {
        EditText kmD = (EditText) findViewById(R.id.sendKmDep);
        setKmDep(kmD);

        EditText kmA = (EditText) findViewById(R.id.sendKmArr);
        setKmArr(kmA);

        EditText fact = (EditText) findViewById(R.id.sendFacture);
        setFact(fact);



        EditText carte = (EditText) findViewById(R.id.sendCard);
        setCarte(carte);

        EditText cheq = (EditText) findViewById(R.id.sendCheques);
        setCheque(cheq);


        final double PRICE =calcul(getKmArr(), getKmDep(), getFact(), getCarte(), getCheque());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Price A corriger" + PRICE, Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
            }
        });

    }

    public void cancelButton(View view) {

        finish();
    }
}
