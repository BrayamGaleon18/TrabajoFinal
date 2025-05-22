
import java.util.List;

    public class Equipo extends EquipoFutbol{
        private int golesTotales;
        private int golesHechos;
        private int victorias;
        private int empates;
        private int derrotas;
        private int tirosEsquinaAFavor;
        private int amarillas;
        private int rojas;
        private int faltas;

        public Equipo(String nombre, int golesTotales, int golesHechos, int victorias,
                      int empates, int derrotas, int tirosEsquinaAFavor, int amarillas, int rojas, int faltas) {
            super(nombre);

            this.golesTotales = golesTotales;
            this.golesHechos = golesHechos;
            this.victorias = victorias;
            this.empates = empates;
            this.derrotas = derrotas;
            this.tirosEsquinaAFavor = tirosEsquinaAFavor;
            this.amarillas = amarillas;
            this.rojas = rojas;
            this.faltas = faltas;
        }


        public int getGolesTotales() {
            return golesTotales;
        }

        public void setGolesTotales(int golesTotales) {
            this.golesTotales = golesTotales;
        }

        public int getGolesHechos() {
            return golesHechos;
        }

        public void setGolesHechos(int golesHechos) {
            this.golesHechos = golesHechos;
        }

        public int getVictorias() {
            return victorias;
        }

        public void setVictorias(int victorias) {
            this.victorias = victorias;
        }

        public int getEmpates() {
            return empates;
        }

        public void setEmpates(int empates) {
            this.empates = empates;
        }

        public int getDerrotas() {
            return derrotas;
        }

        public void setDerrotas(int derrotas) {
            this.derrotas = derrotas;
        }

        public int getTirosEsquinaAFavor() {
            return tirosEsquinaAFavor;
        }

        public void setTirosEsquinaAFavor(int tirosEsquinaAFavor) {
            this.tirosEsquinaAFavor = tirosEsquinaAFavor;
        }

        public int getAmarillas() {
            return amarillas;
        }

        public void setAmarillas(int amarillas) {
            this.amarillas = amarillas;
        }

        public int getRojas() {
            return rojas;
        }

        public void setRojas(int rojas) {
            this.rojas = rojas;
        }

        public int getFaltas() {
            return faltas;
        }

        public void setFaltas(int faltas) {
            this.faltas = faltas;
        }

        @Override
        public String toString() {
            return "Equipo{" +
                    ", golesTotales=" + golesTotales +
                    ", golesHechos=" + golesHechos +
                    ", victorias=" + victorias +
                    ", empates=" + empates +
                    ", derrotas=" + derrotas +
                    ", tirosEsquinaAFavor=" + tirosEsquinaAFavor +
                    ", amarillas=" + amarillas +
                    ", rojas=" + rojas +
                    ", faltas=" + faltas +
                    '}';
        }


        @Override
        public void mostrarEstadisticas() {
            final String RESET = "\u001B[0m";
            final String ROJO = "\u001B[31m";
            final String AZUL = "\u001B[34m";
            final String BLANCO = "\u001B[37m";

            System.out.println("\n" + AZUL + "--------------------"+ROJO+" ESTADÍSTICAS DEL EQUIPO: " +BLANCO+ nombre.toUpperCase() +AZUL+ " --------------------" + RESET + "\n");

            System.out.println(ROJO + padRight("ESTADÍSTICA", 30) + padRight("TOTAL", 10) + "PROMEDIO POR PARTIDO" + RESET);
            System.out.println(AZUL + "--------------------------------------------------------------------------" + RESET);

            imprimirFila("Goles recibidos", golesTotales);
            imprimirFila("Goles a favor", golesHechos);
            imprimirFila("Victorias", victorias);
            imprimirFila("Empates", empates);
            imprimirFila("Derrotas", derrotas);
            imprimirFila("Tiros de esquina a favor", tirosEsquinaAFavor);
            imprimirFila("Tarjetas amarillas", amarillas);
            imprimirFila("Tarjetas rojas", rojas);
            imprimirFila("Faltas cometidas", faltas);

            System.out.println(AZUL + "--------------------------------------------------------------------------\n" + RESET);
        }

        private void imprimirFila(String titulo, int total) {

            final String RESET = "\u001B[0m";
            double promedio = total / 5.0;
            System.out.println( padRight(titulo, 30) + padRight(String.valueOf(total), 10) + String.format("%.2f", promedio) + RESET);
        }


        public String padRight(String texto, int longitud) {
            while (texto.length() < longitud) {
                texto += " ";
            }
            return texto;
        }

        public static Equipo desdeTexto(String texto) {

            int golesRecibidos, golesHechos, victorias, empates, derrotas, tirosEsquina, amarillas, rojas, faltas;

            String[] partes = texto.split(";");
            String nombre = partes[0];
            List<String> ultimos5 = List.of(partes[1].split(","));
            golesRecibidos = Integer.parseInt(partes[2]);
            golesHechos = Integer.parseInt(partes[3]);
            victorias = Integer.parseInt(partes[4]);
            empates = Integer.parseInt(partes[5]);
            derrotas = Integer.parseInt(partes[6]);
            tirosEsquina = Integer.parseInt(partes[7]);
            amarillas = Integer.parseInt(partes[8]);
            rojas = Integer.parseInt(partes[9]);
            faltas = Integer.parseInt(partes[10]);

            return new Equipo(nombre, golesRecibidos, golesHechos, victorias, empates,
                    derrotas, tirosEsquina, amarillas, rojas, faltas);
        }

    }
