public class OperacaoDeposito extends Operacao {
    public static  OperacaoDeposito RegistraDeposito(double valor){
        return new OperacaoDeposito(valor);
    }
    private OperacaoDeposito(double valor){
        super('d',valor);
    }
}
