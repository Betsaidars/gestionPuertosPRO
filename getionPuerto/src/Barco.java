public class Barco {

    private String matricula;
    private int eslora;
    private int yearFabrication;
    private Tipo tipo;

    enum Tipo {
        velero,
        deportivo,
        yateLujo
    }

    public Barco(String matricula, int eslora, int yearFabrication, Tipo tipo){
        this.matricula = matricula;
        this.eslora = eslora;
        this.yearFabrication = yearFabrication;
        this.tipo = tipo;
    }

    public int getEslora(){
        return this.eslora;
    }

    public Tipo getTipo(){
        return this.tipo;
    }

}
