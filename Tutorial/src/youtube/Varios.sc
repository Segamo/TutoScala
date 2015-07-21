package youtube

object Varios {
   //Binario a Decimal
  Integer.parseInt("101101101", 2)                //> res0: Int = 365

	//Valores entre comillas
  "Hola' Coso'"                                   //> res1: String("Hola\' Coso\'") = Hola' Coso'
  println("\u2230")                               //> ?
  """ Hola puto \n \n "Asd" """                   //> res2: String(" Hola puto \\n \\n \"Asd\" ") = " Hola puto \n \n "Asd" "
	
	//Tuplas
	val t = ("hola", 23)                      //> t  : (String, Int) = (hola,23)
	val (saludo, edad) = t                    //> saludo  : String = hola
                                                  //| edad  : Int = 23

	//Asignacion multiples variables
  val (edad1, edad2)= (23,3)                      //> edad1  : Int = 23
                                                  //| edad2  : Int = 3
  var response =
  if(edad >= 21) "Welcome!" else "Get out Kid!"   //> response  : String = Welcome!
  
}