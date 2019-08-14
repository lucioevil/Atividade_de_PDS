/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coisa;

/**
 * Objetivo da classe: fazer calculos com operações simples.
 * @author Johny Lúcio e José Jardeu
 * @since '06-08-2019'
 */
public class Operacoes_simples {

    /**
     * Este metodo faz a soma entre dois numeros.
     *
     * @return soma Double - Resultado da soma dos valores.
     * @param n1 Double - Número a ser somado.
     * @param n2 Double - Número a ser somado.
     */
    public static double somar(double n1, double n2) {
        double soma = n1 + n2;
        return soma;
    }

    /**
     * Este metodo faz uma subtração entre dois numeros
     *
     * @return diferenca Double - Resultado da subtração dos valores.
     * @param n1 Double - Número a ser subtraido.
     * @param n2 Double - Número a ser subtraido.
     */
    public static double subtrair(double n1, double n2) {
        double diferenca = n1 - n2;
        return diferenca;
    }

    /**
     * Este metodo faz uma divisão entre dois numeros
     *
     * @return quociente Double - Resultado da divisão dos valores.
     * @param n1 Double - Número a ser dividido.
     * @param n2 Double - Número a ser dividido.
     */
    public static double dividir(double n1, double n2) {
        double quociente = n1 / n1;
        return quociente;
    }

    /**
     * Este metodo faz uma multiplicação entre dois metodos
     *
     * @return produto Double - Resultado da multiplicação dos valores.
     * @param n1 Double - Número a ser multiplicado.
     * @param n2 Double - Número a ser multiplicado.
     */
    public static double mult(double n1, double n2) {
        double produto = n1 * n2;
        return produto;
    }
}
