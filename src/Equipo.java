
import java.util.List;

    public class Equipo extends EquipoFutbol{
        private List<String> ultimos5Partidos;
        private int golesTotales;
        private int golesHechos;
        private int victorias;
        private int empates;
        private int derrotas;
        private int tirosEsquinaAFavor;
        private int amarillas;
        private int rojas;
        private int faltas;

        public Equipo(String nombre, List<String> ultimos5Partidos, int golesTotales, int golesHechos, int victorias,
                      int empates, int derrotas, int tirosEsquinaAFavor, int amarillas, int rojas, int faltas) {
            super(nombre);
            this.ultimos5Partidos = ultimos5Partidos;
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


        public List<String> getUltimos5Partidos() {
            return ultimos5Partidos;
        }

        public void setUltimos5Partidos(List<String> ultimos5Partidos) {
            this.ultimos5Partidos = ultimos5Partidos;
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
                    "ultimos5Partidos=" + ultimos5Partidos +
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
            System.out.println("\n--- ESTADISTICAS DEL EQUIPO :   " + nombre + "   EN LOS ULTIMOS 5 ENCUENTROS ---\n");
            System.out.println("Últimos 5 partidos: " + ultimos5Partidos);
            System.out.println("Goles recibidos: " + golesTotales + " | Promedio de goles recibidos por partido: " + (golesTotales / 5.0));
            System.out.println("Goles a favor: " + golesHechos + " | Promedio de goles a favor por partido: " + (golesHechos / 5.0));
            System.out.println("Victorias: " + victorias + " | Promedio de victorias en los ultimos 5 partidos: " + (victorias / 5.0));
            System.out.println("Empates: " + empates + " | Promedio de empate en los ultimos 5 partidos: " + (empates / 5.0));
            System.out.println("Derrotas: " + derrotas + " | Promedio de derrotas en los ultimos 5 partidos: " + (derrotas / 5.0));
            System.out.println("Tiros de esquina a favor: " + tirosEsquinaAFavor + " | Promedio de tiros de esquina en los ultimos 5 partidos: " + (tirosEsquinaAFavor / 5.0));
            System.out.println("Tarjetas amarillas: " + amarillas + " | Promedio de tarjetas amarillas por partido: " + (amarillas / 5.0));
            System.out.println("Tarjetas rojas: " + rojas + " | Promedio de tarjetas rojas por partido: " + (rojas / 5.0));
            System.out.println("Faltas cometidas: " + faltas + " | Promedio de faltas por partido: " + (faltas / 5.0)+ "\n");

        }
    }






