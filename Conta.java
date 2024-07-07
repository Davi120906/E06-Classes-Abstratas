abstract class Conta {
    private int numero;
    private Cliente dono;
    private double saldo;
    private double limitemax;
    private double limitemin;
    private Operacao[] operacoes;
    private int proximaOperacao;
    private static int totalContas = 0;

    public Conta(int numero, Cliente dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.operacoes = new Operacao[1000];
        this.proximaOperacao = 0;
        Conta.totalContas++;
    }

    public boolean sacar(double valor) {
        if(this.limitemax != 0){
        if (valor >= 0 && valor >= this.limitemin) {
            this.saldo -= valor;
            this.operacoes[proximaOperacao] = OperacaoSaque.RegistraSaque(valor);
            this.proximaOperacao++;
            return true;
        }
    }
    else{
        if (valor >= 0 && valor <= this.limitemax) {
            this.saldo -= valor;
            this.operacoes[proximaOperacao] = OperacaoSaque.RegistraSaque(valor);
            this.proximaOperacao++;
            return true;
        }
    }
        return false;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        this.operacoes[proximaOperacao] = OperacaoDeposito.RegistraDeposito(valor);
        this.proximaOperacao++;
    }

    public boolean transferir(Conta destino, double valor) {
        boolean valorSacado = this.sacar(valor);
        if (valorSacado) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    public void imprimirExtrato() {
        System.out.println("======= Extrato Conta " + this.numero + "======");
        for (Operacao atual : this.operacoes) {
            if (atual != null) {
                atual.imprimir(atual);
            }
        }
        System.out.println("====================");
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimitemax() {
        return limitemax;
    }

    public double getLimitemin() {
        return limitemin;
    }

    public static int getTotalContas() {
        return Conta.totalContas;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public void setLimitemax(double limitemax) {
        this.limitemax = limitemax;
    }

    public void setLimitemin(double limitemin) {
        this.limitemin = limitemin;
    }

    public abstract void setLimite();

    public void comparar(Object obj) {
        if (this.equals(obj)) {
            System.out.println("SÃO A MESMA CONTA");
        } else {
            System.out.println("NÃO SÃO A MESMA CONTA");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Conta outraConta = (Conta) obj;
        return this.numero == outraConta.numero;
    }
}
