package Alonso;

import java.util.ArrayList;

public class Atleta {
    private String nombre;
    private String pais;
    private ArrayList<Disciplina> disciplinas;
    public Equipo equipo;

    public void agregarDisciplina(Disciplina disciplina) {
        throw new UnsupportedOperationException();
    }

    public void eliminarDisciplina(Disciplina disciplina) {
        throw new UnsupportedOperationException();
    }

    public String getInfo() {
        String info ="NombreA:"+this.nombre+"\n" +
                "PaisA:"+this.pais;

    }

    public String getNombre() {
        return this.nombre;
    }

    public String getPais() {
        return this.pais;
    }

    public Disciplina getDisciplinas() {
        return this.disciplinas;
    }

    public Atleta(String nombre, String pais, ArrayList<Disciplina> disciplinas) {
        throw new UnsupportedOperationException();
    }
}