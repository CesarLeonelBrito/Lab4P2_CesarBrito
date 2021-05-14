package lab4p2_cesarbrito;

import java.util.ArrayList;

public class Proyecto {

    private String nombre;
    private String empresa;
    private String descripcion;
    private String estadoActual;
    private int years;
    private ArrayList<Desarrolladores> desarrolladores = new ArrayList();
    private ArrayList<Consultores> consultores = new ArrayList();
    private ArrayList<Directores> directores = new ArrayList();

    public Proyecto() {
    }

    public Proyecto(String nombre, String empresa, String descripcion, String estadoActual, int years) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.estadoActual = estadoActual;
        this.years = years;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public ArrayList<Desarrolladores> getDesarrolladores() {
        return desarrolladores;
    }

    public void setDesarrolladores(ArrayList<Desarrolladores> desarrolladores) throws Excepcion {
        if (desarrolladores.size() <= 5) {
            this.desarrolladores = desarrolladores;
        } else {
            throw new Excepcion(100, "Ya hay el numero maximo de desarrolladores");
        }
    }

    public ArrayList<Consultores> getConsultores() {
        return consultores;
    }

    public void setConsultores(ArrayList<Consultores> consultores) throws Excepcion {
        if (consultores.size() <= 4) {
            this.consultores = consultores;
        } else {
            throw new Excepcion(100, "Ya hay el numero maximo de consultores");
        }
    }

    public ArrayList<Directores> getDirectores() {
        return directores;
    }

    public void setDirectores(ArrayList<Directores> directores) throws Excepcion {
        if (directores.size() <= 2) {
            this.directores = directores;
        } else {
            throw new Excepcion(100, "Ya hay el numero maximo de directores");
        }
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", empresa=" + empresa + ", descripcion=" + descripcion + ", estadoActual=" + estadoActual + ", years=" + years + ", desarrolladores=" + desarrolladores + ", consultores=" + consultores + ", directores=" + directores + '}';
    }

}
