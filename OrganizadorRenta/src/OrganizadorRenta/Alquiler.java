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

    private int CantAdults;
    private int CantNinos;
    private int Dinero;
    private String strDateI;
    private String strDateF;

    public Alquiler() {
    }

    public Alquiler(int CantAdults, int CantNinos, int Dinero, String strDateI, String strDateF) {
        this.CantAdults = CantAdults;
        this.CantNinos = CantNinos;
        this.Dinero = Dinero;
        this.strDateI = strDateI;
        this.strDateF = strDateF;
    }

    public int getCantAdults() {
        return CantAdults;
    }

    public void setCantAdults(int CantAdults) {
        this.CantAdults = CantAdults;
    }

    public int getCantNinos() {
        return CantNinos;
    }

    public void setCantNinos(int CantNinos) {
        this.CantNinos = CantNinos;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
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
