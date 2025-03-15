import java.text.DecimalFormat;
import java.util.Scanner;

public class AgenciaBancaria {
    private String nome;
    private String tipoConta;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String formataSaldo(double saldo) {
        DecimalFormat formatacao = new DecimalFormat("#,##0.00");
        return formatacao.format(saldo);
    }

    public void inicializarAplicacao() {
        String saldoFormatado = formataSaldo(saldo);

        System.out.println("**********************************************************");

        System.out.println("Dados iniciais do cliente:");
        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo: R$ " + saldoFormatado);

        System.out.println("**********************************************************");
    }

    public void mostrarMenuPrincipal() {
        System.out.println("");
        System.out.println("Operações:");
        System.out.println("");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Receber Valor");
        System.out.println("3 - Transferir Valor");
        System.out.println("4 - Sair");
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;

        inicializarAplicacao();

        do {
            mostrarMenuPrincipal();

            operacao = scanner.nextInt();
            gerenciaMenu(operacao);
        } while (operacao != 4);
    }

    public void gerenciaMenu(int operacao) {
        switch (operacao) {
            case 1:
                consultarSaldo();
                break;
            case 2:
                receberValor();
                break;
            case 3:
                transferirValor();
                break;
            case 4:
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + formataSaldo(this.getSaldo()));
    }

    public void receberValor() {
        Scanner scanner = new Scanner(System.in);
        double valorRecebido = 0;

        System.out.println("Digite o valor a ser recebido: ");
        valorRecebido = scanner.nextDouble();

        this.setSaldo(this.getSaldo() + valorRecebido);
        consultarSaldo();
    }

    public void transferirValor() {
        Scanner scanner = new Scanner(System.in);
        double valorTransferido = 0;

        System.out.println("Digite o valor a ser transferido: ");
        valorTransferido = scanner.nextDouble();

        if (valorTransferido < this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valorTransferido);
        } else {
            System.out.println("Não há saldo suficiente para realizar esta operação.");
        }

        consultarSaldo();
    }

    public AgenciaBancaria() {
        this.setNome("Daniel Simões de Souza");
        this.setTipoConta("Corrente");
        this.setSaldo(2000);
    }

    public static void main(String[] args) {
        AgenciaBancaria banco = new AgenciaBancaria();
        banco.iniciar();
    }
}
