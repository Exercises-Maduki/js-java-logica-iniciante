public class Heroi {
    private String nome;
    private int idade;
    private String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        String ataque;

        switch (this.tipo) {
            case "mago":
                ataque = "usou magia";
                break;
            case "guerreiro":
                ataque = "usou espada";
                break;
            case "monge":
                ataque = "usou artes marciais";
                break;
            case "ninja":
                ataque = "usou shuriken";
                break;
            default:
                ataque = "usou um ataque desconhecido";
        }

        System.out.println("o " + this.tipo + " atacou usando " + ataque);
    }

    public static void main(String[] args) {
        Heroi mago = new Heroi("Merlin", 100, "mago");
        mago.atacar(); 

        Heroi guerreiro = new Heroi("Arthur", 30, "guerreiro");
        guerreiro.atacar(); 
    }
}
