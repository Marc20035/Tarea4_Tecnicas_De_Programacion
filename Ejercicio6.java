/*Algo Trampa  
Variable numIntento : entero <- 1  
Variable valorIntroducido : texto  
Constante MAX_INTENTOS : entero <- 5  
Inicio  
   valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")  
   MientrasQue valorIntroducido ≠ "París" o MAX_INTENTOS - numIntentos ≠ 0 
         escribir("Respuesta incorrecta")  
         escribir("Solo quedan " & MAX_INTENTOS - numIntentos &  
" intento(s)")  
         valorIntroducido <- introducir("¿Cuál es la capital de Francia? ") 
   FMq  
   Si MAX_INTENTOS - numIntento ≠ 0 Entonces  
         escribir("Bravo")  
   Si no  
         escribir("Revise sus conocimientos en geografía")  
   FSi  
Fin 
¿Qué hace?*/

/*La solucion es:   
Variable numIntento : entero <- 1  
Variable valorIntroducido : texto  
Constante MAX_INTENTOS : entero <- 5  
Inicio  
   valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")  
   MientrasQue valorIntroducido ≠ "París" o MAX_INTENTOS - numIntentos ≠ 0 

      escribir("Respuesta incorrecta")
      numIntentos <- numIntentos + 1  
      escribir("Solo quedan " & MAX_INTENTOS - &numIntentos  " intento(s)")

      Fmq
      si valorIntroducido = "París" Entonces
            escribir("Bravo")
      si no 
            escribir("Revise sus conocimientos en geografía")   
Fin 
Este programa loq ue hace es preguntarte cual es la capital de Francia y tienes 5 intentos para acertar si la 
capital introducida por usuario es distinta de paris volvera a preguntar hasta que tus intentos sean = 0 o introduzcas
por teclado Paris
Si has agotado tus intentos escribira "Revise sus conocimientos en geografia"*/
