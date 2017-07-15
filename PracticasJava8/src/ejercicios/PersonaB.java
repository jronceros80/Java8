package ejercicios;

public interface PersonaB {
	
	public void caminar();
	
	default public void hablar(){
		System.out.println("saludos desde Persona B");
	}

}
