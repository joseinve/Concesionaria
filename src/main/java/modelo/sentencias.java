/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author josed
 */
public interface sentencias {

   ArrayList consultar() throws SQLException;
}