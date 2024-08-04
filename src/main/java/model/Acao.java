/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import control.FuncoesUteis;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author gabriel
 */

@Entity
public class Acao implements Serializable {
    
    public static enum Tipo{
        OFICINA,
        CURSO,
        PALESTRA,
        VISITA_TECNICA
    }
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    
    @ColumnJTable(name = "Inicio", position = 1)
    @Temporal(value = TemporalType.DATE)
    private Date dtInicio;
    
    @ColumnJTable(name = "Fim", position = 2)
    @Temporal(value = TemporalType.DATE)
    private Date dtFim;
    
    private int cargaHoraria;
    
    @ColumnJTable(name = "Nome", position = 0)
    @Column(length = 40)
    private String nome;
    
    @Column(length = 300)
    private String descricao;
    
    @ColumnJTable(name = "Tipo", position = 4)
    private Tipo tipo;
    
    @ColumnJTable(name = "Local", position = 3)
    @ManyToOne
    @JoinColumn (name = "idLocal")
    private Local local;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable (name="AcaoInstituicao", 
            joinColumns = {@JoinColumn(name = "idAcao")}, 
            inverseJoinColumns = {@JoinColumn(name = "idInstituicao")})
    private List<Instituicao> instituicoes = new ArrayList();
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable (name="AcaoParticipante", 
            joinColumns = {@JoinColumn(name = "idAcao")}, 
            inverseJoinColumns = {@JoinColumn(name = "idPessoa")})
    private List<Participante> participantes = new ArrayList();
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable (name="AcaoExecutor", 
            joinColumns = {@JoinColumn(name = "idAcao")}, 
            inverseJoinColumns = {@JoinColumn(name = "idPessoa")})
    private List<Executor> executores = new ArrayList();

    public Acao() {
    }

    public Acao(int id, Date dtInicio, Date dtFim, int cargaHoraria, String nome, String descricao, Tipo tipo, Local local, List<Instituicao> instituicoes) {
        this.id = id;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.cargaHoraria = cargaHoraria;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.local = local;
        this.instituicoes = instituicoes;
        this.participantes = new ArrayList();
        this.participantes = new ArrayList();
    }

    public Acao(Date dtInicio, Date dtFim, int cargaHoraria, String nome, String descricao, Tipo tipo, Local local) {
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.cargaHoraria = cargaHoraria;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.local = local;
        this.participantes = new ArrayList();
        this.participantes = new ArrayList();
    }
    
    public Acao(int id, Date dtInicio, Date dtFim, int cargaHoraria, String nome, String descricao, Tipo tipo, Local local, List<Instituicao> instituicoes, List<Participante> participantes, List<Executor> executores) {
        this.id = id;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.cargaHoraria = cargaHoraria;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.local = local;
        this.instituicoes = instituicoes;
        this.participantes = participantes;
        this.executores = executores;
    }

    public Acao(Date dtInicio, Date dtFim, int cargaHoraria, String nome, String descricao, Tipo tipo, Local local, List<Instituicao> instituicoes, List<Participante> participantes, List<Executor> executores) {
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.cargaHoraria = cargaHoraria;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.local = local;
        this.instituicoes = instituicoes;
        this.participantes = participantes;
        this.executores = executores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public List<Instituicao> getInstituicoes() {
        return instituicoes;
    }

    public void setInstituicoes(List<Instituicao> instituicoes) {
        this.instituicoes = instituicoes;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public List<Executor> getExecutores() {
        return executores;
    }

    public void setExecutores(List<Executor> executores) {
        this.executores = executores;
    }
    
    @Override
    public String toString(){
        String strDtInicio = "Erro na Data";
        String strDtFim = "Erro na Data";
        try {
            strDtInicio = FuncoesUteis.dateToStr(dtInicio);
            strDtFim = FuncoesUteis.dateToStr(dtFim);
        } catch (ParseException ex) {
            Logger.getLogger(Acao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String strInstituicoes = "";
        for (Instituicao instituicao : instituicoes) {
            strInstituicoes += instituicao.getNome() + "\n";
        }
        
        String strExecutores = "";
        for (Executor executor : executores) {
            strExecutores += executor.getNome() + "\n";
        }
        
        String strParticipantes = "";
        for (Participante participante : participantes) {
            strParticipantes = participante.getNome() + "\n";
        }
        
        return "Ação: " + nome + "\n" +
               "Inicio: " + strDtInicio + " Fim: " + strDtFim + "\n" +
               "Carga Horária: " + cargaHoraria + "\n" +
               "Local: " + local.toString() + "\n" +
               "Descricao" + descricao + "\n" +
               "Instituições: \n" + strInstituicoes + "\n" +
               "Executores: \n" + strExecutores + "\n" +
               "Participantes: \n" + strParticipantes + "\n";
    }
}
