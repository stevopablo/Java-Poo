public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(123, 456, 0.0, cliente); // Example values for numero, agencia, saldo
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--------------------");
        super.imprimirInforComuns();
    }
}
