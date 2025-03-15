public class Perfil {

    static String nome = "";

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Perfil.nome = nome;
    }

    public static void olaPerfil(){
        System.out.println("Olá, " + getNome());
    }

    public static void cumprimentoPersonalizado(String cumprimento) {
        System.out.println(cumprimento);
    }

    public static void main(String[] args) {

    }
}
