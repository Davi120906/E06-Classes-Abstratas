public class ContaCorrente extends Conta {
    @Override
    public void setLimite(){
        setLimitemax(0);
        setLimitemin(-100);
    }

    public ContaCorrente(int numero, Cliente dono, double saldo) {
        super(numero, dono, saldo);
        setLimite();
    }
}
