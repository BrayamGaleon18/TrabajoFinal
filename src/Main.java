import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Equipo> equipos = new ArrayList<>();
        List<Jugador> jugadores = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);


        String nombre;
        int golesTotales, golesHechos, victorias, empates, derrotas, tirosEsquina, amarillas, rojas, faltas;

        int edad, pases, disparos, faltasJ, rojasJ, amarillasJ, asistencias, goles;
        String equipo, pierna, posicion, nombreJ;

        int opcion;
        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Agregar estadísticas por equipo");
            System.out.println("2. Agregar estadísticas por jugador");
            System.out.println("3. Mostrar equipos agregados");
            System.out.println("4. Mostrar jugadores por club");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre del equipo: ");
                    nombre = teclado.nextLine();

                    List<String> ultimos5 = new ArrayList<>();
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Resultado del partido " + i + " (victoria/empate/derrota): ");
                        ultimos5.add(teclado.nextLine());
                    }

                    System.out.print("Goles recibidos en total: ");
                    golesTotales = teclado.nextInt();
                    System.out.print("Goles hechos en total: ");
                    golesHechos = teclado.nextInt();
                    System.out.print("Victorias: ");
                    victorias = teclado.nextInt();
                    System.out.print("Empates: ");
                    empates = teclado.nextInt();
                    System.out.print("Derrotas: ");
                    derrotas = teclado.nextInt();
                    System.out.print("Tiros de esquina a favor: ");
                    tirosEsquina = teclado.nextInt();
                    System.out.print("Tarjetas amarillas: ");
                    amarillas = teclado.nextInt();
                    System.out.print("Tarjetas rojas: ");
                    rojas = teclado.nextInt();
                    System.out.print("Faltas cometidas: ");
                    faltas = teclado.nextInt();
                    teclado.nextLine();

                    Equipo nuevoEquipo = new Equipo(nombre, ultimos5, golesTotales, golesHechos, victorias,
                            empates, derrotas, tirosEsquina, amarillas, rojas, faltas);
                    equipos.add(nuevoEquipo);

                    System.out.println("Equipo agregado exitosamente.");
                }

                case 2 -> {
                    System.out.print("Nombre del jugador: ");
                    nombreJ = teclado.nextLine();
                    System.out.print("Edad: ");
                    edad = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Posición: ");
                    posicion = teclado.nextLine();
                    System.out.print("Pierna hábil: ");
                    pierna = teclado.nextLine();
                    System.out.print("Equipo al que pertenece: ");
                    equipo = teclado.nextLine();

                    System.out.print("Goles en el último partido: ");
                    goles = teclado.nextInt();
                    System.out.print("Asistencias: ");
                    asistencias = teclado.nextInt();
                    System.out.print("Tarjetas amarillas: ");
                    amarillasJ = teclado.nextInt();
                    System.out.print("Tarjetas rojas: ");
                    rojasJ = teclado.nextInt();
                    System.out.print("Faltas cometidas: ");
                    faltasJ = teclado.nextInt();
                    System.out.print("Disparos a puerta: ");
                    disparos = teclado.nextInt();
                    System.out.print("Pases completados: ");
                    pases = teclado.nextInt();
                    teclado.nextLine();

                    Jugador jugador = new Jugador(nombreJ, edad, posicion, pierna, equipo, goles, asistencias,
                            amarillasJ, rojasJ, faltasJ, disparos, pases);
                    jugadores.add(jugador);
                    System.out.println("Jugador agregado exitosamente.");
                }

                case 3 -> {
                    if (equipos.isEmpty()) {
                        System.out.println("No hay equipos registrados.");
                    } else {
                        for (Equipo e : equipos) {
                            e.mostrarEstadisticas();
                        }
                    }
                }

                case 4 -> {
                    System.out.print("Ingrese el nombre del club: ");
                    String club = teclado.nextLine();
                    boolean encontrado = false;
                    for (Jugador j : jugadores) {
                        if (j.getEquipo().equalsIgnoreCase(club)) {
                            j.mostrarEstadisticas();
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No hay jugadores registrados en ese club.");
                    }
                }

                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }
}
