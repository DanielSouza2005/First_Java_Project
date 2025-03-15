public class Conversoes {
    private static float temperatura;
    private static float resultado;

    public static float getTemperatura() {
        return temperatura;
    }

    public static void setTemperatura(float temperatura) {
        Conversoes.temperatura = temperatura;
    }

    public static int getResultado() {
        return (int) resultado;
    }

    public static void setResultado(float resultado) {
        Conversoes.resultado = resultado;
    }

    public static void converterCelsiusParaFahrenheit() {
        Conversoes.setResultado((float) ((Conversoes.temperatura * 1.8) + 32));
    }


}
