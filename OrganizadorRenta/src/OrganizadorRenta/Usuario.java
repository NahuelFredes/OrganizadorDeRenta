package OrganizadorRenta;

import java.util.Date;

public class Usuario {

    private String nombre;
    private String contraseña;
    private String apellido;
    private Date nacimiento;
    private String correo;
    public int precio;
    public int costoPorDia;
    int cantDias;

    public Usuario() {
    }

    public Usuario(String nombre, String contraseña, String apellido, Date nacimiento, String correo, int costo, int costoPorDia, int cantDias) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.precio = costo;
        this.costoPorDia = costoPorDia;
        this.cantDias = cantDias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCostoPorDia() {
        return costoPorDia;
    }

    public void setCostoPorDia(int costoPorDia) {
        this.costoPorDia = costoPorDia;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public int precioAlquiler() {
        precio = (costoPorDia * cantDias);
        return precio;
    }
}
