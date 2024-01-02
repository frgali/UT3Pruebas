package ut3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a1= new Alumno("Fernando",5.0);
		Alumno a2= new Alumno("Juan",6.0);
		Modulo m=new Modulo("EDES");
		m.anyadir(a1);
		m.anyadir(a2);
		System.out.println(m.mediaModulo());
	}

}
