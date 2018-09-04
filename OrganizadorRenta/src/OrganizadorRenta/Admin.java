
package OrganizadorRenta;


public class Admin {
    private int monto_mes;
    private int monto_total;

    public Admin() {
    }

    public Admin(int monto_mes, int monto_total) {
        this.monto_mes = monto_mes;
        this.monto_total = monto_total;
    }

    public int getMonto_mes() {
        return monto_mes;
    }

    public void setMonto_mes(int monto_mes) {
        this.monto_mes = monto_mes;
    }

    public int getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(int monto_total) {
        this.monto_total = monto_total;
    }
   
    
}
