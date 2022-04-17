package eedd.project.main;

import java.util.Scanner;

import eedd.project.business.Administrativo;
import eedd.project.business.Profesor;
import eedd.project.business.Director;
import eedd.project.utils.Utils;
/**
 * 
 * @author lucia
 *
 */
public class MenuApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		mostrarPresentacion();
		
		String nombre = pedirNombre(sc);
		String primerApellido = pedirApellido(sc);
		
		mensajeBienvenidad(nombre, primerApellido);
		
		calcularSalarioAdministrativo(sc);
		
		calcularSalarioProfesores(sc);
		
		calcularSalarioDirector(nombre, primerApellido);
		
		sc.close();
		
	}

/**
 * 
 * @param sc devuelve el salario del profesor
 */

	private static void calcularSalarioProfesores(Scanner sc) {
		System.out.println("Introduce el número de profesores : ");
		int numProf= sc.nextInt();
		Profesor[] listaProf = new Profesor[numProf];
		for (int i=0; i<numProf; i++) {
			listaProf[i] = new Profesor();
			listaProf[i].getSalario();
			System.out.println("El salario del profesor es: " + listaProf[i].getSalario());
		}
	}
/**
 * 
 * @param sc devuelve el salio del administrativo
 */

	private static void calcularSalarioAdministrativo(Scanner sc) {
		System.out.println("Introduce el número de administrativos : ");
		int numAdmins= sc.nextInt();
		Administrativo[] listaAdmins = new Administrativo[numAdmins];
		for (int i=0; i<numAdmins; i++) {
			listaAdmins[i] = new Administrativo();
			if (i<2) listaAdmins[i].setCategoria("A");
			else listaAdmins[i].setCategoria("B");
			//listaAdmins[i].getSalario();
			System.out.println("El salario del administrativo es: " + listaAdmins[i].getSalario());
		}
	}
/**
 * 
 * @param sc solicita el primer apellido
 * @return devuelve el primer apellido
 */

	private static String pedirApellido(Scanner sc) {
		System.out.println("Introduce tu primer apellido: ");
		String primerApellido = sc.nextLine();
		return primerApellido;
	}
/**
 * 
 * @param sc solicita el nombre
 * @return devuelve el nombre 
 */
	private static String pedirNombre(Scanner sc) {
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		return nombre;
	}
/**
 * 
 * @param nombre
 * @param primerApellido
 * Crea el mensaje de bienvenidad junto con el nombre y el apellido 
 */

	private static void mensajeBienvenidad(String nombre, String primerApellido) {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*** BIENVENIDO/A " + nombre + " " + primerApellido);
		System.out.println("/*** " + Utils.fecha_actual() );
		System.out.println("/*** " + Utils.hora_actual() );
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}

	private static void mostrarPresentacion () {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/***     Y DE NUEVO...                                                       ***/");
		System.out.println("/***     VAMOS A REFACTORIZAR...HAY QUE ELIMINAR LOS MALOR OLORES YA!!       ***/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}
/**
 * 
 * @param n nombreDirector
 * @param a apellidoDirector 
 */
	private static void calcularSalarioDirector(String n, String a)
	{
		Director d = new Director();
		d.setNombre(n);
		d.setApellidos(a);
		
		System.out.println("El salario del director es: " + d.getSalario());
	}

}
