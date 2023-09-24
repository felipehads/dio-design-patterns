package operacao.impl;

import operacao.Operacao;

public class Divisao implements Operacao {
    @Override
    public Double calcula(Double operando1, Double operando2) {
        if (operando2 == 0) throw new IllegalArgumentException("Não é possível dividir por 0");
        return operando1 / operando2;
    }
}
