package com.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;

/*
 * Crea un programa que calcule quien gana más partidas al piedra,
 * papel, tijera, lagarto, spock.
 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * - La función recibe un listado que contiene pares, representando cada jugada.
 * - El par puede contener combinaciones de "🗿" (piedra), "📄" (papel),
 *   "✂️" (tijera), "🦎" (lagarto) o "🖖" (spock).
 * - Ejemplo. Entrada: [("🗿","✂️"), ("✂️","🗿"), ("📄","✂️")]. Resultado: "Player 2".
 * - Debes buscar información sobre cómo se juega con estas 5 posibilidades.
 */

public class JuegoPiedraPapelTijeras {

    public static void main(String[] args) throws IOException {
        Pantalla();
    }

    public static void Player1Player2() throws IOException {
        try {
            String seleccionPlayer1 = null;
            String seleccionPlayer2 = null;

            String tijera = "tijera";
            String piedra = "piedra";
            String papel = "papel";
            String spock = "spock";
            String lagarto = "lagarto";

            ArrayList<String> iterar = new ArrayList<>();
            iterar.add(tijera);
            iterar.add(piedra);
            iterar.add(papel);
            iterar.add(spock);
            iterar.add(lagarto);

            System.out.println("**********************************************");
            System.out.println("*                                            *");
            System.out.println("*      Player 1 seleccione una opción        *");
            System.out.println("*                                            *");
            System.out.println("*  0. tijera                                 *");
            System.out.println("*  1. piedra                                 *");
            System.out.println("*  2. papel                                  *");
            System.out.println("*  3. spok                                   *");
            System.out.println("*  4. lagarto                                *");
            System.out.println("*                                            *");
            System.out.println("**********************************************");

            BufferedReader lectura1 = new BufferedReader(new InputStreamReader(System.in));
            seleccionPlayer1 = lectura1.readLine();


            System.out.println("**********************************************");
            System.out.println("*                                            *");
            System.out.println("*      Player 2 seleccione una opción        *");
            System.out.println("*                                            *");
            System.out.println("*  0. tijera                                 *");
            System.out.println("*  1. piedra                                 *");
            System.out.println("*  2. papel                                  *");
            System.out.println("*  3. spok                                   *");
            System.out.println("*  4. lagarto                                *");
            System.out.println("*                                            *");
            System.out.println("**********************************************");

            BufferedReader lectura2 = new BufferedReader(new InputStreamReader(System.in));
            seleccionPlayer2 = lectura2.readLine();

            String resultadoPlayer1 =  iterar.get(Integer.parseInt(seleccionPlayer1));
            String resultadoPlayer2 =  iterar.get(Integer.parseInt(seleccionPlayer2));

            String resultado =  Logica(resultadoPlayer1, resultadoPlayer2);

            String[] organizarResultado = resultado.split(",");

            String scorePlayer1 = organizarResultado[0].replace(" ","");
            String scorePlayer2 = organizarResultado[1].replace(" ","");
            String scoreTie = organizarResultado[2].replace(" ","");

            String ganaddor = null;
            if (Integer.parseInt(scorePlayer1) == 1){
                ganaddor = "Ganador Player 1";
            } else if (Integer.parseInt(scorePlayer2) == 1) {
                ganaddor = "Ganador PC";
            }else if (Integer.parseInt(scoreTie) == 1) {
                ganaddor = "Empate";
            }

            System.out.println("**********************************************");
            System.out.println("*                                            *");
            System.out.println("* @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ *");
            System.out.println("                 "+ganaddor+"                 ");
            System.out.println("* @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ *");
            System.out.println("*                                            *");
            System.out.println("*                                            *");
            System.out.println("  Seleccion player 1: " +resultadoPlayer1+"   ");
            System.out.println("  Seleccion player 2:  "+resultadoPlayer2+"   ");
            System.out.println("*                                            *");
            System.out.println("*          Seleccione una opción             *");
            System.out.println("*                                            *");
            System.out.println("*  1. Repetir partida                        *");
            System.out.println("*  2. Atras                                  *");
            System.out.println("*                                            *");
            System.out.println("**********************************************");

            BufferedReader opcionScaner = new BufferedReader(new InputStreamReader(System.in));

            String opcionJugador = opcionScaner.readLine();
            String expresionRegular = "^[0-9]+$";
            boolean isMatch = Pattern.matches(expresionRegular, opcionJugador);

            if (isMatch){
                if (Integer.parseInt(opcionJugador) == 1){
                    Player1Player2();
                } else if (Integer.parseInt(opcionJugador) == 2) {
                    Pantalla();
                }
            }
            System.out.println("Seleccione entre la opción 1, 2 o 3");
            Pantalla();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void Player1Pc() throws IOException {
        try {
            String seleccionPlayer1 = null;
            String seleccionPC = null;

            String tijera = "tijera";
            String piedra = "piedra";
            String papel = "papel";
            String spock = "spock";
            String lagarto = "lagarto";

            ArrayList<String> iterar = new ArrayList<>();
            iterar.add(tijera);
            iterar.add(piedra);
            iterar.add(papel);
            iterar.add(spock);
            iterar.add(lagarto);

            System.out.println("**********************************************");
            System.out.println("*                                            *");
            System.out.println("*      Player 1 seleccione una opción        *");
            System.out.println("*                                            *");
            System.out.println("*  0. tijera                                 *");
            System.out.println("*  1. piedra                                 *");
            System.out.println("*  2. papel                                  *");
            System.out.println("*  3. spok                                   *");
            System.out.println("*  4. lagarto                                *");
            System.out.println("*                                            *");
            System.out.println("**********************************************");

            DecimalFormat decimalFormat = new DecimalFormat("#");

            BufferedReader lectura1 = new BufferedReader(new InputStreamReader(System.in));
            seleccionPlayer1 = iterar.get(Integer.parseInt(lectura1.readLine()));
            seleccionPC = iterar.get(Integer.parseInt(decimalFormat.format(Math.random() * 4)));

            String resultado = Logica(seleccionPlayer1, seleccionPC);

            String[] organizarResultado = resultado.split(",");

            String scorePlayer1 = organizarResultado[0].replace(" ", "");
            String scorePC = organizarResultado[1].replace(" ", "");
            String scoreTie = organizarResultado[2].replace(" ", "");

            String ganaddor = null;
            if (Integer.parseInt(scorePlayer1) == 1){
                ganaddor = "Ganador Player 1";
            } else if (Integer.parseInt(scorePC) == 1) {
                ganaddor = "Ganador PC";
            }else if (Integer.parseInt(scoreTie) == 1) {
                ganaddor = "Empate";
            }

            System.out.println("**********************************************");
            System.out.println("*                                            *");
            System.out.println("* @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ *");
            System.out.println("                 "+ganaddor+"                 ");
            System.out.println("* @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ *");
            System.out.println("*                                            *");
            System.out.println("*                                            *");
            System.out.println("  Seleccion player 1: "+seleccionPlayer1+"    ");
            System.out.println("  Seleccion PC:  "+seleccionPC+"              ");
            System.out.println("*                                            *");
            System.out.println("*          Seleccione una opción             *");
            System.out.println("*                                            *");
            System.out.println("*  1. Repetir partida                        *");
            System.out.println("*  2. Atras                                  *");
            System.out.println("*                                            *");
            System.out.println("**********************************************");

            BufferedReader opcionScaner = new BufferedReader(new InputStreamReader(System.in));

            String opcionJugador = opcionScaner.readLine();
            String expresionRegular = "^[0-9]+$";
            boolean isMatch = Pattern.matches(expresionRegular, opcionJugador);

            if (isMatch) {
                if (Integer.parseInt(opcionJugador) == 1) {
                    Player1Pc();
                } else if (Integer.parseInt(opcionJugador) == 2) {
                    Pantalla();
                }
            }
            System.out.println("Seleccione entre la opción 1, 2 o 3");
            Pantalla();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String Logica(String seleccionPlayer1, String seleccionPlayer2){
        try {
            Integer player1 = 0;
            Integer player2 = 0;
            Integer tie = 0;

            //tijeras -> lagarto
            if (seleccionPlayer1.equals("tijera") && seleccionPlayer2.equals("lagarto")) {
                player1++;
            } else if (seleccionPlayer2.equals("tijera") && seleccionPlayer1.equals("lagarto")) {
                player2++;
            }

            //tijeras -> papel
            if (seleccionPlayer1.equals("tijera") && seleccionPlayer2.equals("papel")) {
                player1++;
            } else if (seleccionPlayer2.equals("tijera") && seleccionPlayer1.equals("papel")) {
                player2++;
            }

            //piedra -> lagarto
            if (seleccionPlayer1.equals("piedra") && seleccionPlayer2.equals("lagarto")) {
                player1++;
            } else if (seleccionPlayer2.equals("piedra") && seleccionPlayer1.equals("lagarto")) {
                player2++;
            }

            //piedra -> tijeras
            if (seleccionPlayer1.equals("piedra") && seleccionPlayer2.equals("tijera")) {
                player1++;
            } else if (seleccionPlayer2.equals("piedra") && seleccionPlayer1.equals("tijera")) {
                player2++;
            }

            //papel -> spock
            if (seleccionPlayer1.equals("papel") && seleccionPlayer2.equals("spock")) {
                player1++;
            } else if (seleccionPlayer2.equals("papel") && seleccionPlayer1.equals("spock")) {
                player2++;
            }

            //papel -> piedra
            if (seleccionPlayer1.equals("papel") && seleccionPlayer2.equals("piedra")) {
                player1++;
            } else if (seleccionPlayer2.equals("papel") && seleccionPlayer1.equals("piedra")) {
                player2++;
            }

            //spock -> tijeras
            if (seleccionPlayer1.equals("spock") && seleccionPlayer2.equals("tijera")) {
                player1++;
            } else if (seleccionPlayer2.equals("spock") && seleccionPlayer1.equals("tijera")) {
                player2++;
            }

            //spock -> piedra
            if (seleccionPlayer1.equals("spock") && seleccionPlayer2.equals("piedra")) {
                player1++;
            } else if (seleccionPlayer2.equals("spock") && seleccionPlayer1.equals("piedra")) {
                player2++;
            }

            //lagarto -> papel
            if (seleccionPlayer1.equals("lagarto") && seleccionPlayer2.equals("papel")) {
                player1++;
            } else if (seleccionPlayer2.equals("lagarto") && seleccionPlayer1.equals("papel")) {
                player2++;
            }

            //lagarto -> spock
            if (seleccionPlayer1.equals("lagarto") && seleccionPlayer2.equals("spock")) {
                player1++;
            } else if (seleccionPlayer2.equals("lagarto") && seleccionPlayer1.equals("spock")) {
                player2++;
            }

            if (seleccionPlayer1.equals("tijera") && seleccionPlayer2.equals("tijera")) {
                tie++;
            } else if (seleccionPlayer2.equals("piedra") && seleccionPlayer1.equals("piedra")) {
                tie++;
            } else if (seleccionPlayer2.equals("papel") && seleccionPlayer1.equals("papel")) {
                tie++;
            } else if (seleccionPlayer2.equals("spock") && seleccionPlayer1.equals("spock")) {
                tie++;
            } else if (seleccionPlayer1.equals("lagarto") && seleccionPlayer2.equals("lagarto")) {
                tie++;
            }

            return player1+", "+player2+", "+tie;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static void Pantalla () throws IOException {
        try {
            System.out.println("**********************************************");
            System.out.println("*                                            *");
            System.out.println("*   PIEDRA, PAPEL, SPOCK, LAGARTO, TIGERAS   *");
            System.out.println("*                                            *");
            System.out.println("*                                            *");
            System.out.println("*          Seleccione una opción             *");
            System.out.println("*                                            *");
            System.out.println("*  1. Player 1 vs Player 2                   *");
            System.out.println("*  2. Player 1 vs PC                         *");
            System.out.println("*  3. salir                                  *");
            System.out.println("*                                            *");
            System.out.println("*                           Jose Quiñones    *");
            System.out.println("**********************************************");

            BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
            String seleccion = scanner.readLine();
            String expresionRegular = "^[0-9]+$";
            boolean isMatch = Pattern.matches(expresionRegular, seleccion);

            if (isMatch) {
                if (Integer.parseInt(seleccion) == 1) {
                    System.out.println("opción 1");
                    Player1Player2();
                } else if (Integer.parseInt(seleccion) == 2) {
                    System.out.println("opción 2");
                    Player1Pc();

                } else if (Integer.parseInt(seleccion) == 3) {
                    System.out.println("opción 3");
                    return;
                } else {
                    System.out.println("Seleccione entre la opción 1, 2 o 3");
                    Pantalla();
                }
            }
            System.out.println("Seleccione entre la opción 1, 2 o 3");
            Pantalla();
            System.out.println(seleccion);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


