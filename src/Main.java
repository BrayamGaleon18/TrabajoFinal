import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Main {
    public static void main(String[] args) {


        List<Jugador> jugadores = new ArrayList<>();
        List<Equipo> equipos = cargarEquipos();
        cargarJugadores(jugadores);
        Scanner teclado = new Scanner(System.in);

        final String RESET = "\u001B[0m";
        final String BLUE = "\u001B[34m";
        final String RED = "\u001B[31m";
        final String BLANCO = "\u001B[37m";
        final String GREEN = "\u001B[32m";

        File carpeta = new File("data");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }

        int opcion, victorias, empates, derrotas, edad;
        int golesTotales, golesHechos, tirosEsquina, amarillas, rojas, faltas;
        double goles, amarillasJ, asistencias, rojasJ,faltasJ, disparos, pases;
        String nombreJ, posicion, pierna, equipo, nombre;


        do {


            System.out.println("\n" + BLUE + "╔════════════════════════════════════════════════╗");
            System.out.println("║            "+ RED +"⚽ SISTEMA DE ESTADÍSTICAS ⚽"+ BLUE+ "       ║");
            System.out.println("╠════════════════════════════════════════════════╣");
            System.out.println("║ " + RED + "1" + BLANCO + ". Agregar estadísticas por equipo"+BLUE+"             ║");
            System.out.println("║ " + RED + "2" + BLANCO + ". Agregar estadísticas por jugador"+BLUE+"            ║");
            System.out.println("║ " + RED + "3" + BLANCO + ". Mostrar equipos agregados"+BLUE+"                   ║");
            System.out.println("║ " + RED + "4" + BLANCO + ". Mostrar jugadores por club"+BLUE+"                  ║");
            System.out.println("║ " + RED + "0" + RED + ". Salir"+BLUE+"                                       ║");
            System.out.println(BLUE+"╚════════════════════════════════════════════════╝" + RESET);
            System.out.print("Seleccione una opción: " + RESET);

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1 -> {

                    System.out.print("\nNombre del equipo: ");
                    nombre = teclado.nextLine();

                    System.out.print("Goles recibidos en los ultimos 5 partidos: ");
                     golesTotales = teclado.nextInt();
                    System.out.print("Goles hechos en los ultimos 5 partidos: ");
                     golesHechos = teclado.nextInt();
                    do {
                        System.out.print("Victorias en los últimos 5 partidos: ");
                        victorias = teclado.nextInt();
                        System.out.print("Empates en los últimos 5 partidos: ");
                        empates = teclado.nextInt();
                        System.out.print("Derrotas en los últimos 5 partidos: ");
                        derrotas = teclado.nextInt();

                        int total = victorias + empates + derrotas;
                        if (total != 5) {
                            System.out.println(RED + "*** La suma de victorias, empates y derrotas debe ser exactamente 5. ***" + RESET);
                        }
                    } while (victorias + empates + derrotas != 5);

                    System.out.print("Tiros de esquina a favor en los ultimos 5 partidos: ");
                    tirosEsquina = teclado.nextInt();
                    System.out.print("Tarjetas amarillas en los ultimos 5 partidos: ");
                    amarillas = teclado.nextInt();
                    System.out.print("Tarjetas rojas en los ultimos 5 partidos: ");
                    rojas = teclado.nextInt();
                    System.out.print("Faltas cometidasen los ultimos 5 partidos: ");
                    faltas = teclado.nextInt();
                    teclado.nextLine();

                    Equipo nuevoEquipo = new Equipo(nombre, golesTotales, golesHechos, victorias,
                            empates, derrotas, tirosEsquina, amarillas, rojas, faltas);
                    equipos.add(nuevoEquipo);

                    System.out.println(GREEN + "\n✔ Equipo agregado exitosamente." + RESET);

                    try {
                        File archivo = new File("data/equipos.txt");
                        FileWriter writer = new FileWriter(archivo, true);
                        writer.write("Equipo: " + nombre + "\n");
                        writer.write("Goles recibidos: " + golesTotales + "\n");
                        writer.write("Goles hechos: " + golesHechos + "\n");
                        writer.write("Victorias: " + victorias + ", Empates: " + empates + ", Derrotas: " + derrotas + "\n");
                        writer.write("Tiros de esquina: " + tirosEsquina + "\n");
                        writer.write("Amarillas: " + amarillas + ", Rojas: " + rojas + "\n");
                        writer.write("Faltas cometidas: " + faltas + "\n");
                        writer.write("-------------------------------------\n");
                        writer.close();

                    } catch (IOException e) {
                        System.out.println("Error al guardar equipo: " + e.getMessage());
                    }
                }

                case 2 -> {

                    System.out.print("\nNombre del jugador: ");
                     nombreJ = teclado.nextLine();
                    do {
                        System.out.print("Edad (mínimo 4 años): ");
                        edad = teclado.nextInt();
                        if (edad < 4) {
                            System.out.println(RED + "*** La edad no puede ser menor de 4 años. ***" + RESET);
                        }
                    } while (edad < 4);

                    teclado.nextLine();
                    System.out.print("Posición: ");
                    posicion = teclado.nextLine();
                    System.out.print("Pierna hábil: ");
                    pierna = teclado.nextLine();
                    System.out.print("Equipo al que pertenece: ");
                    equipo = teclado.nextLine();

                    System.out.print("\nGoles en los últimos 3 partidos: ");
                    goles = teclado.nextDouble();
                    System.out.print("Asistencias en los últimos 3 partidos: ");
                     asistencias = teclado.nextDouble();
                    System.out.print("Tarjetas amarillas en los últimos 3 partidos: ");
                    amarillasJ = teclado.nextDouble();
                    System.out.print("Tarjetas rojas en los últimos 3 partidos: ");
                     rojasJ = teclado.nextDouble();
                    System.out.print("Faltas cometidas en los últimos 3 partidos: ");
                     faltasJ = teclado.nextDouble();
                    System.out.print("Disparos a puerta en los últimos 3 partidos: ");
                     disparos = teclado.nextDouble();
                    System.out.print("Pases completados en los últimos 3 partidos: ");
                     pases = teclado.nextDouble();
                    teclado.nextLine();

                    Jugador jugador = new Jugador(nombreJ, edad, posicion, pierna, equipo, goles, asistencias,
                            amarillasJ, rojasJ, faltasJ, disparos, pases);
                    jugadores.add(jugador);
                    System.out.println(GREEN + "\n✔ Jugador agregado exitosamente." + RESET);


                    try {
                        File archivo = new File("data/jugadores.txt");
                        FileWriter writer = new FileWriter(archivo, true);
                        writer.write("Nombre: " + nombreJ + ", Edad: " + edad + ", Posición: " + posicion + ", Pierna hábil: " + pierna + "\n");
                        writer.write("Equipo: " + equipo + ", Goles: " + goles + ", Asistencias: " + asistencias + "\n");
                        writer.write("Amarillas: " + amarillasJ + ", Rojas: " + rojasJ + ", Faltas: " + faltasJ + "\n");
                        writer.write("Disparos: " + disparos + ", Pases: " + pases + "\n");
                        writer.write("-------------------------------------\n");
                        writer.close();

                    } catch (IOException e) {
                        System.out.println("Error al guardar jugador: " + e.getMessage());
                    }
                }

                case 3 -> {
                    if (equipos.isEmpty()) {
                        System.out.println(RED+"\nNo hay equipos registrados."+RESET);
                    } else {
                        for (Equipo e : equipos) {
                            e.mostrarEstadisticas();
                        }
                    }
                }

                case 4 -> {

                    if (jugadores.isEmpty()) {
                        System.out.println(RED+"\nNo hay jugadores registrados."+RESET);
                    } else {
                        Set<String> clubes = new TreeSet<>();
                        for (Jugador j : jugadores) {
                            clubes.add(j.getEquipo());
                        }

                        System.out.println(BLUE+"\n╔═══════════════════════════════════╗");
                        System.out.println("║  "+RED+"Clubes con jugadores registrados"+BLUE+" ║");
                        System.out.println("╠═══════════════════════════════════╣");

                        for (String club : clubes) {
                            String espacio = " ".repeat(33 - club.length());
                            System.out.println("║ " +BLANCO+ club + espacio +BLUE+ " ║");
                        }

                        System.out.println(BLUE+"╚═══════════════════════════════════╝"+RESET);
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

                }


                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }

    public static List<Equipo> cargarEquipos() {
        List<Equipo> equipos = new ArrayList<>();
        File archivo = new File("data/equipos.txt");
        if (!archivo.exists()) return equipos;

        try (Scanner lector = new Scanner(archivo)) {
            while (lector.hasNextLine()) {
                String linea;


                linea = lector.nextLine();
                if (!linea.contains(": ")) continue;
                String nombre = linea.split(": ")[1];


                linea = lector.nextLine();
                if (!linea.contains(": ")) continue;
                int golesRecibidos = Integer.parseInt(linea.split(": ")[1]);


                linea = lector.nextLine();
                if (!linea.contains(": ")) continue;
                int golesHechos = Integer.parseInt(linea.split(": ")[1]);


                linea = lector.nextLine();
                if (!linea.contains(": ")) continue;
                String[] partesVED = linea.split(", ");
                int victorias = Integer.parseInt(partesVED[0].split(": ")[1]);
                int empates = Integer.parseInt(partesVED[1].split(": ")[1]);
                int derrotas = Integer.parseInt(partesVED[2].split(": ")[1]);


                linea = lector.nextLine();
                if (!linea.contains(": ")) continue;
                int tirosEsquina = Integer.parseInt(linea.split(": ")[1]);


                linea = lector.nextLine();
                if (!linea.contains(": ")) continue;
                String[] partesTarjetas = linea.split(", ");
                int amarillas = Integer.parseInt(partesTarjetas[0].split(": ")[1]);
                int rojas = Integer.parseInt(partesTarjetas[1].split(": ")[1]);


                linea = lector.nextLine();
                if (!linea.contains(": ")) continue;
                int faltas = Integer.parseInt(linea.split(": ")[1]);


                if (lector.hasNextLine()) lector.nextLine();

                equipos.add(new Equipo(nombre, golesRecibidos, golesHechos, victorias,
                        empates, derrotas, tirosEsquina, amarillas, rojas, faltas));
            }
        } catch (Exception e) {
            System.out.println("Error cargando equipos: " + e.getMessage());
        }

        return equipos;
    }




    private static void cargarJugadores(List<Jugador> jugadores) {
        File archivo = new File("data/jugadores.txt");
        if (!archivo.exists()) return;

        String linea1, nombre, posicion, pierna, linea2, equipo, linea3, linea4;
        double goles,asistencias,amarillas, rojas, faltas, disparos, pases;
        int edad;

        try (Scanner sc = new Scanner(archivo)) {
            while (sc.hasNextLine()) {
                try {
                    linea1 = sc.nextLine();
                    if (linea1.trim().isEmpty()) continue;

                    String[] datos1 = linea1.split(", ");
                    if (datos1.length < 4) throw new Exception("Línea 1 mal formada: " + linea1);

                    nombre = datos1[0].split(": ")[1];
                    edad = Integer.parseInt(datos1[1].split(": ")[1]);
                    posicion = datos1[2].split(": ")[1];
                    pierna = datos1[3].split(": ")[1];

                    linea2 = sc.nextLine();
                    String[] datos2 = linea2.split(", ");
                    if (datos2.length < 3) throw new Exception("Línea 2 mal formada: " + linea2);
                    equipo = datos2[0].split(": ")[1];
                    goles = Double.parseDouble(datos2[1].split(": ")[1]);
                    asistencias = Double.parseDouble(datos2[2].split(": ")[1]);

                    linea3 = sc.nextLine();
                    String[] datos3 = linea3.split(", ");
                    if (datos3.length < 3) throw new Exception("Línea 3 mal formada: " + linea3);
                    amarillas = Double.parseDouble(datos3[0].split(": ")[1]);
                    rojas = Double.parseDouble(datos3[1].split(": ")[1]);
                    faltas = Double.parseDouble(datos3[2].split(": ")[1]);

                    linea4 = sc.nextLine();
                    String[] datos4 = linea4.split(", ");
                    if (datos4.length < 2) throw new Exception("Línea 4 mal formada: " + linea4);
                    disparos = Double.parseDouble(datos4[0].split(": ")[1]);
                    pases = Double.parseDouble(datos4[1].split(": ")[1]);

                    if (sc.hasNextLine()) sc.nextLine();

                    jugadores.add(new Jugador(nombre, edad, posicion, pierna, equipo, goles, asistencias, amarillas,
                            rojas, faltas, disparos, pases));
                } catch (Exception e) {
                    System.out.println("Error cargando jugador: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer jugadores: " + e.getMessage());
        }
    }

}
