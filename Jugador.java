package Proyecto_Prototipo;

import java.util.StringTokenizer;

public class Jugador {
  String Nombre, Liga;
  double WinRate, kda;
  int Num_Partidas;

  public Jugador(String s) {
    StringTokenizer token = new StringTokenizer(s, ",");
    while (token.hasMoreTokens()) {
      Nombre = token.nextToken();
      Liga = token.nextToken();
      WinRate = Double.parseDouble(token.nextToken());
      kda = Double.parseDouble(token.nextToken());
      Num_Partidas = Integer.parseInt(token.nextToken());
    }
  }

  double isSmurf(Jugador jugador) {
    switch (jugador.Liga) {
      case Iron:
        break;
      case Iron:
        break;
      case Iron:
        break;
      case Iron:
        break;
      case Iron:
        break;
      case Iron:
        break;
      case Iron:
        break;
      case Iron:
        break;
      case Iron:
        break;
    }
  }

  public String getNombre() {
    return Nombre;
  }

  public String getLiga() {
    return Liga;
  }

  public double getWinRate() {
    return WinRate;
  }

  public double getKda() {
    return kda;
  }

  public int getNum_Partidas() {
    return Num_Partidas;
  }
}
