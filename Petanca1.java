/**
 * Realiza un programa que rellene un array con 20 números aleatorios comprendidos entre 1 y 100
 * (ambos incluidos) y que los muestre por pantalla. A continuación, el programa contará los números del
 * array que terminan por una determinada cifra. Esta cifra se le preguntará al usuario.
 *
 * @author Jesús Martín Castro
 */

import java.util.Scanner;

public class Petanca1 {
  public static void main(String[] args) {
    
    int jugadorUno = 0;
    int jugadorDos = 0;
    int jugadorTres = 0;
    
    System.out.println("          ----------0----------");
    
    int posicionUno = (int)(Math.random()*21) + 1;
    System.out.print("Jugador 1 ");
    for (int i = 1; i < 22; i ++) {
        if (i == posicionUno) {
          System.out.print("0");
        } else {
          System.out.print(" ");
        }
    }
    
    System.out.println();
    
    int posicionDos = (int)(Math.random()*21) + 1;
    System.out.print("Jugador 2 ");
    for (int i = 1; i < 22; i ++) {
      if (i == posicionDos) {
        System.out.print("0");
      } else {
        System.out.print(" ");
      }
    }
    
    System.out.println();
    
    int posicionTres = (int)(Math.random()*21) + 1;
    System.out.print("Jugador 3 ");
    for (int i = 1; i < 22; i ++) {
      if (i == posicionTres) {
        System.out.print("0");
      } else {
        System.out.print(" ");
      }
    }
    
    System.out.println();
    
    if (posicionUno <= 11) {
      jugadorUno = 11 - posicionUno;
    } else if (posicionUno >= 11) {
      jugadorUno = posicionUno - 11;
    }
    
    if (posicionDos <= 11) {
      jugadorDos = 11 - posicionDos;
    } else if (posicionDos >= 11) {
      jugadorDos = posicionDos - 11;
    }
    
    if (posicionTres <= 11) {
      jugadorTres = 11 - posicionTres;
    } else if (posicionTres >= 11) {
      jugadorTres = posicionTres - 11;
    }
    
    if ((jugadorUno < jugadorDos) && (jugadorUno < jugadorTres)) {
      System.out.println("¡Gana el jugador 1!");
    } else if ((jugadorUno > jugadorDos) && (jugadorDos < jugadorTres)) {
      System.out.println("¡Gana el jugador 2!");
    } else if ((jugadorTres < jugadorDos) && (jugadorUno > jugadorTres)) {
      System.out.println("¡Gana el jugador 3!");
    } if ((jugadorUno == jugadorDos) && (jugadorDos < jugadorTres) && (jugadorUno < jugadorTres)) {
      System.out.println("Han empatado el Jugador 1 y el Jugador 2");
    } else if ((jugadorTres == jugadorDos) && (jugadorTres < jugadorUno) && (jugadorDos < jugadorUno)) {
      System.out.println("Han empatado el Jugador 2 y el Jugador 3");
    } else if ((jugadorUno == jugadorTres) && (jugadorTres < jugadorDos) && (jugadorUno < jugadorDos)) {
      System.out.println("Han empatado el Jugador 1 y el Jugador 3");
    } else if ((jugadorTres == jugadorDos) && (jugadorUno == jugadorTres) && (jugadorDos == jugadorTres)) {
      System.out.println("Hubo un triple empate en esta partida");
    } 
  }
}
