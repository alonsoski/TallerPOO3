package Alonso;

import java.util.ArrayList;

public class Disciplina {
    private String nombre;
    private int numPart;
    private String record;


    public Disciplina(String nombre,String record,ArrayList<Equipo>equipos){
        this.nombre = nombre;
        this.record = record;
        this.numPart = obtenerParticipantes(equipos);
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

    public void getNombre() {
        throw new UnsupportedOperationException();
    }

    public void getNumPart() {
        throw new UnsupportedOperationException();
    }

    public void getRecord() {
        throw new UnsupportedOperationException();
    }

    public void setNombre() {
        throw new UnsupportedOperationException();
    }

    public void setNumPart() {
        throw new UnsupportedOperationException();
    }

    public void setRecord() {
        throw new UnsupportedOperationException();
    }

    public void getInfo() {
        throw new UnsupportedOperationException();
    }
}