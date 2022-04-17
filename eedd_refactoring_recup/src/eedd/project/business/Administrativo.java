package eedd.project.business;

/**
 * 
 * @author lucia
 *
 */
public class Administrativo extends Persona {

	private String categoria;
	
	public Administrativo () {
		super();
	}
/**
 * 
 * @param categoria del administrativo
 */
	public Administrativo(String categoria) {
		super();
		this.categoria = categoria;
	}

/**
 * 
 * @return devuelve la categoria del Administrativo
 */
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
/**
 * 
 * @return devuelve el salario del administrativo, 1500 si la categoria es igual a A sino devuelve 1200
 */
	
	public float getSalario() {
		float result = 0;
		if (this.categoria.equals("A"))
			result = 1500;
		else 
			result = 1200;
			
		return result;
	}
	
}
