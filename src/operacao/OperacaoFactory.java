package operacao;

import operacao.impl.Divisao;
import operacao.impl.Multiplicacao;
import operacao.impl.Soma;
import operacao.impl.Subtracao;

public class OperacaoFactory {
    public static Operacao getOperacao(String operacao) {
        return switch (operacao) {
            case "+" -> new Soma();
            case "-" -> new Subtracao();
            case "*" -> new Multiplicacao();
            case "/" -> new Divisao();
            default -> throw new IllegalArgumentException("Operacao inválida");
        };
    }
}
