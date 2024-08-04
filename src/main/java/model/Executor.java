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

/**
 *
 * @author gabriel
 */
@Entity
public class Executor extends Pessoa{
    
    public static enum Tipo{
        DISCENTE_VOLUNTARIO,
        DISCENTE_BOLSISTA,
        SERVIDOR,
        COLABORADOR_EXTERNO
    }
    
    @ColumnJTable(name = "Tipo", position = 3)
    private Tipo tipo;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable (name="AcaoExecutor", 
            joinColumns = {@JoinColumn(name = "idPessoa")}, 
            inverseJoinColumns = {@JoinColumn(name = "idAcao")})
    private List<Acao> acoes = new ArrayList();

    public Executor() {
    }

    public Executor(int id, String nome, String cpf, String email, Tipo tipo) {
        super(id, nome, cpf, email);
        this.tipo = tipo;
    }
    
    public Executor(String nome, String cpf, String email, Tipo tipo) {
        super(nome, cpf, email);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
