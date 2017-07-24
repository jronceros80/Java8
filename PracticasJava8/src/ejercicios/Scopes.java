package ejercicios;
//scopes
public class Scopes {
	
	public static double atributo1; 
	public double atributo2;
	
	public double probarLocalVariable(){
		final double n3=3;
		/*Operacion op = new Operacion(){

			@Override
			public double calcular(double n1, double n2) {
				return n1+n2+n3;
			}
		};*/
		
		//Usando Lambda
		Operacion op = (n1,n2)->{
			return n1+n2+n3;
		};
		return op.calcular(1, 1);
	}
	
	public double probarAtributosStaticVariables(){
		Operacion op = (n1,n2)->{
			atributo1=n1+n2;
			atributo2 = atributo1;
			return atributo2;
			//return atributo1;
		};
		
		return op.calcular(3, 2);
	}
	
	
	public static void main(String[] args) {
		Scopes sc = new Scopes();
		//System.out.println(sc.probarLocalVariable());
		System.out.println(sc.probarAtributosStaticVariables());

	}

}
