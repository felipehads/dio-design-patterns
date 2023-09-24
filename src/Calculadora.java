import operacao.Operacao;

public class Calculadora {
    private static Calculadora calculadora = null;

    private Calculadora() {
    }

    public static Calculadora getInstance() {
        if (calculadora == null) calculadora = new Calculadora();
        return calculadora;
    }

    public Double calcula(Double numero1, Operacao operacao, Double numero2) {
        return operacao.calcula(numero1, numero2);
    }
}
