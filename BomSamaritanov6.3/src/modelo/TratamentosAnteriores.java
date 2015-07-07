package modelo;
public class TratamentosAnteriores {
    private String dataEntrada;
    private String dataSaida;
    private String Clinica;
    private String MotivoSaida;

    public TratamentosAnteriores(){
     dataEntrada="";
     dataSaida="";
     Clinica="";
     MotivoSaida="";
     

    }

    /**
     * @return the dataEntrada
     */
    public String getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
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



    /**
     * @return the Clinica
     */
    public String getClinica() {
        return Clinica;
    }

    /**
     * @param Clinica the Clinica to set
     */
    public void setClinica(String Clinica) {
        this.Clinica = Clinica;
    }

    /**
     * @return the MotivoSaida
     */
    public String getMotivoSaida() {
        return MotivoSaida;
    }

    /**
     * @param MotivoSaida the MotivoSaida to set
     */
    public void setMotivoSaida(String MotivoSaida) {
        this.MotivoSaida = MotivoSaida;
    }

}
