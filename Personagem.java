public class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private int vida;
    private double ataque;

    public Personagem(
        String nome,
        String classe,
        int nivel,
        int vida,
        double ataque
    ) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
    }
}