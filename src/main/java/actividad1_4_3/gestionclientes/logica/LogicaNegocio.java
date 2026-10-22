/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1_4_3.gestionclientes.logica;

import actividad1_4_3.gestionclientes.dto.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author centr
 */
public class LogicaNegocio {
    private static List<Cliente>listaClientes= new ArrayList<>();
    
    public static void añadirCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    
}
