/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo;

import atuacao.Atuacao;
import pessoa.Pessoa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author andre-barros
 */
@Entity
public class Grupo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 65)
    private String nome;
    private Boolean ativo;
    
    @OneToMany(mappedBy = "grupo",
            cascade = CascadeType.ALL)
    private List<Atuacao> lst_atuacoes;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lider_id")
    @JsonbTransient
    private Pessoa lider;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    
    public Grupo() {
    }

    public Grupo(String nome, Boolean ativo, Pessoa lider) {
        this.nome = nome;
        this.ativo = ativo;
        this.lst_atuacoes = lst_atuacoes;
        this.lider = lider;
    }
    
    public Grupo(String nome, Boolean ativo, List<Atuacao> lst_atuacoes, Pessoa lider) {
        this.nome = nome;
        this.ativo = ativo;
        this.lst_atuacoes = lst_atuacoes;
        this.lider = lider;
    }

    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Atuacao> getLst_atuacoes() {
        return lst_atuacoes;
    }

    public void setLst_atuacoes(List<Atuacao> lst_atuacoes) {
        this.lst_atuacoes = lst_atuacoes;
    }

    public Pessoa getLider() {
        return lider;
    }

    public void setLider(Pessoa lider) {
        this.lider = lider;
    }
    //</editor-fold>
    
}
