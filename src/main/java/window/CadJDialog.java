/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package window;

import java.awt.Frame;

/**
 *
 * @author gabriel
 * @param <T>
 */
public abstract class CadJDialog<T extends Object> extends javax.swing.JDialog{
    
    protected T objectToBeEdited = null;

    public CadJDialog(Frame owner, boolean modal) {
        super(owner, modal);
    }
    
    public void setObjectToBeEdited(T object){
        this.objectToBeEdited = object;
    }
    
    @Override
    public void setVisible(boolean b) {
        if (b) {
            if (objectToBeEdited != null){
                preencherDados();
            }
        } else {
            limparDados();
            objectToBeEdited = null;
        }
        super.setVisible(b);
    }
    
    
    protected abstract void preencherDados();
    protected abstract void limparDados();
}
