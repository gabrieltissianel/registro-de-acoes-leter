/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author gabriel
 */

@Entity
public class Local implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    
    @ColumnJTable(name = "Cidade", position = 0)
    @Column (length = 30)
    private String cidade;
    
    @ColumnJTable(name = "Logradouro", position = 1)
    @Column (length = 40)
    private String logradouro;

    @ColumnJTable(name = "Número", position = 2)
    private int numero;
    
    @ColumnJTable(name = "Complemento", position = 3)
    @Column (length = 10)
    private String complemento;
    
    @ColumnJTable(name = "Bairro", position = 4)
    @Column (length = 20)
    private String bairro;
    
    @ColumnJTable(name = "CEP", position = 5)
    @Column (length = 10)
    private String cep;

    public Local() {
    }

    public Local(int id, String cidade, String logradouro, int numero, String complemento, String bairro, String cep) {
        this.id = id;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
    }

    public Local(String cidade, String logradouro, int numero, String complemento, String bairro, String cep) {
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return logradouro + ", " + numero + " - " + bairro + ", " + cidade;
    }
    
}
