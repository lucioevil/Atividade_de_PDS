/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coisa;

/**
 * Objetivo da classe: atribuir e retornar dados do humano.
 * 
 * @author Johny Lúcio
 * @since '06-08-2019'
 * 
 */
public class Humano {
    private String nome;
    private String sexo;
    
    
    /**
     * Método que retorna o nome do humano.
     * 
     * 
     * @return nome String - nome do humano.
     */
    public String getNome() {
        return nome;
    }
    /**
     * Método que atribui nome ao humano. 
     * 
     *@param nome String - nome do humano.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Método que retorna o sexo do humano.
     * 
     * 
     * @return sexo String - pegue o sexo do humano.
     */
    public String getSexo() {
        return sexo;
    }
    /**
     * Método que atribui sexo ao humano.
     * 
     * @param sexo String - dê um sexo ao humano.
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
