/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.AcaoDAO;
import dao.ConexaoHibernate;
import dao.GenericDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.*;
import org.hibernate.HibernateException;

/**
 *
 * @author gabriel
 */
public class GerenciadorDominio {

    private GenericDAO genDao = new GenericDAO();
    private AcaoDAO acaoDao = new AcaoDAO();
    
    public GerenciadorDominio() {
       ConexaoHibernate.getSessionFactory().openSession(); 
    }
    
    public void excluir(Object object) throws HibernateException{
        genDao.excluir(object);
    }
    
    public List listar(Class classe) throws ClassNotFoundException, SQLException {
        return genDao.listar(classe );
    }
    
    public List listarAcoes(){
        return genDao.listar(Acao.class);
    }
    
    public List pesquisarPorString(Class classe, String nome_coluna, String pesquisa){
        return genDao.pesquisar(pesquisa, nome_coluna, classe);
    }
    
    public List pesquisarPorInt(Class classe, String nome_coluna, int pesquisa){
        return genDao.pesquisar(pesquisa, nome_coluna, classe);
    }
    
    public List pesquisarPorForeignKey(Class classe, String nome_coluna, int foreign_key_id){
        return genDao.pesquisarForeignKey(foreign_key_id, nome_coluna, classe);
    }
    
    public List pesquisarPorData(Class classe, String nome_coluna, Date date){
        return genDao.pesquisar(date, nome_coluna, classe);
    }
       
    public void inserirLocal(String cidade, String logradouro, int numero, String complemento, String bairro, String cep){
        Local obj = new Local(cidade, logradouro, numero, complemento, bairro, cep);
        genDao.inserir(obj);
    }
    
    public void inserirInstituicao(String nome, Local local, Instituicao.Tipo tipo){
        Instituicao obj = new Instituicao(nome, local, tipo);
        genDao.inserir(obj);
    }
    
    public void inserirExecutor(String nome, String cpf, String email, Executor.Tipo tipo){
        Executor obj = new Executor(nome, cpf, email, tipo);
        genDao.inserir(obj);
    }
    
    public void inserirParticipante(String nome, String cpf, String email, Instituicao instituicao){
        Participante obj = new Participante(nome, cpf, email, instituicao);
        genDao.inserir(obj);
    }
    
    public void inserirAcao(Date dtInicio, Date dtFim, int cargaHoraria, String nome, String descricao, Acao.Tipo tipo, Local local, List<Instituicao> instituicoes, List<Participante> participantes, List<Executor> executores){
        Acao obj = new Acao(dtInicio, dtFim, cargaHoraria, nome, descricao, tipo, local, instituicoes, participantes, executores);
        genDao.inserir(obj);
    }
    
    public void alterarLocal(int idLocal, String cidade, String logradouro, int numero, String complemento, String bairro, String cep){
        Local obj = new Local(idLocal, cidade, logradouro, numero, complemento, bairro, cep);
        genDao.alterar(obj);
    }
    
    public void alterarInstituicao(int idInstituicao, String nome, Local local, Instituicao.Tipo tipo){
        Instituicao obj = new Instituicao(idInstituicao, nome, local, tipo);
        genDao.alterar(obj);
    }
    
    public void alterarExecutor(int idExecutor, String nome, String cpf, String email, Executor.Tipo tipo){
        Executor obj = new Executor(idExecutor, nome, cpf, email, tipo);
        genDao.alterar(obj);
    }
    
    public void alterarParticipante(int idParticipante, String nome, String cpf, String email, Instituicao instituicao){
        Participante obj = new Participante(idParticipante, nome, cpf, email, instituicao);
        genDao.alterar(obj);
    }
    
    public void alterarAcao(int idAcao, Date dtInicio, Date dtFim, int cargaHoraria, String nome, String descricao, Acao.Tipo tipo, Local local, List<Instituicao> instituicoes, List<Participante> participantes, List<Executor> executores){
        Acao obj = new Acao(idAcao, dtInicio, dtFim, cargaHoraria, nome, descricao, tipo, local, instituicoes, participantes, executores);
        genDao.alterar(obj);
    }
    
    public void carregarAcao(Acao acao){
        acaoDao.carregarAcao(acao);
    }
}
