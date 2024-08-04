package control;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.swing.table.AbstractTableModel;
import model.ColumnJTable;

public class GenericTableModel extends AbstractTableModel{
    private List list = new ArrayList();
    private final List<Field> columnFields = new ArrayList();
    private final List<String> persistenceColumn = new ArrayList();
    
    public GenericTableModel(Class classe) {
        Class superClass = classe;
        do {                
            for (Field field : superClass.getDeclaredFields()){
                if (field.isAnnotationPresent(ColumnJTable.class)){
                    columnFields.add(field);
                }
            }
            superClass = superClass.getSuperclass();
        } while (superClass != Object.class);
        
        columnFields.sort((m1, m2) -> {
            ColumnJTable a1 = m1.getAnnotation(ColumnJTable.class);
            ColumnJTable a2 = m2.getAnnotation(ColumnJTable.class);
            return Integer.compare(a1.position(), a2.position());
        });
        
        for (Field columnField : columnFields) {
            if (columnField.isAnnotationPresent(Column.class)){
                String name = (columnField.getAnnotation(Column.class)).name();
                if (name != null){
                    if (name.isBlank()){
                        persistenceColumn.add(columnField.getName());
                    } else {
                        persistenceColumn.add(name);
                    }
                } else {
                    persistenceColumn.add(name);
                }
            } else {
                persistenceColumn.add(columnField.getName());
            }
        }
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnFields.size();
    }

    @Override
    public String getColumnName(int column) {        
        return columnFields.get(column).getAnnotation(ColumnJTable.class).name();
    }
    
    public String getPersistenceColumnName(int column) {
        return persistenceColumn.get(column);
    }

    public Class getFieldClass(int column){
        return columnFields.get(column).getType();
    }
    
    public boolean haveFieldManyToOneAnnotation(int column){
        return columnFields.get(column).isAnnotationPresent(ManyToOne.class);
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object objeto = list.get(rowIndex);
        try {
            columnFields.get(columnIndex).setAccessible(true);
            Object obj = columnFields.get(columnIndex).get(objeto);
            columnFields.get(columnIndex).setAccessible(false);
            return obj;
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(GenericTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Object getObjectAt(int rowIndex){
        return list.get(rowIndex);
    }
    
    public void setList(List novaLista) {
        
        if ( novaLista.isEmpty()) {
            if ( !list.isEmpty() ) {
                list.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            list = novaLista;
            fireTableRowsInserted( 0, list.size() - 1);
        }       
    }
}
