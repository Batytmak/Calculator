package com.example.a4;

import android.widget.TextView;

public class CaclControlleer {
    Double A;
    Double B;
    Operacia oper;
    numbrController nc;


    public void setNc(numbrController nc){
        this.nc = nc;
    }

    public void slojit() {
        if (oper != null) {
            vychaclit();
        }
        if (!nc.getError()) {
            A = nc.getValue();
            oper = Operacia.SLOJENIE;
            nc.clear();
        }
    }

    public void vychest() {
        if (oper != null) {
            vychaclit();
        }
        if (!nc.getError()) {
            A = nc.getValue();
            oper = Operacia.VICHITANIE;
            nc.clear();
        }
    }

    public void umnojit() {
        if (oper != null) {
            vychaclit();
        }
        if (!nc.getError()) {
            A = nc.getValue();
            oper = Operacia.UMNOJENIE;
            nc.clear();
        }
    }

    public void delenie() {
        if (oper != null) {
            vychaclit();
        }
        if (!nc.getError()) {
            A = nc.getValue();
            oper = Operacia.DELENIE;
            nc.clear();
        }
    }

    public void procent() {
        if (oper != null) {
            vychaclit();
        }
        if (!nc.getError()) {
            A = nc.getValue();
            oper = Operacia.DELENIE;
            nc.clear();
        }
    }

    public void vychaclit(){
        B = nc.getValue();
        nc.clear();
        if (oper == Operacia.SLOJENIE){
             oper = null;
             Double R=A+B;
            nc.setResult(R);
        }
        if (oper == Operacia.VICHITANIE){
            oper = null;
            Double R=A-B;
            nc.setResult(R);
        }
        if (oper == Operacia.UMNOJENIE){
            oper = null;
            Double R=A*B;
            nc.setResult(R);
        }
        if (oper == Operacia.PROCENT){
            oper = null;
            Double R=A%B;
            nc.setResult(R);
        }

        if (oper == Operacia.DELENIE){
            oper = null;
            try {
                Double R = A / B;
                nc.setResult(R);
            }catch(Exception e){
                nc.setError();
            }
        }
    }
}
