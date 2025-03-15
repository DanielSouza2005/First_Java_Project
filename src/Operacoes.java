public class Operacoes {

    static Float numero1;
    static Float numero2;
    static Float resultado;

    public static Float getNumero1() {
        return numero1;
    }

    public static void setNumero1(Float numero1) {
        Operacoes.numero1 = numero1;
    }

    public static Float getNumero2() {
        return numero2;
    }

    public static void setNumero2(Float numero2) {
        Operacoes.numero2 = numero2;
    }

    public static Float getResultado() {
        return resultado;
    }

    public static void setResultado(Float resultado) {
        Operacoes.resultado = resultado;
    }

    public static void setValores(Float num1, Float num2) {
        setNumero1(num1);
        setNumero2(num2);
    }

    public static void setValores(Integer num1, Integer num2) {
        setNumero1(num1.floatValue());
        setNumero2(num2.floatValue());
    }

    public static void somar2Numeros() {
        setResultado(getNumero1() + getNumero2());
    }

    public static void subtrair2Numeros() {
        setResultado(getNumero1() - getNumero2());
    }
}
