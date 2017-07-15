package ejercicios;

public interface PersonaA {
	
	public void caminar();
	
	default public void hablar(){
		System.out.println("saludos desde Persona A");
	}

}
