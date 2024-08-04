/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
/**
 *
 * @author gabriel
 */
@Entity
public class Participante extends Pessoa{

    @ColumnJTable(name = "Instituição", position = 3)
    @ManyToOne
    @JoinColumn (name = "idInstituicao")
    private Instituicao instituicao;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable (name="AcaoParticipante", 
            joinColumns = {@JoinColumn(name = "idPessoa")}, 
            inverseJoinColumns = {@JoinColumn(name = "idAcao")})
    private List<Acao> acoes = new ArrayList();

    public Participante() {
    }
    
    public Participante(int id, String nome, String cpf, String email, Instituicao instituicao) {
        super(id, nome, cpf, email);
        this.instituicao = instituicao;
    }
    
    public Participante(String nome, String cpf, String email, Instituicao instituicao) {
        super(nome, cpf, email);
        this.instituicao = instituicao;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

}
