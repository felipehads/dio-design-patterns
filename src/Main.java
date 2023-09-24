import operacao.Operacao;
import operacao.OperacaoFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("CALCULADORA");
        System.out.println("-------------------");
        System.out.println("\nDigite a sua operação: \n");

        Double operando1 = input.nextDouble();
        String simboloOperacao = input.next();
        Double operando2 = input.nextDouble();

//        Factory
        Operacao operacao = OperacaoFactory.getOperacao(simboloOperacao);

//        Singleton
        Calculadora calculadora = Calculadora.getInstance();

//        Strategy
        Double resultadoOperacao = calculadora.calcula(operando1, operacao, operando2);

        System.out.println("Resultado da operação: " + resultadoOperacao);
        
        input.close();
    }
}