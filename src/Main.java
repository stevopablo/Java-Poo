public class Main {
    public static void main(String[] args) {
        System.out.println("Bank");

        Cliente pablo = new Cliente();
        pablo.setNome("Pablo");

        Conta contaCorrente = new ContaCorrente(pablo);
        Conta poupanca = new ContaPoupanca(pablo);

        contaCorrente.depositar(200);

        contaCorrente.transferir(50, poupanca);

        contaCorrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
