public class Camarote extends Ingresso{
    private double adicional;
    private String Localizacao;
    public Camarote(double valor, double adicional, String localizacao) {
        super(valor);
        this.adicional = adicional;
        Localizacao = localizacao;
    }
    void IngressoCamorote(){
        System.out.println("Ingresso Camarote " + getLocalizacao()+" R$ "+getValor()+getAdicional());
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public String getLocalizacao() {
        return Localizacao;
    }

    public void setLocalizacao(String localizacao) {
        Localizacao = localizacao;
    }
}
