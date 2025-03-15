import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    private int numeroAleatorio;
    private int qtdTentativas;
    private int numeroDigitado;

    public int getNumeroDigitado() {
        return numeroDigitado;
    }

    public void setNumeroDigitado(int numeroDigitado) {
        this.numeroDigitado = numeroDigitado;
    }

    public int getQtdTentativas() {
        return qtdTentativas;
    }

    public void setQtdTentativas(int qtdTentativas) {
        this.qtdTentativas = qtdTentativas;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    public JogoAdvinhacao() {
        this.setNumeroAleatorio(new Random().nextInt(100));
        this.setQtdTentativas(0);
    }

    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de adivinhação!");

        do {
            System.out.println("Digite um número de 0 a 100");
            numeroDigitado = scanner.nextInt();
            qtdTentativas++;

            if (numeroDigitado > numeroAleatorio) {
                System.out.println("O número digitado é maior que número aleatório");
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número digitado é menor que número aleatório");
            }
        } while (numeroDigitado != numeroAleatorio);

        System.out.println("Fim de jogo :)");
        System.out.println("Quantidade de Tentativas: " + qtdTentativas);
        scanner.close();
    }

    public static void main(String[] args) {
        JogoAdvinhacao jogo = new JogoAdvinhacao();
        jogo.iniciarJogo();
    }
}
