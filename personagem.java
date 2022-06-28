// a partir de personagem voce pode criar novas classes, tais como:
// heroi - atributo valentia, metodo salvarDia()
// vilao - atributo maldade, , metodo estragarDia()

public class personagem {
    private String nome;
    private String poder;

    public personagem(String nome, String poder) {
        this.nome = nome;
        this.poder = poder;
    }
    public void caracteristica(){
        System.out.printf("\nO personagem %s pode %s!!!", nome, poder);
    }

    public void power(){
        System.out.printf("\nEu consigo %s, voce nao pode me deter!", poder);
    }
}