package servicios;

import modelo.conexion;
import modelo.vehiculo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class busqueda extends conexion {
    public Object[] consultarMarca() {
        List<String> valoresUnicos = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT marca  FROM public.vehiculos;";
            Statement query = getCon().createStatement();
            ResultSet resultSet = query.executeQuery(sql);
//        String[] marca resultSet;
            while (resultSet.next()) {
                String valorUnico = resultSet.getString(1);
                valoresUnicos.add(valorUnico);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return valoresUnicos.toArray();
    }

    public Object[] consultarColor() {
        List<String> valoresUnicos = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT color  FROM public.vehiculos;";
            Statement query = getCon().createStatement();
            ResultSet resultSet = query.executeQuery(sql);
//        String[] marca resultSet;
            while (resultSet.next()) {
                String valorUnico = resultSet.getString(1);
                valoresUnicos.add(valorUnico);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return valoresUnicos.toArray();
    }

    public Object[] consultarTraccion() {
        List<String> valoresUnicos = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT traccion  FROM public.vehiculos;";
            Statement query = getCon().createStatement();
            ResultSet resultSet = query.executeQuery(sql);
//        String[] marca resultSet;
            while (resultSet.next()) {
                String valorUnico = resultSet.getString(1);
                valoresUnicos.add(valorUnico);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return valoresUnicos.toArray();
    }

    public Object[] consultarPuerta() {
        List<String> valoresUnicos = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT puertas  FROM public.vehiculos;";
            Statement query = getCon().createStatement();
            ResultSet resultSet = query.executeQuery(sql);
//        String[] marca resultSet;
            while (resultSet.next()) {
                String valorUnico = resultSet.getString(1);
                valoresUnicos.add(valorUnico);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return valoresUnicos.toArray();
    }
    public ArrayList consultar() {
        ArrayList<vehiculo> vehiculos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM public.vehiculos ";
            Statement query = getCon().createStatement();
            ResultSet rs = query.executeQuery(sql);
            while (rs.next()) {
                int ruedas = rs.getInt(1);
                String color = rs.getString(2);
                int puertas = rs.getInt(3);
                String traccion = rs.getString(4);
                String marca = rs.getString(5);
                int asientos = rs.getInt(6);
                int costo = rs.getInt(7);
                vehiculo v = new vehiculo(costo, ruedas, asientos, traccion, puertas, color, marca);
                vehiculos.add(v);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vehiculos;
    }
}
