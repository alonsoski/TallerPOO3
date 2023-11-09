package Alonso;

import java.util.ArrayList;
import java.util.Date;

public class Evento {
    private Disciplina disciplina;
    private ArrayList<Equipo> equipos;
    private Date fecha;

    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Equipo> getEquipos() {
        throw new UnsupportedOperationException();
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos=equipos;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Evento(Disciplina disciplina, ArrayList<Equipo> equipos) {
        throw new UnsupportedOperationException();
    }

    public void agregarAtleta(Atleta atleta) {
        throw new UnsupportedOperationException();
    }

    public void eliminarAtleta(Atleta atleta) {

    }

    public String getInfo() {
        throw new UnsupportedOperationException();
    }
}