Este es el ejercicio que hice que más me gustó en el curso.
Se trata del ejercicio de examen de recuperación del primer trimestre, que realicé 3 versiones.
 
 - La primera de las versiones es con variables para todo y de manera normal.
     
     ``` java
     /**
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
    ```
 
    <img src="img/partida1.png" height="120px">
    <img src="img/partida2.png" height="120px">
    
 - La segunda de las versiones es con arrays.
    
    ``` java
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
    ```
    <img src="img/partida3.png" height="120px">
    <img src="img/partida4.png" height="120px">
    
 - La tercera es distinta a las dos anteriores, dado que en las anteriores el boliche (bola pequeña que se lanza al comienzo del juego) 
 tiene una posición fija, dada esa posición se calcula el ganador de la partida, pero en esta versión hago que el lanzamiento del boliche sea aleatorio
 y a raiz de esa posición, además del lanzamiento de cada jugador, se calcula el ganador.
 
    ``` java
    /**
     * @author Jesús Martín Castro
     */

    import java.util.Scanner;

    public class Petanca3 {
      public static void main(String[] args) {
        
        int[] posicion = new int[3];
        int[] resta = new int[3];
        int controljugador = 0;
        int posicionBola = 0;
        
          posicionBola = (int)(Math.random()*21) + 1;
          System.out.print("Tirada    ");
          for (int j = 1; j < 22; j ++) {
            if (j == posicionBola) {
              System.out.print("0");
            } else {
              System.out.print(" ");
            }
          }
          
          System.out.println();
          
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

          if (posicion[i] <= posicionBola) {
            resta[i] = posicionBola - posicion[i];
          } else if (posicion[i] >= posicionBola) {
            resta[i] = posicion[i] - posicionBola;
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
    ```
    <img src="img/partida5.png" height="120px">
    <img src="img/partida6.png" height="120px">
    
    
