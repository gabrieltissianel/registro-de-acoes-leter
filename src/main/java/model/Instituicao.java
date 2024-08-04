/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author gabriel
 */

@Entity
public class Instituicao implements Serializable {

    public static enum Tipo{
        MUNICIPAL,
        ESTADUAL,
        FEDERAL,
        PRIVADA,
        COOPERATIVA
    }
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    
    @ColumnJTable(name = "Nome", position = 0)
    @Column (length = 40)
    private String nome;
    
    @ColumnJTable(name = "Local", position = 2)
    @ManyToOne
    @JoinColumn (name = "idLocal")
    private Local local;
    
    @ColumnJTable(name = "Tipo", position = 1)
    private Tipo tipo;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable (name="AcaoInstituicao", 
            joinColumns = {@JoinColumn(name = "idInstituicao")}, 
            inverseJoinColumns = {@JoinColumn(name = "idAcao")})
    private List<Acao> acaos = new ArrayList();

    public Instituicao() {
    }

    public Instituicao(int id, String nome, Local local, Tipo tipo) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.tipo = tipo;
    }
    
    public Instituicao(String nome, Local local, Tipo tipo) {
        this.nome = nome;
        this.local = local;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public List<Acao> getAcaos() {
        return acaos;
    }

    public void setAcaos(List<Acao> acaos) {
        this.acaos = acaos;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
