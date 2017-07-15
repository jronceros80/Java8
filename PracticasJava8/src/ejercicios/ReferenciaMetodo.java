package ejercicios;

import java.util.ArrayList;
import java.util.List;


/**
 * Una referencia m�todo se describe el uso :: s�mbolo (dos puntos dobles). 
 * Una referencia m�todo puede ser utilizado para se�alar los siguientes tipos de m�todos -

 * Los m�todos est�ticos
 * Los m�todos de instancia
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
