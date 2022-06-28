//Exemplo de uma classe com heranca de personagem
public class Heroi extends Personagem{
    private int valentia;
    private double vida;

    public Heroi(String nome, String poder) {
        super(nome, poder);
    }
    public Heroi(String nome, String poder, int valentia, double vida){
        super(nome, poder);
        this.valentia = valentia;
        this.vida = vida;
    }
    public void tomouDano(double dano){
        vida -= dano;
        System.out.printf("\nEssa doeu!! HP: %.2f", vida);
    }
    public void vida(){
        System.out.printf("\nO personagem tem %.2f de vida!", vida);
    }

    public static void main(String[] args){
        Heroi hero1 = new Heroi("Homem Aranha", "Jogar teia", 5, 100);

        hero1.caracteristica();
        hero1.power();
        hero1.vida();
        hero1.tomouDano(5);
    }
}