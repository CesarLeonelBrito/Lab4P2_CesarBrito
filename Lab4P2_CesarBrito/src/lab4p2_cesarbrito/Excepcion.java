package lab4p2_cesarbrito;

public class Excepcion extends Exception {

    private int nota;

    public Excepcion() {
        super();
    }

    public Excepcion(int nota, String string) {
        super(string);
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Excepcion{" + "nota=" + nota + '}';
    }

}
