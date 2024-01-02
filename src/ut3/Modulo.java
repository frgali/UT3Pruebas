package ut3;
import java.util.ArrayList;

public class Modulo {
	private String nombreModulo;
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    
    public Modulo(String n) {
    	this.nombreModulo=n;	
    }

	public String getNombreModulo() {
		return nombreModulo;
	}

	public void setNombreModulo(String nombreModulo) {
		this.nombreModulo = nombreModulo;
	}
	
	public void anyadir(Alumno a) {
		this.alumnos.add(a);
	}
	
	public double mediaModulo() {
		double media=0;
	    for (Alumno a : alumnos) {
	        media=media+a.getNota();
	      }
	    return media/alumnos.size();
	}
    
}
