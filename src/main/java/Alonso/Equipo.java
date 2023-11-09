package Alonso;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Atleta> atletas;
    private ArrayList<Disciplina> disciplinas;
    public Equipo(String nombre,ArrayList<Atleta> atletas){
        this.nombre=nombre;
        this.atletas=atletas;
        this.disciplinas=calcularDisciplinas();
    }

    private ArrayList<Disciplina> calcularDisciplinas() {
        ArrayList<Disciplina>disciplinasTotales = new ArrayList<>();
        for (int i = 0; i <this.atletas.size() ; i++)
            disciplinasTotales.addAll(this.atletas.get(i).getDisciplinas());
        return disciplinasTotales;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Atleta> getAtletas() {
        return this.atletas;
    }

    public void setAtletas(ArrayList<Atleta> atletas) {
        this.atletas=atletas;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas=disciplinas;
    }

    public void agregarAtleta(Atleta atleta) {
        boolean existe=false;
        boolean mayorDeEdad=true;
        for (int i = 0; i < this.atletas.size() ; i++) {
            if (atletas.get(i).getNombre().equals(atleta.getNombre())){
                existe = true;
            }
        }
        if (existe){
            System.out.println("ya esta agregado");
        }else if (atleta.getEdad()<18){
            System.out.println("su edad no esta permitida");
        }
        else {
            this.atletas.add(atleta);
            System.out.println("ingresado");
        }
    }

    public void eliminarAtleta(Atleta atleta) {
        boolean existe=false;
        for (int i = 0; i < this.atletas.size() ; i++) {
            if (atletas.get(i).getNombre().equals(atleta.getNombre())){
                this.atletas.remove(i);
                existe = true;
            }
        }
        if (existe){
            System.out.println("eliminado");
        }else {
            System.out.println("no esta ingresado");
        }
    }


    public void getInfo() {
        System.out.println("Nombre:"+this.nombre);
        System.out.println("Atletas:");
        for (int i = 0; i <this.atletas.size() ; i++) {
            this.atletas.get(i).getNombre();
        }
        System.out.println("Disciplinas:");
        for (int i = 0; i <this.disciplinas.size() ; i++) {
            this.disciplinas.get(i).getNombre();
        }
    }
}