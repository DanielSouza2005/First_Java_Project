public class Produto {
    private static double preco;
    private static int quantidade;
    private static double valor_total;
    private static double valor_total_dolar;
    private static double percentual_desconto;

    public static double getPercentual_desconto() {
        return percentual_desconto;
    }

    public static void setPercentual_desconto(double percentual_desconto) {
        Produto.percentual_desconto = percentual_desconto;
    }

    public static double getValor_total_dolar() {
        return valor_total_dolar;
    }

    public static void setValor_total_dolar(double valor_total_dolar) {
        Produto.valor_total_dolar = valor_total_dolar;
    }

    public static double getValor_total() {
        return valor_total;
    }

    public static void setValor_total(double valor_total) {
        Produto.valor_total = valor_total;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int quantidade) {
        Produto.quantidade = quantidade;
    }

    public static double getPreco() {
        return preco;
    }

    public static void setPreco(double preco) {
        Produto.preco = preco;
    }

    public static void calcularValorTotal(){
        double valor_total_temp = 0;
        valor_total_temp = (Produto.preco * Produto.quantidade);
        valor_total_temp -= valor_total_temp * Produto.getPercentual_desconto() / 100;

        Produto.setValor_total(valor_total_temp);
    }

    public static void converterValorTotalEmDolar() {
        Produto.setValor_total_dolar(Produto.getValor_total() * 5.8);
    }

}
