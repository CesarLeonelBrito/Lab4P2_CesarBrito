package lab4p2_cesarbrito;

import java.util.ArrayList;

public class Consultores extends Empleado {

    private String campo;
    private int tiempoConsultoria;
    private int proyectosAignados;
    private int consultores;
    private ArrayList<Desarrolladores> desarrolladores = new ArrayList();
    private double sueldo;

    public Consultores() {
        super();
    }

    public Consultores(String campo, int tiempoConsultoria, int proyectosAignados, int consultores, double sueldo, String username, String password, String nombre, String apellido, String id, String nacionalidad, int proyectosRealizados, int yearsContrato) {
        super(username, password, nombre, apellido, id, nacionalidad, proyectosRealizados, yearsContrato);
        this.campo = campo;
        this.tiempoConsultoria = tiempoConsultoria;
        this.proyectosAignados = proyectosAignados;
        this.consultores = consultores;
        this.sueldo = sueldo;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public int getTiempoConsultoria() {
        return tiempoConsultoria;
    }

    public void setTiempoConsultoria(int tiempoConsultoria) {
        this.tiempoConsultoria = tiempoConsultoria;
    }

    public int getProyectosAignados() {
        return proyectosAignados;
    }

    public void setProyectosAignados(int proyectosAignados) {
        this.proyectosAignados = proyectosAignados;
    }

    public int getConsultores() {
        return consultores;
    }

    public void setConsultores(int consultores) {
        this.consultores = consultores;
    }

    public ArrayList<Desarrolladores> getDesarrolladores() {
        return desarrolladores;
    }

    public void setDesarrolladores(ArrayList<Desarrolladores> desarrolladores) {
        this.desarrolladores = desarrolladores;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldoFormula();
    }

    @Override
    public String toString() {
        return super.toString() + " Directores{" + "campo=" + campo + ", tiempoConsultoria=" + tiempoConsultoria + ", proyectosAignados=" + proyectosAignados + ", consultores=" + consultores + ", desarrolladores=" + desarrolladores + ", sueldo=" + sueldo;
    }

    @Override
    public double sueldoFormula() {
        return (super.getProyectosRealizados() * proyectosAignados * consultores * desarrolladores.size() * 5.23) / (proyectosAignados * super.getYearsContrato() * 2.28);
    }

}
