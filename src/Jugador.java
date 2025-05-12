public class Jugador extends EquipoFutbol {

        private int edad;
        private String posicion;
        private String piernaHabil;
        private String equipo;
        private int golesUltimoPartido;
        private int asistencias;
        private int amarillas;
        private int rojas;
        private int faltas;
        private int disparosPuerta;
        private int pasesCompletos;



        public Jugador(String nombre, int edad, String posicion, String piernaHabil, String equipo,
                       int golesUltimoPartido, int asistencias, int amarillas, int rojas,
                       int faltas, int disparosPuerta, int pasesCompletos) {
            super(nombre);
            this.edad = edad;
            this.posicion = posicion;
            this.piernaHabil = piernaHabil;
            this.equipo = equipo;
            this.golesUltimoPartido = golesUltimoPartido;
            this.asistencias = asistencias;
            this.amarillas = amarillas;
            this.rojas = rojas;
            this.faltas = faltas;
            this.disparosPuerta = disparosPuerta;
            this.pasesCompletos = pasesCompletos;
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

    public int getGolesUltimoPartido() {
        return golesUltimoPartido;
    }

    public void setGolesUltimoPartido(int golesUltimoPartido) {
        this.golesUltimoPartido = golesUltimoPartido;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
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

    public int getDisparosPuerta() {
        return disparosPuerta;
    }

    public void setDisparosPuerta(int disparosPuerta) {
        this.disparosPuerta = disparosPuerta;
    }

    public int getPasesCompletos() {
        return pasesCompletos;
    }

    public void setPasesCompletos(int pasesCompletos) {
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
            System.out.println("\n--- Estadísticas del jugador: " + nombre + " ---");
            System.out.println("Club: " + equipo + ", Edad: " + edad + ", Posición: " + posicion + ", Pierna hábil: " + piernaHabil);
            System.out.println("Último partido -> Goles: " + golesUltimoPartido + ", Asistencias: " + asistencias);
            System.out.println("Tarjetas amarillas: " + amarillas + ", Rojas: " + rojas);
            System.out.println("Faltas cometidas: " + faltas + ", Disparos a puerta: " + disparosPuerta);
            System.out.println("Pases completados: " + pasesCompletos);
        }
    }



