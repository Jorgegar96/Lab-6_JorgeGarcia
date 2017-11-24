/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
public class Ser {
    
    private String raza;
    private int ki;
    private int años_max;
    private String planeta;

    public Ser() {
    }

    public Ser(String raza, int ki, int años_max, String planeta) {
        this.raza = raza;
        this.ki = ki;
        this.años_max = años_max;
        this.planeta = planeta;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getAños_max() {
        return años_max;
    }

    public void setAños_max(int años_max) {
        this.años_max = años_max;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return "Ser{" + "raza=" + raza + ", ki=" + ki + ", a\u00f1os_max=" + años_max + ", planeta=" + planeta + '}';
    }
    
    
    
}
