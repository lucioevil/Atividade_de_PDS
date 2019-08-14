/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coisa;

/**
 * Objetivo da classe: atribuir e retornar dados da prostituta.
 * 
 * @author Johny Lúcio e José Jardeu
 * @since '06-08-2019'
 */
public class Prostituta {

    private double preco;
    private String telefone;

    /**
     * Método que retorna o preço do programa.
     *
     * @return preco double - Quanto ela cobra.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Método que atribui preço à prostituta
     *
     * @param preco double - valor a ser atribuido.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    /**
     * Método que retorna o numero de telefone da prostituta.
     *
     * @return telefone String - telefone da puta.
     */
    public String getTelefone() {
        return telefone;
    }
    /**
     * Método que atribui o telefone da prostituta
     *
     * @param telefone String - telefone da puta.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
