public class PessoaFisica extends Cliente {
    String cpf;
    int idade;
    char sexo;
    @Override
    public String toString() {
        return "Dono: " + super.nome + "\n" +
               "Endereco: " + super.endereco + "\n" +
               "CPF: " + cpf + "\n" +
               "Idade do cliente: " + idade + "\n" +
               "Sexo: " + sexo + "\n" +
               "Data de criacao da conta: " + super.data + "\n" +
               "====================";
    }
    @Override 
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        PessoaFisica outraPessoa = (PessoaFisica) obj;
        if(this.cpf == outraPessoa.cpf){
        return true;
        }
        else{
            return false;
        }
    }
    @Override
    public boolean verificar(String chave){
        boolean resposta = false;
        if(chave == this.cpf){
            resposta = true;
        }
        return resposta;
    }
}
