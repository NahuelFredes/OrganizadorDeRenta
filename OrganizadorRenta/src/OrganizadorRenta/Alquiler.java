/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrganizadorRenta;

/**
 *
 * @author teodoro
 */
public class Alquiler {

    private int cant_adults;
    private int cant_ninos;
    private String strDateI;
    private String strDateF;

    public Alquiler() {
    }

    public Alquiler(int cant_adults, int cant_ninos, String strDateI, String strDateF) {
        this.cant_adults = cant_adults;
        this.cant_ninos = cant_ninos;
        this.strDateI = strDateI;
        this.strDateF = strDateF;
    }

    public int getCant_adults() {
        return cant_adults;
    }

    public void setCant_adults(int cant_adults) {
        this.cant_adults = cant_adults;
    }

    public int getCant_ninos() {
        return cant_ninos;
    }

    public void setCant_ninos(int cant_ninos) {
        this.cant_ninos = cant_ninos;
    }

    public String getStrDateI() {
        return strDateI;
    }

    public void setStrDateI(String strDateI) {
        this.strDateI = strDateI;
    }

    public String getStrDateF() {
        return strDateF;
    }

    public void setStrDateF(String strDateF) {
        this.strDateF = strDateF;
    }

}
