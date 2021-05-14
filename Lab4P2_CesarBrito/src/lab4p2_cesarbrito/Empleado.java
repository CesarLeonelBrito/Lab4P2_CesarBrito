package lab4p2_cesarbrito;

public class Empleado {

    private String username;
    private String password;
    private String nombre;
    private String apellido;
    private String id;
    private String nacionalidad;
    private int proyectosRealizados;
    private int yearsContrato;

    public Empleado() {
    }

    public Empleado(String username, String password, String nombre, String apellido, String id, String nacionalidad, int proyectosRealizados, int yearsContrato) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.proyectosRealizados = proyectosRealizados;
        this.yearsContrato = yearsContrato;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getProyectosRealizados() {
        return proyectosRealizados;
    }

    public void setProyectosRealizados(int proyectosRealizados) {
        this.proyectosRealizados = proyectosRealizados;
    }

    public int getYearsContrato() {
        return yearsContrato;
    }

    public void setYearsContrato(int yearsContrato) {
        this.yearsContrato = yearsContrato;
    }

    @Override
    public String toString() {
        return "Empleado{" + "username=" + username + ", password=" + password + ", nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", nacionalidad=" + nacionalidad + ", proyectosRealizados=" + proyectosRealizados + ", yearsContrato=" + yearsContrato + ", sueldo=" + sueldoFormula();
    }

    public double sueldoFormula() {
        return (12000 * 8) / (2 * yearsContrato);
    }

}
