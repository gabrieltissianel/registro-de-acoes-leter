/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author gabriel
 */
@MappedSuperclass
@Inheritance ( strategy = InheritanceType.TABLE_PER_CLASS )
public abstract class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
    private int id;
    
    @ColumnJTable(name = "Nome", position = 0)
    @Column(length = 40)
    private String nome;
    
    @ColumnJTable(name = "CPF", position = 1)
    @Column(length = 10, unique = true)
    private String cpf;
    
    @ColumnJTable(name = "Email", position = 2)
    @Column(length = 40)
    private String email;
    
    public Pessoa(){
    }

    public Pessoa(int id, String nome, String cpf, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    
    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + ", email=" + email + '}';
    }
    
}
