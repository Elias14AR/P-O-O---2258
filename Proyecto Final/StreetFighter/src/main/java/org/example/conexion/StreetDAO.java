package org.example.conexion;
import org.example.modelo.Street;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StreetDAO implements InterfazDAO {
    public StreetDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO streetfighter (personaje,pais,vestimenta,tecnica,URL) VALUES(?, ?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = Conexion.getInstance("streetDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((Street)obj).getPersonaje());
        pstm.setString(2, ((Street)obj).getPais());
        pstm.setString(3, ((Street)obj).getVestimenta());
        pstm.setString(4, ((Street)obj).getTecnica());
        pstm.setString(5, ((Street)obj).getURL());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE streetfighter SET personaje = ?, pais = ?, vestimenta = ?, tecnica = ?, URL = ? WHERE id = ?";
        int rowCount = 0;
        Street street = (Street) obj;
        try (PreparedStatement pstm = Conexion.getInstance("streetDB.db").getConnection().prepareStatement(sqlUpdate)) {
            pstm.setString(1, street.getPersonaje());
            pstm.setString(2, street.getPais());
            pstm.setString(3, street.getVestimenta());
            pstm.setString(4, street.getTecnica());
            pstm.setString(5, street.getURL());
            pstm.setInt(6, street.getId());
            rowCount = pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rowCount > 0;
    }


    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM streetfighter WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = Conexion.getInstance("streetDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM streetfighter";
        ArrayList<Street> restultado = new ArrayList<>();

        Statement stn = Conexion.getInstance("streetDB.db").getConnection().createStatement();
        ResultSet rst = stn.executeQuery(sql);
        while (rst.next()){
            restultado.add(new Street(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));

        }

        return  restultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM streetfighter WHERE id = ? ;";
        Street street = null;
        PreparedStatement pstm = Conexion.getInstance("streetDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if(rst.next()){
            street = new Street(rst.getInt(1), rst.getString(2), rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));

            return street;
        }
        return null;
    }


}