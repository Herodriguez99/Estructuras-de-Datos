package Proyecto_Prototipo;

import java.io.*;

public class SmurfTracker {

  public static String Format(Jugador jugador) {
    String resultado = String.format("Usuario:"
        + "is: %1$-18s Liga: %2$-18s  WinRate: %3$-10s Partidas Jugadas: %4$-10s K/D/A: %5$-10s Smurf: %6$-14s  Inting: %7$-10s",
        jugador.Nombre, jugador.Liga, jugador.WinRate, jugador.Num_Partidas, jugador.kda, jugador.isSmurf(jugador),
        jugador.isIntting(jugador));
    return resultado;
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter Writer = new BufferedWriter(new FileWriter("C:\\Users\\USUARIO\\Desktop\\Trabajos\\Resultado.txt"));
    BufferedReader Reader = new BufferedReader(new FileReader("C:\\Users\\USUARIO\\Desktop\\Trabajos\\10k.txt"),
        360000);
    int t = Integer.parseInt(Reader.readLine());
    Queue<Jugador> datos = new Queue<Jugador>(t);
    long time_start, time_end;
    time_start = System.currentTimeMillis();// llamamos a la tarea
    for (int i = 0; i < t; i++) {
      String s = Reader.readLine();
      Jugador jugador = new Jugador(s);
      datos.enqueue(jugador);
      Writer.write(Format(datos.dequeue()));
      Writer.newLine();
    }
    time_end = System.currentTimeMillis();
    System.out.println("the task has taken " + (time_end - time_start) + " milliseconds");
    Writer.close();
    Reader.close();

  }
}