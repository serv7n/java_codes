public class Codigo_06 {

    public void main(String[] args) {
        Jogador j = new Jogador();
        j.nome = "leandro";
        System.out.println(j.nomeCompleto());
        System.out.println(j.somar(10, 20));
    }
}

class Jogador {
    public String nome, cor;
    int idade;

    String nomeCompleto() {
        return nome;
    }

    public int somar(int n1, int n2) {
        return n1 + n2;
    }

}