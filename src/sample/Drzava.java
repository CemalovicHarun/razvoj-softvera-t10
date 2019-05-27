package sample;

import java.io.Serializable;

public class Drzava implements Serializable {

        private String DrzavaNaziv;
        private int brojStanovnika;
        private double povrsina;
        private String jedinicaZaPovrsinu;
        private Grad GlavniGrad;

        public String getDrzavaNaziv() {
                return DrzavaNaziv;
        }

        public void setDrzavaNaziv(String drzavaNaziv) {
                DrzavaNaziv = drzavaNaziv;
        }

        public int getBrojStanovnika() {
                return brojStanovnika;
        }

        public void setBrojStanovnika(int brojStanovnika) {
                this.brojStanovnika = brojStanovnika;
        }

        public double getPovrsina() {
                return povrsina;
        }

        public void setPovrsina(double povrsina) {
                this.povrsina = povrsina;
        }

        public String getJedinicaZaPovrsinu() {
                return jedinicaZaPovrsinu;
        }

        public void setJedinicaZaPovrsinu(String jedinicaZaPovrsinu) {
                this.jedinicaZaPovrsinu = jedinicaZaPovrsinu;
        }

        public Grad getGlavniGrad() {
                return GlavniGrad;
        }

        public void setGlavniGrad(Grad glavniGrad) {
                GlavniGrad = glavniGrad;
        }
}
