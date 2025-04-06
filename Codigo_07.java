class CriaPessoa{
     String nome;
     Integer  idade;
    public  CriaPessoa(String _nome, Integer _idade){
        nome = _nome;
        idade = _idade;
    }
    public String getDados(){
        return  nome;
    }

}
public class Codigo_07 {
    public static void main(String[] args){
        CriaPessoa  P1 =  new CriaPessoa("Leandro", 17);
       
        System.out.println( P1.getDados());
    } 
}
