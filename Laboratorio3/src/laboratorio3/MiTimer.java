/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

/**
 *
 * @author SANDOVAL
 */
public class MiTimer extends Laboratorio3 {

    int hora;
    int minutos;
    int segundos;
    String horario;

    public MiTimer(int hora, int minutos, int segundos, String horario) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        this.horario = horario;

    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public String getHorario() {
        return horario;
    }

}
