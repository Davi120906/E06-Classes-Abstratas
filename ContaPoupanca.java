public class ContaPoupanca extends Conta {
    @Override
    public void setLimite() {
        setLimitemax(1000);
        setLimitemin(100);
    }

    public ContaPoupanca(int numero, Cliente dono, double saldo) {
        super(numero, dono, saldo);
        setLimite();
    }
}
