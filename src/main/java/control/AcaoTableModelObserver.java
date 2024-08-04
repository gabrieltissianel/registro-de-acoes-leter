/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import model.Acao;

/**
 *
 * @author gabriel
 */
public class AcaoTableModelObserver extends GenericTableModel implements Observer<List<Acao>> {
    
    private Comparator<Date> dates_comparator;

    public AcaoTableModelObserver(Comparator<Date> dates_comparator) {
        super(Acao.class);
        this.dates_comparator = dates_comparator;
    } 

    @Override
    public void update(List<Acao> data) {
        ArrayList<Acao> acoes_filtradas = new ArrayList();
        
        for (Acao acao : data) {
            if(dates_comparator.compare(acao.getDtInicio(), acao.getDtFim()) > 0){
                acoes_filtradas.add(acao);
            }
        }
        
        this.setList(acoes_filtradas);
    }
    
   
}
