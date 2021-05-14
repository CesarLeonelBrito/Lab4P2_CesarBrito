package lab4p2_cesarbrito;

public class Desarrolladores extends Empleado {

    private int yearsExperiencia;
    private int horasTrabajdas;
    private int proyectosAsignado;
    private double sueldo;
    private String lenguajePreferido;

    public Desarrolladores() {
        super();
    }

    public Desarrolladores(int yearsExperiencia, int horasTrabajdas, int proyectosAsignado, double sueldo, String lenguajePreferido, String username, String password, String nombre, String apellido, String id, String nacionalidad, int proyectosRealizados, int yearsContrato) {
        super(username, password, nombre, apellido, id, nacionalidad, proyectosRealizados, yearsContrato);
        this.yearsExperiencia = yearsExperiencia;
        this.horasTrabajdas = horasTrabajdas;
        this.proyectosAsignado = proyectosAsignado;
        this.setSueldo(sueldo);
        this.lenguajePreferido = lenguajePreferido;
    }

    public int getYearsExperiencia() {
        return yearsExperiencia;
    }

    public void setYearsExperiencia(int yearsExperiencia) {
        this.yearsExperiencia = yearsExperiencia;
    }

    public int getHorasTrabajdas() {
        return horasTrabajdas;
    }

    public void setHorasTrabajdas(int horasTrabajdas) {
        this.horasTrabajdas = horasTrabajdas;
    }

    public int getProyectosAsignado() {
        return proyectosAsignado;
    }

    public void setProyectosAsignado(int proyectosAsignado) {
        this.proyectosAsignado = proyectosAsignado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldoFormula();
    }

    public String getLenguajePreferido() {
        return lenguajePreferido;
    }

    public void setLenguajePreferido(String lenguajePreferido) {
        this.lenguajePreferido = lenguajePreferido;
    }

    @Override
    public String toString() {
        return super.toString() + " Desarrolladores{" + "yearsExperiencia=" + yearsExperiencia + ", horasTrabajdas=" + horasTrabajdas + ", proyectosAsignado=" + proyectosAsignado + ", sueldo=" + sueldo + ", lenguajePreferido=" + lenguajePreferido;
    }

    @Override
    public double sueldoFormula() {
        return (super.getProyectosRealizados() * 115000 * 2) / (proyectosAsignado + super.getYearsContrato());
    }

}
