Introducción
Bienvenido a Ficheritos, donde los archivos de texto y los objetos cobran vida (bueno, casi). Este proyecto explora la manipulación de archivos en Java, desde escribir texto, leer datos ASCII, fusionar información, hasta guardar y recuperar mesas en un archivo (.txt, porque .dat nos hizo la 13-14).
Si has llegado aquí, prepárate para un viaje lleno de FileWriter, BufferedReader y errores que nos hicieron dudar de nuestras habilidades como programadores, pero que al final fueron derrotados gloriosamente(Excepto el último, ese me debastó).

Actividades
1 Actividad 1: Crear un archivo TXT y escribir texto con estilo
- Se solicita un texto al usuario (mínimo 30 caracteres, porque no hacemos microensayos).
- Se convierte a MAYÚSCULAS y espacios se cambian por _, para que parezca escrito en piedra.
- Se guarda en ficheroActividad1.txt, con la elegancia de un FileWriter.
2 Actividad 2: Leer archivo y convertir cada letra en ASCII
- Se lee ficheroActividad1.txt carácter por carácter.
- Cada letra se convierte en su código ASCII y se almacena en ficheroActividad2.txt, porque todo es más pro con números.
- El programa elimina la última coma y espacio, porque no queremos que parezca un desastre.
3 Actividad 3: Fusionar los archivos como si fueran un superpoder
- Toma ficheroActividad1.txt y ficheroActividad2.txt y los junta en ficheroFusion.txt.
- Usa StringBuilder porque concatenar con + es muy siglo pasado.
- Incluye una firma misteriosa, porque siempre es cool dejar nuestra marca.
4 Actividad 4: Guardar y recuperar mesas en un archivo TXT
- Permite al usuario crear mesas con color y número de patas.
- Las mesas se guardan en mesas.txt en formato CSV (color,número_de_patas).
- Las mesas se pueden recuperar y mostrar en consola.
- El archivo .dat intentó sabotearnos, así que lo mandamos al inframundo y usamos .txt en su lugar(Aunque tampoco funcionó).

Cosas que aprendimos en el proceso
✅ FileWriter, BufferedWriter y PrintWriter → Nuestros fieles aliados para escribir en archivos.
✅ BufferedReader y FileReader → Nos ayudaron a leer ficheros sin que nos diera un aneurisma por rendimiento.
✅ flush() es clave → Porque sin él, el archivo simplemente decidía ignorarnos y no escribir nada.
✅ System.out.println() es el último recurso → Cuando todo falla, ponemos mensajes por todos lados hasta que encontramos el bug.

