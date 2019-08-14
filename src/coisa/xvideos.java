/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coisa;

/**
 * Objetivo da classe: atribuir e retornar dados sobre o vídeo.
 * 
 * @author Johny Lúcio Teixeira da Costa e José Jardeu Vicente da Silva
 * @since '14-08-2019' 
 */
public class xvideos {

    private String categoria;
    private String qualidade;
    /**
     * Método que retorna a categoria do video. 
     * 
     * @return categoria String - pegue a categoria do védeo.
     */
    public String getCategoria() {
        return categoria;
    }
    /**
     * Método que atribui um valor a categoria do vídeo.
     * 
     * @param categoria String - dê um valor a categoria.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    /**
     * Método que retorna a qualidade do video.
     * 
     * 
     * @return qualidade String - peque a qualidade do vídeo 
     */
    public String getQualidade() {
        return qualidade;
    }
    /**
     * Método que atribui um valor a qualidade do vídeo.
     * 
     * @param qualidade String - atribua um valor a qualidade do vídeo.
     */
    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

}
