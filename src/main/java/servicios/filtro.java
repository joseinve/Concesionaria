package servicios;

import modelo.vehiculo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class filtro {
    public static void filtrar() {
        try {


            vehiculo a = new vehiculo();
            List<vehiculo> vehiculos = new ArrayList<>();
            ArrayList<vehiculo> b = a.consultar();
            vehiculos.addAll(b);
            List<vehiculo> vehiculosFiltrados = filtrarVehiculos(vehiculos);

            for (vehiculo vehiculo : vehiculosFiltrados) {
                System.out.println(vehiculo.datos() + "\n\n");
            }
        }catch (Exception e){
            System.out.println(e);
            filtrar();
        }}

        // Implementa el método de filtrado
        public static List<vehiculo> filtrarVehiculos (List < vehiculo > vehiculos) {
            vehiculo v = new vehiculo();
            List<vehiculo> vehiculosFiltrados = new ArrayList<>();
            String[] marcas = new String[v.consultarMarca().length];
            for (int i = 0; i < v.consultarMarca().length; i++) {
                marcas[i] = (String) v.consultarMarca()[i];
            }
            // Lista de colores disponibles
            String[] colores = new String[v.consultarColor().length];
            for (int i = 0; i < v.consultarColor().length; i++) {
                colores[i] = (String) v.consultarColor()[i];
            }
            // Lista de tipos de tracción disponibles
            String[] tracciones = new String[v.consultarTraccion().length];
            for (int i = 0; i < v.consultarTraccion().length; i++) {
                tracciones[i] = (String) v.consultarTraccion()[i];
            }
            // Lista de opciones de cantidad de puertas
            String[] puertas = new String[v.consultarPuerta().length];
            for (int i = 0; i < v.consultarPuerta().length; i++) {
                puertas[i] = (String) v.consultarPuerta()[i];
            }

            // Solicita preferencias al usuario usando listas desplegables
            String marcaDeseada = (String) JOptionPane.showInputDialog(null, "Seleccione la marca deseada:", "Filtrar por marca", JOptionPane.QUESTION_MESSAGE, null, marcas, marcas[0]);
            String colorDeseado = (String) JOptionPane.showInputDialog(null, "Seleccione el color deseado:", "Filtrar por Color", JOptionPane.QUESTION_MESSAGE, null, colores, colores[0]);
            String traccionDeseada = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de tracción deseado:", "Filtrar por Tracción", JOptionPane.QUESTION_MESSAGE, null, tracciones, tracciones[0]);
            int puertasDeseadas = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Seleccione la cantidad de puertas deseada:", "Filtrar por Puertas", JOptionPane.QUESTION_MESSAGE, null, puertas, puertas[0]));
            double precioMaximo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio máximo deseado:"));

            // Filtra los vehículos según las preferencias del usuario

            for (vehiculo vehiculo : vehiculos) {
                if (vehiculo.getColor().equalsIgnoreCase(colorDeseado) &&
                        vehiculo.getTraccion().equalsIgnoreCase(traccionDeseada) &&
                        vehiculo.getPuertas() == puertasDeseadas &&
                        vehiculo.getPrecio() <= precioMaximo) {
                    vehiculosFiltrados.add(vehiculo);
                }
            }
            if (vehiculosFiltrados.size() > 0) {
                return vehiculosFiltrados;
            } else {
                System.out.println("No se encontro");
                return vehiculosFiltrados;
            }
        }

        public static void mostrarVehiculos (List < vehiculo > vehiculos) {
            StringBuilder mensaje = new StringBuilder("Vehículos filtrados:\n");
            for (vehiculo vehiculo : vehiculos) {
                mensaje.append(vehiculo.getMarca()).append(" - ").append(vehiculo.getMarca()).append("\n");
            }
            JOptionPane.showMessageDialog(null, mensaje.toString());
        }

}
