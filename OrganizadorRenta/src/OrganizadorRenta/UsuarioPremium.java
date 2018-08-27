package OrganizadorRenta;

import java.util.Date;

public class UsuarioPremium extends Usuario {

    private String tarjetaCredito;

    public UsuarioPremium() {

    }

    public UsuarioPremium(String nombre, String apellido, String contraseña, Date nacimiento, String correo) {
        super(nombre, apellido, contraseña, nacimiento, correo);
        this.tarjetaCredito = tarjetaCredito;
    }

    @Override
    public void precioAlquiler(int costo) {
        this.costo = (costoPorDia * cantDias) - descuento;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

}
