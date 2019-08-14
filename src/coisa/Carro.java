/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coisa;

/**
 * Objetivo da classe: atribuir e retornar dados do carro.
 *
 * @author Johny Lúcio e José Jardeu
 * @since '06-08-2019'
 */
public class Carro {

    private String marca;
    private String modelo;
    private String placa;

    /**
     * Método que retorna a marca do carro
     * 
     * @return marca String - Marca do carro
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método para atribuir um valor à marca do carro
     * 
     * @param marca String - Marca do carro
     * @author José Jardeu
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método que retorna o modelo do carro
     * 
     * @return modelo String - Modelo do carro
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método para atribuir um valor ao modelo do carro
     * 
     * @param modelo String - Modelo do carro
     * @author José Jardeu
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método que retorna a placa do carro
     * 
     * @return placa String - placa do carro
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Método para atribuir um valor à placa do carro
     * 
     * @param placa String - placa do carro
     * @author José Jardeu
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
