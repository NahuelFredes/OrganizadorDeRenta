package OrganizadorRenta;

public class Usuario {

    private String nombre;
    private String contraseña;

    public Usuario() {

    }

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

public String getContraseña(){
        return contraseña;
    }
}
