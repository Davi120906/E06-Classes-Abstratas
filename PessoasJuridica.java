public class PessoasJuridica extends Cliente {
    String cnpj;
    int numfuncionarios;
    String setor;
    @Override
    public String toString() {
        return "Dono: " + super.nome + "\n" +
               "Endereco: " + super.endereco + "\n" +
               "CNPJ: " + cnpj + "\n" +
               "Numero de Funcionarios: " + numfuncionarios + "\n" +
               "Setor: " + setor + "\n" +
               "Data de criacao da conta: " + super.data + "\n" +
               "====================";
    }
    @Override 
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        PessoasJuridica outraPessoasJuridica= (PessoasJuridica) obj;
        if(this.cnpj == outraPessoasJuridica.cnpj){
        return true;
        }
        else{
            return false;
        }
    }
    @Override
    public boolean verificar(String chave){
        boolean resposta = false;
        if(chave == this.cnpj){
            resposta = true;
        }
        return resposta;
    }
}
