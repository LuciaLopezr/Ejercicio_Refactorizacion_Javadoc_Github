package eedd.project.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * 
 * @author lucia
 *
 */
public class Utils {
	/**
	 * 
	 * @return devuelve la hora actual en formato largo
	 */
	public static String hora_actual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        //System.out.println("HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	/**
	 * 
	 * @return devuelve la hora en formato corto 
	 */
	public static int horaCortaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
		
		return Integer.parseInt(dtf.format(LocalDateTime.now()));
	}
	/**
	 * 
	 * @return devuelve la fecha en formato largo 
	 */
	public static String fecha_actual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //System.out.println("yyyy/MM/dd-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	/**
	 * 
	 * @param horaSalida
	 * @return devuelve las horas que quedan para la salida 
	 */
	public static int calcularHorasPendientes (int horaSalida) {
		int result = 0;
		result = horaSalida - horaCortaActual();
		return result;
	}

}
