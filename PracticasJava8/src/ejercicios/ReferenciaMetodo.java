package ejercicios;

import java.util.ArrayList;
import java.util.List;


/**
 * Una referencia método se describe el uso :: símbolo (dos puntos dobles). 
 * Una referencia método puede ser utilizado para señalar los siguientes tipos de métodos -

 * Los métodos estáticos
 * Los métodos de instancia
 * Constructores que utilizan nuevo operador (TreeSet :: nuevo)

 * @author jorgeeugenio
 *
 */
public class ReferenciaMetodo {
	
	 public static void main(String args[]){
	      List names = new ArrayList();
			
	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");
			
	      names.forEach(System.out::println);
	   }

}
