package sample;

import jdk.internal.jline.extra.EditingHistory;

import java.io.Serializable;
import java.util.ArrayList;

public class Grad implements Serializable {
    private String GradNaziv;
    private int BrojStanovnika;
    private double temperature;

    public String getGradNaziv() {
        return GradNaziv;
    }

    public void setGradNaziv(String gradNaziv) {
        GradNaziv = gradNaziv;
    }

    public int getBrojStanovnika() {
        return BrojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        BrojStanovnika = brojStanovnika;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }








}
