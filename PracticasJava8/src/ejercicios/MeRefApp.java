package ejercicios;

public class MeRefApp {

	public static void referenciarMetodoStatic(){
		System.out.println("Metodo referencia static");
	}
	
	public static void referenciarMetodoInstanciaObjetoArbitrario(){
		
	}

	public static void referenciarMetodoInstanciaObjetoParticular(){
		
	}

	public static void referenciarConstructor(){
		
	}
	
	public void operar(){
		Operacion2 op = ()-> MeRefApp.referenciarMetodoStatic();
		op.saludar();
	}
	
	public static void main(String[] args) {
		MeRefApp app = new MeRefApp();
		app.operar();
	}

}
