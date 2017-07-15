package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {
	
	public void ordenar(){
		
		List<String> lista = new ArrayList<String>();
		lista.add("mitocode");
		lista.add("code");
		lista.add("mito");
		
		//JDK 1.7 (uso imperativo)
		/*Collections.sort(lista, new Comparator<String>(){

			@Override
			public int compare(String obj1, String obj2) {
				return obj1.compareTo(obj2);
			}
		});*/
		
		//Lambda
		Collections.sort(lista, (String obj1, String obj2) -> obj1.compareTo(obj2));
		
		for(String elemento: lista){
			System.out.println(elemento);
		}
		
	}
	
	public void calcular(){
		//JDK 1.7 uso imperativo
		/*Operacion operacion = new Operacion(){

			@Override
			public double calcularPromedio(double n1, double n2) {
				return (n1+n2)/2;
			}
		};*/
		
		
		//Lambda
		Operacion operacion = (double obj1, double obj2)->(obj1+obj2)/2;
		System.out.println(operacion.calcular(3, 4));
	}
	
	public static void main(String[] args) {
		LambdaApp app = new LambdaApp();
		app.ordenar();
		app.calcular();
	}

}
