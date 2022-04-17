package eedd.project.business;

import java.util.Date;

public class Persona {
	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected Date fechaNacimiento;
	protected int horaEntrada;
	protected int horaSalida;
	protected String horarioAsignado;
	
	public Persona() {
	super();
}
	/**
	 * Parametros de Administrativo, Director y Profesor
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param fechaNacimiento
	 */
	public Persona(String nombre, String apellidos, String dni, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	}


