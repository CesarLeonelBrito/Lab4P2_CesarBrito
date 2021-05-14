package lab4p2_cesarbrito;

import java.util.ArrayList;

public class Directores extends Empleado {

    private int yearsEnPuesto;
    private int proyectosAsignado;
    private double sueldo;
    private ArrayList<Desarrolladores> desarrolladoresAsignados = new ArrayList();

    public Directores() {
        super();
    }

    public Directores(int yearsEnPuesto, int proyectosAsignado, double sueldo, String username, String password, String nombre, String apellido, String id, String nacionalidad, int proyectosRealizados, int yearsContrato) {
        super(username, password, nombre, apellido, id, nacionalidad, proyectosRealizados, yearsContrato);
        this.yearsEnPuesto = yearsEnPuesto;
        this.proyectosAsignado = proyectosAsignado;
        this.setSueldo(sueldo);
    }

    public int getYearsEnPuesto() {
        return yearsEnPuesto;
    }

    public void setYearsEnPuesto(int yearsEnPuesto) {
        this.yearsEnPuesto = yearsEnPuesto;
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

    public ArrayList<Desarrolladores> getDesarrolladoresAsignados() {
        return desarrolladoresAsignados;
    }

    public void setDesarrolladoresAsignados(ArrayList<Desarrolladores> desarrolladoresAsignados) {
        this.desarrolladoresAsignados = desarrolladoresAsignados;
    }

    @Override
    public String toString() {
        return super.toString() + " Consultores{" + "yearsEnPuesto=" + yearsEnPuesto + ", sueldo=" + sueldo + ", proyectosAsignado=" + proyectosAsignado + ", desarrolladoresAsignados=" + desarrolladoresAsignados;
    }

    @Override
    public double sueldoFormula() {
        return (super.getProyectosRealizados() * 13280 * 4.13) / (proyectosAsignado + super.getYearsContrato());
    }

}
