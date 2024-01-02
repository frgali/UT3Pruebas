package ut3;

public class Alumno {
    private String nombre;
    private double nota;
    
    public Alumno (String nom, double d) {
    	this.setNombre(nom);
    	this.setNota(d);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
}
