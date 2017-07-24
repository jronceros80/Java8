package ejercicios;

//
public class Sintaxis {

	public double probarSintaxis(){
		//se puede referenciar a los parametros sin el tipo de dato(Java lo hace implicitamente)
		//Operacion op = (ob1,ob2)->(ob1+ob2)/2;
		
		//Se puede tambien no colocar el parametro, si la definicion del metodo(sin parametros) en la interfaz lo permite
		//Operacion op = ()->2;
		
		//sin parametros y en bloque
		/*Operacion op = ()->{
			int x;
			int y;
			return x+y;
		};
		return op.calcular();  */
		
		Operacion op = (double ob1, double ob2)->(ob1+ob2)/2;
		return op.calcular(3, 2);
	}
	
	public static void main(String[] args) {
		Sintaxis s = new Sintaxis();
		System.out.println(s.probarSintaxis());
	}

}
