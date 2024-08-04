/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package control;

import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.*;
import window.*;

/**
 *
 * @author gabriel
 */

public class GerenciadorInterGrafica {
    private TelaPrincipal tela_principal = null;
    private CadastroPessoa cad_executor = null;
    private CadastroPessoa cad_participante = null;
    private CadastroInstituicao cad_instituicao = null;
    private CadastroLocal cad_local = null;
    private CadastroAcao cad_acao = null;
    
    private BuscaGenerica busca_participante = null;
    private BuscaGenerica busca_instituicao = null;
    private BuscaGenerica busca_local = null;
    private BuscaGenerica busca_executor = null;
    private BuscaGenerica busca_acao = null;
    
    private Subject<List<Acao>> subject_acoes = new Subject();
    
    private GerenciadorDominio gerDom;
    
    private static GerenciadorInterGrafica myInstance = new GerenciadorInterGrafica();

    private GerenciadorInterGrafica() {
        gerDom = new GerenciadorDominio();
    }

    public GerenciadorDominio getGerenciadorDeDominio() {
        return gerDom;
    }

    public static GerenciadorInterGrafica getInstance() {
        return myInstance;
    }
    
    public void abrirJanelaPrincipal() {
        if ( tela_principal == null ) {
            tela_principal = new TelaPrincipal();
        }
        tela_principal.setVisible(true);
    }
    
    private JDialog abrirCad(java.awt.Frame parent, CadJDialog dlg, Class classe, Object object) {
        if (dlg == null){     
            try {
                dlg = (CadJDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent,true);   
                if (object != null){
                    dlg.setObjectToBeEdited(object);
                }
                dlg.setVisible(true);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() + ". " + ex.getMessage() );
            } 
        }       
        else {
            if (object != null){
                dlg.setObjectToBeEdited(object);
            }
            dlg.setVisible(true);
        } 
        
        return dlg;
    }
    
    private BuscaGenerica abrirBusca(java.awt.Frame parent, BuscaGenerica dlg, Class classe, BuscaGenerica.Modo modo) {
        if (dlg == null){     
            try {
                dlg = new BuscaGenerica(parent, true, classe);
                dlg.setModo(modo);
                dlg.setVisible(true);
            } catch (SecurityException | IllegalArgumentException  ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela de busca. " + ex.getMessage() );
            } 
        }       
        else {
            dlg.setModo(modo);
            dlg.setVisible(true);
        } 
        
        return dlg;
    }
    
    public void abrirCadExecutor(Object object) {
        if (cad_executor == null) {
            cad_executor = new CadastroPessoa(tela_principal, true, CadastroPessoa.TipoPessoa.EXECUTOR);
        }
        cad_executor = (CadastroPessoa) abrirCad(tela_principal, cad_executor, CadastroPessoa.class, object);
    }
    
    public void abrirCadParticipante(Object object) {
        if (cad_participante == null) {
            cad_participante = new CadastroPessoa(tela_principal, true, CadastroPessoa.TipoPessoa.PARTICIPANTE);
        }
        cad_participante = (CadastroPessoa) abrirCad(tela_principal, cad_participante, CadastroPessoa.class, object);
    }
    
    public void abrirCadInstituicao(Object object){
        cad_instituicao = (CadastroInstituicao) abrirCad(tela_principal, cad_instituicao, CadastroInstituicao.class, object);
    }
    
    public void abrirCadLocal(Object object){
        cad_local = (CadastroLocal) abrirCad(tela_principal, cad_local, CadastroLocal.class, object);
    }
    
    public void abrirCadAcao(Object object){
        cad_acao = (CadastroAcao) abrirCad(tela_principal, cad_acao, CadastroAcao.class, object);
    }
    
    public void abrirCad(Object object, Class classe){
        if (classe == Executor.class){
            abrirCadExecutor(object);
        } else if (classe == Participante.class) {
            abrirCadParticipante(object);
        } else if (classe == Instituicao.class) {
            abrirCadInstituicao(object);
        } else if (classe == Local.class){
            abrirCadLocal(object);
        } else if (classe == Acao.class){
            abrirCadAcao(object);
        }
    }
    
    public Object abrirBusca(Class classe){
        if (classe == Executor.class){
            return abrirBuscaExecutor(BuscaGenerica.Modo.SELECAO);
        } else if (classe == Participante.class) {
            return abrirBuscaParticipante(BuscaGenerica.Modo.SELECAO);
        } else if (classe == Instituicao.class) {
            return abrirBuscaInstituicao(BuscaGenerica.Modo.SELECAO);
        } else if (classe == Local.class){
            return abrirBuscaLocal(BuscaGenerica.Modo.SELECAO);
        } else if (classe == Acao.class){
            return abrirBuscaAcao(BuscaGenerica.Modo.SELECAO);
        }
        return null;
    }
    
    public Object abrirBuscaParticipante(BuscaGenerica.Modo modo){
        busca_participante = abrirBusca(tela_principal, busca_participante, Participante.class, modo);
        return busca_participante.getObjetoSelecionado();
    }
    
    public Object abrirBuscaExecutor(BuscaGenerica.Modo modo){
        busca_executor = abrirBusca(tela_principal, busca_executor, Executor.class, modo);
        return busca_executor.getObjetoSelecionado();
    }
    
    public Object abrirBuscaInstituicao(BuscaGenerica.Modo modo) {
        busca_instituicao = abrirBusca(tela_principal, busca_instituicao, Instituicao.class, modo);
        return busca_instituicao.getObjetoSelecionado();
    }
    
    public Object abrirBuscaLocal(BuscaGenerica.Modo modo) {
        busca_local = abrirBusca(tela_principal, busca_local, Local.class, modo);
        return busca_local.getObjetoSelecionado();
    }
    
    public Object abrirBuscaAcao(BuscaGenerica.Modo modo) {
        busca_acao = abrirBusca(tela_principal, busca_acao, Acao.class, modo);
        return busca_acao.getObjetoSelecionado();
    }
    
    public static void main(String[] args) {
       GerenciadorInterGrafica.getInstance().abrirJanelaPrincipal();
    }

    public Subject<List<Acao>> getSubjectAcoes() {
        return subject_acoes;
    }
    
}
