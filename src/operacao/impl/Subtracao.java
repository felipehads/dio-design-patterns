package operacao.impl;

import operacao.Operacao;

public class Subtracao implements Operacao {
    @Override
    public Double calcula(Double operando1, Double operando2) {
        return operando1 - operando2;
    }
}
