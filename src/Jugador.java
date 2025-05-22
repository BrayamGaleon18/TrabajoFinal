public class Jugador extends EquipoFutbol {

        private String nombre;
        private int edad;
        private String posicion;
        private String piernaHabil;
        private String equipo;
        private double golesUltimoPartido;
        private double asistencias;
        private double amarillas;
        private double rojas;
        private double faltas;
        private double disparosPuerta;
        private double pasesCompletos;


    public Jugador(String nombre,int edad, String posicion, String piernaHabil, String equipo, double golesUltimoPartido, double asistencias, double amarillas, double rojas, double faltas, double disparosPuerta, double pasesCompletos) {
      this.nombre = nombre;
      this.edad = edad;
        this.posicion = posicion;
        this.piernaHabil = piernaHabil;
        this.equipo = equipo;
        this.golesUltimoPartido = golesUltimoPartido / 3;
        this.asistencias = asistencias / 3;
        this.amarillas = amarillas / 3;
        this.rojas = rojas / 3;
        this.faltas = faltas / 3;
        this.disparosPuerta = disparosPuerta / 3;
        this.pasesCompletos = pasesCompletos / 3;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPiernaHabil() {
        return piernaHabil;
    }

    public void setPiernaHabil(String piernaHabil) {
        this.piernaHabil = piernaHabil;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public double getGolesUltimoPartido() {
        return golesUltimoPartido;
    }

    public void setGolesUltimoPartido(double golesUltimoPartido) {
        this.golesUltimoPartido = golesUltimoPartido;
    }

    public double getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(double asistencias) {
        this.asistencias = asistencias;
    }

    public double getAmarillas() {
        return amarillas;
    }

    public void setAmarillas(double amarillas) {
        this.amarillas = amarillas;
    }

    public double getRojas() {
        return rojas;
    }

    public void setRojas(double rojas) {
        this.rojas = rojas;
    }

    public double getFaltas() {
        return faltas;
    }

    public void setFaltas(double faltas) {
        this.faltas = faltas;
    }

    public double getDisparosPuerta() {
        return disparosPuerta;
    }

    public void setDisparosPuerta(double disparosPuerta) {
        this.disparosPuerta = disparosPuerta;
    }

    public double getPasesCompletos() {
        return pasesCompletos;
    }

    public void setPasesCompletos(double pasesCompletos) {
        this.pasesCompletos = pasesCompletos;
    }

    public String getEquipo() {
            return equipo;
        }

    @Override
    public String toString() {
        return "Jugador{" +
                "edad=" + edad +
                ", posicion='" + posicion + '\'' +
                ", piernaHabil='" + piernaHabil + '\'' +
                ", equipo='" + equipo + '\'' +
                ", golesUltimoPartido=" + golesUltimoPartido +
                ", asistencias=" + asistencias +
                ", amarillas=" + amarillas +
                ", rojas=" + rojas +
                ", faltas=" + faltas +
                ", disparosPuerta=" + disparosPuerta +
                ", pasesCompletos=" + pasesCompletos +
                '}';
    }



    @Override
    public void mostrarEstadisticas() {
        final String RESET = "\u001B[0m";
        final String ROJO = "\u001B[31m";
        final String AZUL = "\u001B[34m";
        final String BLANCO = "\u001B[37m";

        System.out.println(AZUL+"\n----- "+ROJO+"ESTADÍSTICAS DEL JUGADOR: " +BLANCO+ nombre + AZUL+" -----"+ RESET);

        System.out.println("CLUB             : " + equipo);
        System.out.println("EDAD             : " + edad);
        System.out.println("POSICIÓN         : " + posicion);
        System.out.println("PIERNA HÁBIL     : " + piernaHabil);

        System.out.println(AZUL+"\n--------- "+ROJO+"RENDIMIENTO POR PARTIDO "+AZUL+" ---------"+RESET);
        System.out.println("GOLES             : " + String.format("%.1f", golesUltimoPartido));
        System.out.println("ASISTENCIAS       : " + String.format("%.1f", asistencias));
        System.out.println("PASES COMPLETADOS : " + String.format("%.1f", pasesCompletos));
        System.out.println("AMARILLAS         : " + String.format("%.1f", amarillas));
        System.out.println("ROJAS             : " + String.format("%.1f", rojas));
        System.out.println("FALTAS            : " + String.format("%.1f", faltas));
        System.out.println("DISPAROS A PUERTA : " + String.format("%.1f", disparosPuerta));

        System.out.println(AZUL + "--------------------------------------------\n" + RESET);
    }

    public static Jugador desdeTexto(String texto) {
        String[] partes = texto.split(";");
        return new Jugador(
                partes[0],
                Integer.parseInt(partes[1]),
                partes[2],
                partes[3],
                partes[4],
                Double.parseDouble(partes[5]),
                Double.parseDouble(partes[6]),
                Double.parseDouble(partes[7]),
                Double.parseDouble(partes[8]),
                Double.parseDouble(partes[9]),
                Double.parseDouble(partes[10]),
                Double.parseDouble(partes[11])
        );
    }
}
