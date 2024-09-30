public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(123, 456, 0.0, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-------------------------");
        super.imprimirInforComuns();
    }
}
