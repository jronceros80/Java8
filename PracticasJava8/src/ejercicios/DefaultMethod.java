package ejercicios;


public class DefaultMethod implements PersonaA, PersonaB{

	public static void main(String[] args) {
		DefaultMethod app = new DefaultMethod();
		app.caminar();
		app.hablar();
	}

	@Override
	public void caminar() {
		System.out.println("Holaaaaa");
		
	}

	@Override
	public void hablar() {
		//PersonaA.super.hablar();
		//podemos sobreescribir el metodo
		System.out.println("suscribanse");
	}

}
