/**
 * @author Jesús Martín Castro
 */

import java.util.Scanner;

public class Petanca2 {
  public static void main(String[] args) {
    
    int[] posicion = new int[3];
    int[] resta = new int[3];
    int controljugador = 0;
    
    System.out.println("          ----------0----------");
    for (int i = 0; i < 3; i ++) {
      posicion[i] = (int)(Math.random()*21) + 1;
      controljugador++;
      System.out.print("Jugador " + controljugador + " ");
      for (int j = 1; j < 22; j ++) {
        if (j == posicion[i]) {
          System.out.print("0");
        } else {
          System.out.print(" ");
        }
      }
      
      if (posicion[i] <= 11) {
        resta[i] = 11 - posicion[i];
      } else if (posicion[i] >= 11) {
        resta[i] = posicion[i] - 11;
      }
      
      System.out.println();
    }
    
    if ((resta[0] < resta[1]) && (resta[0] < resta[2])) {
      System.out.println("¡Gana el jugador 1!");
    } else if ((resta[0] > resta[1]) && (resta[1] < resta[2])) {
      System.out.println("¡Gana el jugador 2!");
    } else if ((resta[2] < resta[1]) && (resta[0] > resta[2])) {
      System.out.println("¡Gana el jugador 3!");
    } if ((resta[0] == resta[1]) && (resta[1] < resta[2]) && (resta[0] < resta[2])) {
      System.out.println("Han empatado el Jugador 1 y el Jugador 2");
    } else if ((resta[2] == resta[1]) && (resta[2] < resta[0]) && (resta[1] < resta[0])) {
      System.out.println("Han empatado el Jugador 2 y el Jugador 3");
    } else if ((resta[0] == resta[2]) && (resta[2] < resta[1]) && (resta[0] < resta[1])) {
      System.out.println("Han empatado el Jugador 1 y el Jugador 3");
    } else if ((resta[2] == resta[1]) && (resta[0] == resta[2]) && (resta[1] == resta[2])) {
      System.out.println("Hubo un triple empate en esta partida");
    }
  }
}
