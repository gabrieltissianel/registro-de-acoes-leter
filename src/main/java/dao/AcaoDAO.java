/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Acao;
import model.Executor;
import model.Instituicao;
import model.Participante;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author gabriel
 */
public class AcaoDAO extends GenericDAO{
    
    public void carregarAcao(Acao acao) throws HibernateException {
        Session sessao = null;
        
        try {
            
            
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            // Carrega o PROXY para outro objeto
            Acao acaoTemp = sessao.get(Acao.class, acao.getId());

            List<Instituicao> listaInst = acaoTemp.getInstituicoes();
            listaInst.size();

            // Atualiza a lista no OBJETO principal (parâmetro)
            acao.setInstituicoes(listaInst);

            List<Executor> listaExec = acaoTemp.getExecutores();
            listaExec.size();

            // Atualiza a lista no OBJETO principal (parâmetro)
            acao.setExecutores(listaExec);

            List<Participante> listaPart = acaoTemp.getParticipantes();
            listaPart.size();

            // Atualiza a lista no OBJETO principal (parâmetro)
            acao.setParticipantes(listaPart);
            
            
            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
        
    }
}
