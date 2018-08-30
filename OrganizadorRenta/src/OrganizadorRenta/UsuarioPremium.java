package OrganizadorRenta;

import java.util.Date;

public class UsuarioPremium extends Usuario {

    private String tarjetaCredito;
    private int descuento;
    private boolean premium;

    public UsuarioPremium() {

    }

    public UsuarioPremium(String tarjetaCredito, int descuento, boolean premium, String nombre, String contraseña, String apellido, Date nacimiento, String correo, int precio, int costoPorDia, int cantDias) {
        super(nombre, contraseña, apellido, nacimiento, correo, precio, costoPorDia, cantDias);
        this.tarjetaCredito = tarjetaCredito;
        this.descuento = descuento;
        this.premium = premium;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public void calcDescuento(int precio) {
        descuento = (30 * 100) / precio;
    }

    @Override
    public int precioAlquiler() {
        precio = (costoPorDia * cantDias) - descuento;
        return precio;

    }

}
