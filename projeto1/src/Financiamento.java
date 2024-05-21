public class Financiamento {

    private double valorTotal;
    private double entrada;
    private int parcelas;

    public Financiamento(double valorTotal, double entrada, int parcelas) {

        if(entrada < valorTotal * 0.2){
            throw  new RuntimeException("A entrada nao pode ser inferior a 20% do valor do financiamento");
        }
        if(parcelas < 6){
            throw  new RuntimeException("O numero de parcelas nao pode ser inferior a 6");
        }

        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public double calcPrestacao(){
        return (this.valorTotal - entrada) / parcelas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public int getAprcelas() {
        return parcelas;
    }

    public void setAprcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}
