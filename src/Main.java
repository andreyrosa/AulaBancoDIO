public class Main {
    public static void main(String[] args) {
        Cliente rafael = new Cliente();
        rafael.setNome("Rafael");
        rafael.setCpf("123.456.789-00");

        Conta cc = new ContaCorrente(rafael);
        Conta poupanca = new ContaPoupanca(rafael);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        CartaoCredito cartao = new CartaoCredito("1234 5678 9012 3456", 1000, rafael);
        cartao.comprar(200);
        cartao.comprar(900);

        cartao.pagarFatura(100);
    }
}
