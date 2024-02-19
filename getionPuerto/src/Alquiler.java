public class Alquiler {

    private String nombre;
    private String dni;
    private String fechaInicioAlquiler;
    private int dias;
    private String position;
    private Barco barco;
    private Estado estado;
    private double modulo;

    public Alquiler(String nombre, String dni, String fechaInicioAlquiler, int dias, String position, Barco barco, Estado estado){
        this.nombre = nombre;
        this.dni = dni;
        this.fechaInicioAlquiler = fechaInicioAlquiler;
        this.dias = dias;
        this.position = position;
        this.barco = barco;
        this.estado = estado;
    }

    enum Estado{
        amarrado,
        navegando
    }

    public int CalculoAlquiler(){
        int dias = this.dias;
        int eslora = barco.getEslora();
        int tipoBarco = 0;

        if (barco.getTipo().equals(Barco.Tipo.velero)){
            tipoBarco = 3;
        } else if (barco.getTipo().equals(Barco.Tipo.deportivo)){
            tipoBarco = 15;
        } else if (barco.getTipo().equals(Barco.Tipo.yateLujo)){
            tipoBarco = 150;
        }

        return dias * (5 * eslora * tipoBarco);

    }









}
