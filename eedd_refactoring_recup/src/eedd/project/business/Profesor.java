package eedd.project.business;

/**
 * 
 * @author lucia
 *
 */
public class Profesor extends Persona {
	private String especialidad;
	
	public Profesor() {
		super();
	}

/**
 * 
 * @param especialidad del profesor 
 */
	public Profesor(String especialidad) {
		super();
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
/**
 * 
 * @return Devuelve el salario de profesor 
 */
	
	public float getSalario() {
		float result;
		
		result = 1900;
		return result;
	}

}
