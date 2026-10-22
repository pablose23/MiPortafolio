import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class EstudianteTableModel extends AbstractTableModel {

    private static final String[] columnas = {"Nombre", "Apellidos", "Progreso"};

    public static final int COL_NOMBRE = 0;
    public static final int COL_APELLIDOS = 1;
    public static final int COL_PROGRESO = 2;

    private List<Estudiante> estudiante;

    public EstudianteTableModel() {
        this.estudiante = new ArrayList<>();
    }

    public EstudianteTableModel(List<Estudiante> estudiante) {
        this.estudiante = new ArrayList<>(estudiante);
    }

    @Override
    public int getRowCount() {
        return estudiante.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            case COL_NOMBRE:
                return String.class;
            case COL_APELLIDOS:
                return String.class;
            case COL_PROGRESO:
                return Double.class; 
        }
        return Object.class;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column]; 
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Estudiante e = estudiante.get(rowIndex);
        switch (columnIndex) {
            case COL_NOMBRE:
                return e.getNombre();
            case COL_APELLIDOS:
                return e.getApellidos();
            case COL_PROGRESO:
                return e.getProgreso();
        }
        return null;
    }
    
    public void addEstudiante(Estudiante e) {
        estudiante.add(e);
        fireTableRowsInserted(estudiante.size() - 1, estudiante.size() - 1);
    }

    public void clear() {
        int size = estudiante.size();
        estudiante.clear();
        if (size > 0) {
            fireTableRowsDeleted(0, size - 1);
        }
    }

    public Estudiante getEstudianteAt(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < estudiante.size()) {
            return estudiante.get(rowIndex);
        }
        return null;
    }
    
    public void setEstudiantes(List<Estudiante> estudiantes) {
        clear();
        this.estudiante = new ArrayList<>(estudiantes);
        fireTableDataChanged();
    }
}