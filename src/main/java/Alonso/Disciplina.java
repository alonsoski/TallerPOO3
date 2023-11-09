package Alonso;

import java.util.ArrayList;

public class Disciplina {
    private String nombre;
    private int numPart;
    private String record;
    private ArrayList<Atleta>participantes;

    public Disciplina(String nombre,String record,int numPart){
        this.nombre = nombre;
        this.record = record;
        this.numPart = numPart;
        this.participantes=new ArrayList<>();
    }

    private int obtenerParticipantes(ArrayList<Equipo> equipos) {
        int participantes =0;
        for (int i = 0; i < equipos.size() ; i++) {
            for (int j = 0; j <equipos.get(i).getAtletas().size() ; j++) {
                participantes++;
            }
        }
        return participantes;
    }
    public void anadiratleta(Atleta atleta){
        if (this.participantes.size()>=numPart){
            System.out.println("maximo de participantes alcanzado");
        }else {
            this.participantes.add(atleta);
            System.out.println("añadido");
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getNumPart() {
        return this.numPart;
    }

    public String getRecord() {
        return this.record;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void setNumPart(int numPart) {
        this.numPart=numPart;
    }

    public void setRecord(String record) {
        this.record=record;
    }

    public void getInfo() {
        throw new UnsupportedOperationException();
    }
}