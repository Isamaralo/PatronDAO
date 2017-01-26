package edu.femxa.val.dao;

import java.util.ArrayList;

public class Principal {

	/**
	 * Método que muestra por pantalla una lista de empleados.
	 * @param lista_empleados Objeto que contiene la lista de empleados que se muestra.
	 */
	public static void mostrarLista (ArrayList<EmpleadoDTO> lista_empleados)
	{
		for (EmpleadoDTO empleado : lista_empleados) 
		{
			System.out.println(empleado.getId() +"\0" +empleado.getNombre() +"\t" +empleado.getSalario() +"\t" +empleado.getDpto() );
		}
	}
	public static void main(String[] args) {
		
		EmpleadoDAO empleadoDAO = new EmpleadoDAO();
		ArrayList<EmpleadoDTO> lista_empleados = null;
		int id_depto = 50;
		
		lista_empleados = empleadoDAO.recuperarEmpleados(id_depto);
		mostrarLista(lista_empleados);
	}
}
