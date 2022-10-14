/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package endereco;

import util.TipoLogradouro;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author andre-barros
 */
@Entity
public class Endereco implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Enumerated
    private TipoLogradouro tipoLogradouro;
    
    @Column(length = 250)
    private String logradouro;
    private Integer numero;
    
    @Column(length = 25)
    private String bairro;
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    
    public Endereco() {
    }

    public Endereco(TipoLogradouro tipoLogradouro, String logradouro, Integer numero, String bairro) {
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    
    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    //</editor-fold>
    
}
