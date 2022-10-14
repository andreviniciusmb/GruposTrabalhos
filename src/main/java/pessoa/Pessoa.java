/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

import atuacao.Atuacao;
import endereco.Endereco;
import grupo.Grupo;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import telefone.Telefone;

/**
 *
 * @author andre-barros
 */
@Entity
@NamedQueries({
    @NamedQuery(
            name = "Pessoa.findAll",
            query = "SELECT p FROM Pessoa p"),
    @NamedQuery(
            name = "Pessoa.findNome",
            query = "SELECT p.nome FROM Pessoa p"),
}
)
public class Pessoa implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 65)
    private String nome;
    
    @Column(length = 250)
    private String email;
    
    @Column(columnDefinition = "DATE")
    private LocalDate nascimento;
    
    @Transient
    private Integer idade;
    
    @OneToMany(mappedBy="pessoa",
            cascade = CascadeType.ALL)
    //@JoinColumn(name = "pessoa_id")
    private List<Atuacao> lst_atuacoes;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id")
    private List<Telefone> lst_telefones;
    
    @OneToMany(mappedBy = "lider",
            cascade = CascadeType.ALL)
    private List<Grupo> lst_grupos;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
   
    public Pessoa() {
        lst_telefones = new ArrayList<>();
        lst_atuacoes = new ArrayList<>();
    }

    public Pessoa(Long id, String nome, String email, LocalDate nascimento, Integer idade, List<Atuacao> lst_atuacoes, Endereco endereco, List<Telefone> lst_telefones, List<Grupo> lst_grupos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.idade = idade;
        this.lst_atuacoes = lst_atuacoes;
        this.endereco = endereco;
        this.lst_telefones = lst_telefones;
        this.lst_grupos = lst_grupos;
    }
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<Atuacao> getLstAtuacoes() {
        return lst_atuacoes;
    }

    public void setLstAtuacoes(List<Atuacao> lst_atuacoes) {
        this.lst_atuacoes = lst_atuacoes;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getLstTelefones() {
        return lst_telefones;
    }

    public void setLstTelefones(List<Telefone> lst_telefones) {
        this.lst_telefones = lst_telefones;
    }

    public List<Grupo> getLstGrupos() {
        return lst_grupos;
    }

    public void setLstGrupos(List<Grupo> lst_grupos) {
        this.lst_grupos = lst_grupos;
    }
    //</editor-fold>
    
    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", nascimento=" + nascimento + ", idade=" + idade + ", lst_atuacoes=" + lst_atuacoes + ", endereco=" + endereco + ", lst_telefones=" + lst_telefones + ", lst_grupos=" + lst_grupos + '}';
    }


    
}
