/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Mateus
 */
public class Processo {

    
    private String entrevistadoraUm;
    private String entrevistadoraDois;
    private String entrevistadoraInternamento;
    private String entrevistadoraSaida;
    private String dataUm;
    private String dataDois;
    private String dataInternamento;
    private String dataSaida;

    /**
     * @return the idProcesso
     */
    public Processo() {
        
        entrevistadoraUm = "";
        entrevistadoraDois = "";
        entrevistadoraInternamento = "";
        entrevistadoraSaida = "";
        dataUm = "";
        dataDois = "";
        dataSaida = "";
        dataInternamento = "";
    }
    
    
    

    /**
     * @return the entrevistadoraUm
     */
    public String getEntrevistadoraUm() {
        return entrevistadoraUm;
    }

    /**
     * @param entrevistadoraUm the entrevistadoraUm to set
     */
    public void setEntrevistadoraUm(String entrevistadoraUm) {
        this.entrevistadoraUm = entrevistadoraUm;
    }

    /**
     * @return the entrevistadoraDois
     */
    public String getEntrevistadoraDois() {
        return entrevistadoraDois;
    }

    /**
     * @param entrevistadoraDois the entrevistadoraDois to set
     */
    public void setEntrevistadoraDois(String entrevistadoraDois) {
        this.entrevistadoraDois = entrevistadoraDois;
    }

    /**
     * @return the entrevistadoraInternamento
     */
    public String getEntrevistadoraInternamento() {
        return entrevistadoraInternamento;
    }

    /**
     * @param entrevistadoraInternamento the entrevistadoraInternamento to set
     */
    public void setEntrevistadoraInternamento(String entrevistadoraInternamento) {
        this.entrevistadoraInternamento = entrevistadoraInternamento;
    }

    /**
     * @return the entrevistadoraSaida
     */
    public String getEntrevistadoraSaida() {
        return entrevistadoraSaida;
    }

    /**
     * @param entrevistadoraSaida the entrevistadoraSaida to set
     */
    public void setEntrevistadoraSaida(String entrevistadoraSaida) {
        this.entrevistadoraSaida = entrevistadoraSaida;
    }

    /**
     * @return the dataUm
     */
    public String getDataUm() {
        return dataUm;
    }

    /**
     * @param dataUm the dataUm to set
     */
    public void setDataUm(String dataUm) {
        this.dataUm = dataUm;
    }

    /**
     * @return the dataDois
     */
    public String getDataDois() {
        return dataDois;
    }

    /**
     * @param dataDois the dataDois to set
     */
    public void setDataDois(String dataDois) {
        this.dataDois = dataDois;
    }

    /**
     * @return the dataInternamento
     */
    public String getDataInternamento() {
        return dataInternamento;
    }

    /**
     * @param dataInternamento the dataInternamento to set
     */
    public void setDataInternamento(String dataInternamento) {
        this.dataInternamento = dataInternamento;
    }

    /**
     * @return the dataSaida
     */
    public String getDataSaida() {
        return dataSaida;
    }

    /**
     * @param dataSaida the dataSaida to set
     */
    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }
}