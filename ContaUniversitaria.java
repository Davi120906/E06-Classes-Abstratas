public class ContaUniversitaria extends Conta {
    @Override
    public void setLimite() {
        setLimitemax(500);
        setLimitemin(0);
    }

    public ContaUniversitaria(int numero, Cliente dono, double saldo) {
        super(numero, dono, saldo);
        setLimite();
    }
}
