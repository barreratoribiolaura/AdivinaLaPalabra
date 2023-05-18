package org.example.classes;

import lombok.Getter;

import java.util.Date;
import java.util.List;

@Getter
public class Administrativo extends Trabajador{

    private final List<String> softwares;


    public Administrativo(String name, String surnames, String birth_date, String position, List<String> softwares) {
        super(name, surnames, birth_date, position, Schedule.MORNING);
        this.softwares = softwares;
    }

    @Override
    public String toString() {
        return getName()+" "+getSurnames()+ " nació el "+ getBirth_date()+" tiene el puesto de "+getPosition()+" su turno es de "+getSchedule()+ " además sabe usar los siguientes programas: "+getSoftwares();
    }
}
