package Alonso;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Equipo>equipos = new ArrayList<>();
        Disciplina d1 = new Disciplina("natacion","15 min",15);
        Disciplina d2 = new Disciplina("ciclismo","15 min",13);
        ArrayList<Disciplina> disciplinas=new ArrayList<>();
        disciplinas.add(d1);
        Atleta at1 = new Atleta("nombreA","Chile",disciplinas,19);
        Atleta at2 = new Atleta("nombreA2","Chile",disciplinas,19);
        ArrayList<Atleta>aLAtl= new ArrayList<>();
        aLAtl.add(at1);aLAtl.add(at2);
        Equipo e1 = new Equipo("chile",aLAtl);
        equipos.add(e1);

        System.out.println(d1.getNumPart());
    }
}
