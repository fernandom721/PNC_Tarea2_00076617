package com.uca.capas.ejemplo.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import static javax.swing.UIManager.getString;

@Controller
public class MainController {

    @RequestMapping("/alumno")
    public @ResponseBody String alumno(){
        String texto = "Alumno: Fernando Martinez \n Carnet: 00076617 \n Carrera: Ing. Informatica \n Año Cursado: 4°";
        return texto;
    }

    @RequestMapping("/fecha")
    public @ResponseBody String fecha(HttpServletRequest request){
        int dia = Integer.parseInt(request.getParameter("dia"))-2;
        int mes = Integer.parseInt(request.getParameter("mes"));
        int annio = Integer.parseInt(request.getParameter("annio"));

        Calendar date = Calendar.getInstance();
        date.set(annio,mes,dia);
        String w_day="";
        int day = date.get(Calendar.DAY_OF_WEEK);

        if(day == Calendar.MONDAY){
            w_day = "Lunes";
        }
        if(day == Calendar.TUESDAY){
            w_day = "Martes";
        }
        if(day == Calendar.WEDNESDAY){
            w_day = "Miercoles";
        }
        if(day == Calendar.THURSDAY){
            w_day = "Jueves";
        }
        if(day == Calendar.FRIDAY){
            w_day = "Viernes";
        }
        if(day == Calendar.SATURDAY){
            w_day = "Sabado";
        }
        if(day == Calendar.SUNDAY){
            w_day = "Domingo";
        }
        return "Ese dia de la semana fue "+w_day;
    }
}
