# Act_1 - Branch 2 (Act_2)

Actividad 2
Mini SO – Pilas y Colas (Listas Ligadas)

Ejercicio de ED: Pila (historial/undo) y Cola (procesos FIFO).
Paquete: src.so. Clases: Nodo1, ListaLigada, Pila, Cola, Comando, Proceso, SistemaOS (Main).

Cómo compilar el programa

Ubícate en la carpeta del proyecto y ejecuta:
javac -d bin -encoding UTF-8 src/so/*.java

-d bin: guarda los .class en la carpeta bin.

src/so/*.java: compila todas las clases del paquete.

Cómo ejecutar el programa

Desde la misma carpeta:
java -cp bin src.so.SistemaOS

-cp bin: usa bin como classpath.

src.so.SistemaOS: paquete + clase principal.

Cómo correr en NetBeans

Crear proyecto Java y el paquete src.so.

Agregar las clases (o pegar los .java).

Botón derecho en SistemaOS.java → Run File.

Si pide principal: Properties → Run → Main Class = src.so.SistemaOS.

Menú del programa

Ejecutar comando (Pila: push)

Deshacer (Pila: pop)

Agregar proceso (Cola: enqueue)

Ejecutar proceso (Cola: dequeue)

Ver historial (peek implícito)

Ver cola (peek implícito)

Salir

#####Extras#####

“No se encuentra la clase principal”: verifica el paquete src.so y ejecuta exactamente java -cp bin src.so.SistemaOS.

Si no aparece nada en consola: primero compila con javac ….

En NetBeans, confirma Main Class = src.so.SistemaOS.

En NetBeans, confirma Main Class = src.so.SistemaOS y que las clases usadas sean las de “Codigo_act_2”.
