public class Vip extends Ingresso{
    private double adicional;

    public Vip(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    void Valortotal(){
        System.out.println("Ingresso VIP "+ getValor()+getAdicional());
    }
}
