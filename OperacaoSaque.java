public class OperacaoSaque extends Operacao {
    public static OperacaoSaque RegistraSaque(double valor){
        return new OperacaoSaque(valor);
    }
    private OperacaoSaque(double valor){
        super('s',valor);
    }
}
