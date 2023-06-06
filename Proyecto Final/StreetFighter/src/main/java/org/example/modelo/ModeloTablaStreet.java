package org.example.modelo;
import org.example.conexion.Conexion;
import org.example.conexion.StreetDAO;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
public class ModeloTablaStreet implements TableModel {


    public static final int COLUMS = 6;
    private ArrayList<Street> datos;
    private StreetDAO ldao;

    public ModeloTablaStreet() {
        ldao = new StreetDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaStreet(ArrayList<Street> datos) {
        this.datos = datos;
        ldao = new StreetDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "Id";

            case 1:
                return "Personaje";

            case 2:
                return "Pais";
            case 3:
                return "Vestimenta";
            case 4:
                return "Tecnica";
            case 5:
                return "URL";

        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;

        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Street tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getPersonaje();
            case 2:
                return tmp.getPais();
            case 3:
                return tmp.getVestimenta();
            case 4:
                return tmp.getTecnica();
            case 5:
                return tmp.getURL();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int colIndex) {
        switch (colIndex) {
            case 0:
                //datos.get(rowIndex).setId(0);
                break;
            case 1:
                datos.get(rowIndex).setPersonaje((String) o);
                break;
            case 2:
                datos.get(rowIndex).setPais((String) o);
                break;
            case 3:
                datos.get(rowIndex).setVestimenta((String) o);
                break;
            case 4:
                datos.get(rowIndex).setTecnica((String) o);
                break;
            case 5:
                datos.get(rowIndex).setURL((String) o);
                break;
            default:
                System.out.println("No se modifica Nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargarDatos(){
        try{
            ArrayList<Street> tirar = ldao.obtenerTodo();
            System.out.println(tirar);
            datos = ldao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }
    public  boolean agregarPersonaje(Street street){
        boolean resultado = false;
        try{
            if (ldao.insertar(street)){
                datos.add(street);
                resultado= true;
            }else{
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public Street getPersonajeAtIndex(int idx){
        return  datos.get(idx);

    }

    public boolean actualizarPersonaje(Street street) {
        try {
            return ldao.update(street);
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
            return false;
        }
    }

    public boolean eliminarPersonaje (String id) {
        try {
            String sqlDelete = "DELETE FROM streetfighter WHERE id = ? ;";
            int rowCount = 0;
            PreparedStatement pstm = Conexion.getInstance("streetDB.db").getConnection().prepareStatement(sqlDelete);
            pstm.setInt(1, Integer.parseInt(id));
            rowCount = pstm.executeUpdate();

            return rowCount > 0;
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
            return false;
        }
    }
}
