/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atuacao;

import grupo.Grupo;
import java.io.Serializable;
import java.time.LocalDate;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import pessoa.Pessoa;

/**
 *
 * @author andre-barros
 */
@Entity
public class Atuacao implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDate inicio;
    private LocalDate termino;
    
    //verificar lider
    @ManyToOne
    @JoinColumn(name = "grupo_id")
    @JsonbTransient
    private Grupo grupo;
    
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    @JsonbTransient
    private Pessoa pessoa; 

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    
    public Atuacao() {
    }

    public Atuacao(LocalDate inicio, LocalDate termino, Grupo grupo, Pessoa membro) {
        this.inicio = inicio;
        this.termino = termino;
        this.grupo = grupo;
        this.pessoa = membro;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    
    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getTermino() {
        return termino;
    }

    public void setTermino(LocalDate termino) {
        this.termino = termino;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    //</editor-fold>

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
