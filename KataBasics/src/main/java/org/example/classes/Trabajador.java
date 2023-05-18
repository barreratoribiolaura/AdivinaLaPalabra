package org.example.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@AllArgsConstructor
public class Trabajador {

    private String name;

    private String surnames;

    private String birth_date;

    private String position;

    private Schedule schedule;
}
