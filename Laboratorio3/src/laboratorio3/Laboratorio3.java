package laboratorio3;
//Escriba un programa que implemente una alarma que se muestre en consola 
//después de ingresar la hora a la que se quiere activar y posteriormente muestre 

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

//un mensaje cada 10 segundos hasta que se desactive. Ejemplo: activar alarma a 
//las 9:05:00am y mostrar mensajes a 9:05:10am, 9:05:20am, 9:05:30am hasta 
//que se desactive.
public class Laboratorio3 {
//CALENDAR
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        String mañana = new String("am");
        String noche = new String("pm");
        int hora;
        int minutos;
        int segundos;
        String Sistema_horario;
        System.out.println("Digite la hora");
        hora = teclado.nextInt();
        System.out.println("Digite la minutos");//5
        minutos = teclado.nextInt();
        System.out.println("Digite la segundos");//30
        segundos = teclado.nextInt();
        teclado.nextLine();//Borrar buffer
        System.out.println("pm o am");
        Sistema_horario = teclado.nextLine();//toLowerCase transformar a minuscula
        String horario = new String(Sistema_horario.toLowerCase());
        System.out.println(horario);
        if (horario.equals(mañana) || horario.equals(noche)) {
            MiTimer envio = new MiTimer(hora, minutos, segundos, horario);

        } else {
            System.out.println("Error de digitacion de alarma");
        }
        int contador;
        System.out.println("Cual es la velocidad que desea (s)");
        contador = teclado.nextInt();
        int contador1 = contador * 1000;

        Timer alarma = new Timer();
        //que tarea va a realizar //Timer Task
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {//Aqui se coloca lo que queremos que haga nuestro programa
                MiTimer envio = new MiTimer(hora, minutos, segundos, horario);
                System.out.println(envio.getHora() + ":" + envio.getMinutos() + ":" + envio.getSegundos() + ":" + envio.getHorario());
                envio.getSegundos()+contador;//valor temporal
            }

        };
        alarma.schedule(tarea, 0, contador1);//hacer la tarea//inicia en 0//cada 1000milisegundos

    }
}
