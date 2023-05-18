package org.example;

import org.example.classes.Administrativo;
import org.example.classes.MozoDeAlmacen;
import org.example.classes.Schedule;
import org.example.classes.Trabajador;

import java.util.*;

public class Main {

    static MozoDeAlmacen mozo1 = new MozoDeAlmacen("Francisco","Martínez Gutierrez","01/01/2000","Mozo de almacén", Schedule.NIGTH,Arrays.asList("Carné de carretilla","Carné de manipulador"));
    static Administrativo admin1 = new Administrativo("Pedro","Gómez Fernández","17/02/1970","Administrativo",Arrays.asList("Excel","Word","Power Point","ContaPlus","NominaPlus","Teams","Outlook","Visual Basic"));
    static MozoDeAlmacen mozo2 = new MozoDeAlmacen("María","Alfajores","10/11/1990","Mozo de almacén",Schedule.MORNING,Arrays.asList("Carné de carretilla"));
    static MozoDeAlmacen mozo3 = new MozoDeAlmacen("Pedro","Gómez Hernández","03/03/1999","Mozo de almacén",Schedule.AFTERNOON,Arrays.asList());
    static Administrativo admin2 = new Administrativo("Marta","Sánchez García","04/07/1997","Administrativa",Arrays.asList("Excel","Word","Power Point","ContaPlus","NominaPlus","Teams","Outlook"));
    static Trabajador manager = new Trabajador("Allan","McKenzie","29/09/1970","Gerente",Schedule.MORNING) ;

    static List<Trabajador> workers = Arrays.asList(mozo1,admin1,mozo2,mozo3,admin2,manager);

    static List<Trabajador> admins = new ArrayList<>();
    static List<Trabajador> mozos = new ArrayList<>();

    public static void main(String[] args) {
        addWorkers();
        showWorkers();
    }

    private static void addWorkers() {
        workers.stream().forEach(worker -> {
            if (worker.getClass() == Administrativo.class) addAdmin(worker,admins);
            else if (worker.getClass() == MozoDeAlmacen.class) addMozo(worker,mozos);
            else System.out.println("El trabajador con nombre "+worker.getName()+worker.getSurnames()+" no pertenece a ningún grupo de trabajo porque su cargo es: "+worker.getPosition());
        });
    }

    private static void showWorkers() {
        System.out.println("\n-------ADMINISTRATIVOS-------\n");
        admins.forEach(System.out::println);
        System.out.println("\n-------MOZOS DE ALMACÉN-------\n");
        mozos.forEach(System.out::println);
    }

    private static void addMozo(Trabajador worker, List<Trabajador> mozos) {
        mozos.add(worker);
        System.out.println("El trabajador con nombre "+worker.getName()+worker.getSurnames()+" añadido a la lista de mozos de almacén");
    }

    private static void addAdmin(Trabajador worker, List<Trabajador> admins) {
        admins.add(worker);
        System.out.println("El trabajador con nombre "+worker.getName()+worker.getSurnames()+" añadido a la lista de administrativos");
    }


}