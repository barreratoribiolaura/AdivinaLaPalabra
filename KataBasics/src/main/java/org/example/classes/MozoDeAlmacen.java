package org.example.classes;

import lombok.Getter;

import java.util.Date;
import java.util.List;

@Getter
public class MozoDeAlmacen extends Trabajador{

    private final List<String> carnes;

    public MozoDeAlmacen(String name, String surnames, String birth_date, String position, Schedule schedule, List<String> carnes) {
        super(name, surnames, birth_date, position, schedule);
        this.carnes = carnes;
    }

    @Override
    public String toString() {
        System.out.print(getName()+" "+getSurnames()+ " nació el "+ getBirth_date()+" tiene el puesto de "+getPosition()+" su turno es de "+getSchedule());
        return !carnes.isEmpty() ?
                ", tiene los carnes: "+getCarnes()
                :", no tiene ningún carne";
    }
}
