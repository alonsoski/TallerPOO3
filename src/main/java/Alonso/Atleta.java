package Alonso;

import java.util.ArrayList;

public class Atleta {
    private String nombre;
    private String pais;
    private int edad;
    private ArrayList<Disciplina> disciplinas;
    public Equipo equipo;

    public void agregarDisciplina(Disciplina disciplina) {
        throw new UnsupportedOperationException();
    }


    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void eliminarDisciplina(Disciplina disciplina) {
        throw new UnsupportedOperationException();
    }

    public String getInfo() {
        String info ="NombreA:"+this.nombre+"\n" +
                "PaisA:"+this.pais;
        return info;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getPais() {
        return this.pais;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public Atleta(String nombre, String pais, ArrayList<Disciplina> disciplinas,int edad) {
        this.nombre= nombre;
        this.pais=pais;
        this.disciplinas= disciplinas;
        this.edad=edad;
    }
}