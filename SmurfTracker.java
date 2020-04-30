package Proyecto_Prototipo;

import java.util.Scanner;
import java.io.*;

public class SmurfTracker {

  public static void main(String[] args) throws IOException {
    BufferedWriter Writer = new BufferedWriter(new FileWriter("C:\\Users\\USUARIO\\Desktop\\Trabajos\\Resultado.txt"));
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    Queue<Jugador> datos = new Queue<Jugador>(t);
    for (int i = 0; i < t; i++) {
      String s = sc.nextLine();
      Jugador jugador = new Jugador(s);
      datos.enqueue(jugador);
      String resultado = jugador.getNombre() + "  " + jugador.getLiga();
      Writer.write(resultado);
      Writer.newLine();
    }
    Writer.close();
    sc.close();
  }
}