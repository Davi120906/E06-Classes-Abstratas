import java.util.Date;
public class Main {
    public static void main(String[] args) {
        PessoaFisica joao = new PessoaFisica();
        joao.nome = "João";
        joao.endereco = "Av. Antonio Carlos, 6627";
        joao.idade = 36;
        joao.sexo = 'm';
        joao.cpf = "011.965.966-14";
        joao.data = new Date();
        PessoaFisica jon = new PessoaFisica();
        jon.nome = "Jon";
        jon.endereco = "Av. Alfonso Pena, 325";
        jon.idade = 25;
        jon.sexo = 'm';
        jon.cpf = "130.170.146-06";
        jon.data = new Date();
        
        PessoasJuridica empresajoao = new PessoasJuridica();
        empresajoao.nome = "João";
        empresajoao.endereco = "Av. Antonio Carlos, 6627";
        empresajoao.data = new Date();
        empresajoao.cnpj = "12345678";
        empresajoao.numfuncionarios = 13;
        empresajoao.setor = "Informatica";
        
        Conta conta1 = new ContaCorrente(1234, joao, 0);
        Conta conta2 = new ContaPoupanca (12121, joao, 10000);

        conta1.depositar(3000);
        conta1.depositar(2000);
        conta1.sacar(500);

        conta2.transferir(conta1, 666);
        conta2.depositar(234);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();

        joao.imprimir(joao);

        empresajoao.imprimir(empresajoao);

        int media = Operacao.getTotalOperacoes() / Conta.getTotalContas();
        System.out.println("Média de operações por conta aberta: " + media);
        joao.comparar(joao);
        jon.comparar(joao);
        conta1.comparar(conta2);
        conta2.comparar(conta2);
    }
}