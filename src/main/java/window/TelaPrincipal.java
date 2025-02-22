/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package window;

import control.AcaoTableModelObserver;
import control.GerenciadorInterGrafica;
import java.util.Date;

/**
 *
 * @author gabriel
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        iniciarTables();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAndamento = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePrevistas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableFinalizadas = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCadAcao = new javax.swing.JMenuItem();
        menuCadExecutor = new javax.swing.JMenuItem();
        menuCadParticipante = new javax.swing.JMenuItem();
        menuCadInstituicao = new javax.swing.JMenuItem();
        menuCadLocal = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuBuscaParticipante = new javax.swing.JMenuItem();
        menuBuscaExecutor = new javax.swing.JMenuItem();
        menuBuscaAcao = new javax.swing.JMenuItem();
        menuBuscaInstituicao = new javax.swing.JMenuItem();
        menuBuscaLocal = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tableAndamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableAndamento);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );

        jLabel1.setText("Ações previstas");

        jLabel2.setText("Ações em andamento");

        jLabel3.setText("Ações finalizadas");

        tablePrevistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablePrevistas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );

        tableFinalizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableFinalizadas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenu1.setText("Cadastro");

        menuCadAcao.setText("Ação");
        menuCadAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadAcaoActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadAcao);

        menuCadExecutor.setText("Executor");
        menuCadExecutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadExecutorActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadExecutor);

        menuCadParticipante.setText("Participante");
        menuCadParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadParticipanteActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadParticipante);

        menuCadInstituicao.setText("Instituição");
        menuCadInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadInstituicaoActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadInstituicao);

        menuCadLocal.setText("Local");
        menuCadLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadLocalActionPerformed(evt);
            }
        });
        jMenu1.add(menuCadLocal);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Busca");

        menuBuscaParticipante.setText("Participante");
        menuBuscaParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscaParticipanteActionPerformed(evt);
            }
        });
        jMenu2.add(menuBuscaParticipante);

        menuBuscaExecutor.setText("Executor");
        menuBuscaExecutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscaExecutorActionPerformed(evt);
            }
        });
        jMenu2.add(menuBuscaExecutor);

        menuBuscaAcao.setText("Ação");
        menuBuscaAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscaAcaoActionPerformed(evt);
            }
        });
        jMenu2.add(menuBuscaAcao);

        menuBuscaInstituicao.setText("Instituição");
        menuBuscaInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscaInstituicaoActionPerformed(evt);
            }
        });
        jMenu2.add(menuBuscaInstituicao);

        menuBuscaLocal.setText("Local");
        menuBuscaLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscaLocalActionPerformed(evt);
            }
        });
        jMenu2.add(menuBuscaLocal);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadAcaoActionPerformed
        GerenciadorInterGrafica.getInstance().abrirCadAcao(null);
    }//GEN-LAST:event_menuCadAcaoActionPerformed

    private void menuCadParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadParticipanteActionPerformed
        GerenciadorInterGrafica.getInstance().abrirCadParticipante(null);
    }//GEN-LAST:event_menuCadParticipanteActionPerformed

    private void menuCadExecutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadExecutorActionPerformed
        GerenciadorInterGrafica.getInstance().abrirCadExecutor(null);
    }//GEN-LAST:event_menuCadExecutorActionPerformed

    private void menuCadLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadLocalActionPerformed
        GerenciadorInterGrafica.getInstance().abrirCadLocal(null);
    }//GEN-LAST:event_menuCadLocalActionPerformed

    private void menuCadInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadInstituicaoActionPerformed
        GerenciadorInterGrafica.getInstance().abrirCadInstituicao(null);
    }//GEN-LAST:event_menuCadInstituicaoActionPerformed

    private void menuBuscaParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscaParticipanteActionPerformed
        GerenciadorInterGrafica.getInstance().abrirBuscaParticipante(BuscaGenerica.Modo.EDICAO);
    }//GEN-LAST:event_menuBuscaParticipanteActionPerformed

    private void menuBuscaExecutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscaExecutorActionPerformed
        GerenciadorInterGrafica.getInstance().abrirBuscaExecutor(BuscaGenerica.Modo.EDICAO);
    }//GEN-LAST:event_menuBuscaExecutorActionPerformed

    private void menuBuscaAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscaAcaoActionPerformed
        GerenciadorInterGrafica.getInstance().abrirBuscaAcao(BuscaGenerica.Modo.EDICAO);
        
    }//GEN-LAST:event_menuBuscaAcaoActionPerformed

    private void menuBuscaInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscaInstituicaoActionPerformed
        GerenciadorInterGrafica.getInstance().abrirBuscaInstituicao(BuscaGenerica.Modo.EDICAO);
        
    }//GEN-LAST:event_menuBuscaInstituicaoActionPerformed

    private void menuBuscaLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscaLocalActionPerformed
        GerenciadorInterGrafica.getInstance().abrirBuscaLocal(BuscaGenerica.Modo.EDICAO);
    }//GEN-LAST:event_menuBuscaLocalActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void iniciarTables(){
       
        AcaoTableModelObserver modelAndamento = new AcaoTableModelObserver(((dtInicio, dtFim) -> {
            Date now = new Date();
            if (now.before(dtFim) && now.after(dtInicio)){
                return 1;
            } else if (now.equals(dtInicio) || now.equals(dtFim)){
                return 1;
            } else {
                return 0;
            }
        }));
        
        tableAndamento.setModel(modelAndamento);
        GerenciadorInterGrafica.getInstance().getSubjectAcoes().attach(modelAndamento);
        
        AcaoTableModelObserver modelFinalizadas = new AcaoTableModelObserver(((dtInicio, dtFim) -> {
            Date now = new Date();
            if (now.after(dtFim)){
                return 1;
            } else {
                return 0;
            }
        }));
        
        tableFinalizadas.setModel(modelFinalizadas);
        GerenciadorInterGrafica.getInstance().getSubjectAcoes().attach(modelFinalizadas);
        
        AcaoTableModelObserver modelPrevistas = new AcaoTableModelObserver(((dtInicio, dtFim) -> {
            Date now = new Date();
            if (now.before(dtInicio)){
                return 1;
            } else {
                return 0;
            }
        }));
        
        tablePrevistas.setModel(modelPrevistas);
        GerenciadorInterGrafica.getInstance().getSubjectAcoes().attach(modelPrevistas);
        
        GerenciadorInterGrafica.getInstance().getSubjectAcoes().setState(
        GerenciadorInterGrafica.getInstance().getGerenciadorDeDominio().listarAcoes());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem menuBuscaAcao;
    private javax.swing.JMenuItem menuBuscaExecutor;
    private javax.swing.JMenuItem menuBuscaInstituicao;
    private javax.swing.JMenuItem menuBuscaLocal;
    private javax.swing.JMenuItem menuBuscaParticipante;
    private javax.swing.JMenuItem menuCadAcao;
    private javax.swing.JMenuItem menuCadExecutor;
    private javax.swing.JMenuItem menuCadInstituicao;
    private javax.swing.JMenuItem menuCadLocal;
    private javax.swing.JMenuItem menuCadParticipante;
    private javax.swing.JTable tableAndamento;
    private javax.swing.JTable tableFinalizadas;
    private javax.swing.JTable tablePrevistas;
    // End of variables declaration//GEN-END:variables
}
