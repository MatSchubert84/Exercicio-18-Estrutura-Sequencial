package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex18 {
    
    public static void main(String[] args) {

        //Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), 
        //calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
        Scanner keyboard = new Scanner(System.in);

        double file, speed, neededTime, timeInMinutes;

        System.out.println("file size in Megabytes: ");
        file = keyboard.nextDouble();
        System.out.println("internet speed in MegaBits per second: ");
        speed = keyboard.nextDouble();

        neededTime = ((file * 8) / speed);
        timeInMinutes = (neededTime / 60);

        System.out.println("the approximated time to download is: " + timeInMinutes + " minutes");
    
        keyboard.close();
    }
}