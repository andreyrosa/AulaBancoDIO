public class CartaoCredito {
    private String numero;
    private double limite;
    private double fatura;
    private Cliente titular;

    public CartaoCredito(String numero, double limite, Cliente titular) {
        this.numero = numero;
        this.limite = limite;
        this.titular = titular;
        this.fatura = 0;
    }

    public void comprar(double valor) {
        if ((fatura + valor) <= limite) {
            fatura += valor;
            System.out.println("Compra aprovada! Valor: " + valor);
        } else {
            System.out.println("Compra negada! Limite insuficiente.");
        }
    }

    public void pagarFatura(double valor) {
        fatura -= valor;
        if (fatura < 0) fatura = 0;
        System.out.println("Fatura atual: " + fatura);
    }

    public String getNumero() {
        return numero;
    }

    public double getLimite() {
        return limite;
    }

    public double getFatura() {
        return fatura;
    }

    public Cliente getTitular() {
        return titular;
    }
}
