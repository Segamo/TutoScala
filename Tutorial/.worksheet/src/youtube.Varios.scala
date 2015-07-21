package youtube

object Varios {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); val res$0 = 
   //Binario a Decimal
  Integer.parseInt("101101101", 2);System.out.println("""res0: Int = """ + $show(res$0));$skip(43); val res$1 = 

	//Valores entre comillas
  "Hola' Coso'";System.out.println("""res1: String("Hola\' Coso\'") = """ + $show(res$1));$skip(20); 
  println("\u2230");$skip(32); val res$2 = 
  """ Hola puto \n \n "Asd" """;System.out.println("""res2: String(" Hola puto \\n \\n \"Asd\" ") = """ + $show(res$2));$skip(34); 
	
	//Tuplas
	val t = ("hola", 20);System.out.println("""t  : (String, Int) = """ + $show(t ));$skip(24); 
	val (saludo, edad) = t;System.out.println("""saludo  : String = """ + $show(saludo ));System.out.println("""edad  : Int = """ + $show(edad ));$skip(65); 

	//Asignacion multiples variables
  val (edad1, edad2)= (23,3);System.out.println("""edad1  : Int = """ + $show(edad1 ));System.out.println("""edad2  : Int = """ + $show(edad2 ));$skip(65); 
  var response =
  if(edad >= 21) "Welcome!" else "Get out Kid!";System.out.println("""response  : String = """ + $show(response ));$skip(48); 
 
 	// Or And
 	var testBool = 2 < 2 || (3 < 4);System.out.println("""testBool  : Boolean = """ + $show(testBool ))}
}
