import java.util.Date;
abstract class Cliente {

    String nome;
    
    Date data;

    String endereco;
    public void imprimir(Object obj){
        System.out.println(obj.toString());
    }
    public void comparar(Object obj){
        if(this.equals(obj) == true){
            System.out.println("SÃO A MESMA CONTA");
        }
        else{
            System.out.println("NÃO SÃO A MESMA CONTA");
        }
    }
    public abstract boolean verificar(String chave);

}
