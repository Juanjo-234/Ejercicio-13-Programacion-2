class cancion{

String titulo;
String artista; 
double duracionSegundos;
float segundoActual;
String estado;
int volumen;

public cancion(String titulo, String artista, double duracionSegundos, float segundoActual, int estado){

this.titulo = titulo;
this.artista = artista;
this.duracionSegundos = duracionSegundos;
this.segundoActual = 0;
this.estado = "Detenida";
this.volumen = 50;
}
    
void estado(int estado){
if(estado == 1){
    System.out.println("================================");
    System.out.println("Reproduciendo");
}else{
    if(estado == 0){
    System.out.println("Pausado");
}
}
}

void segundos( double incremento){
    this.segundoActual += incremento;

}

void cambiarVolumen(int nuevoVolumen) {

 if (nuevoVolumen < 0) {
     this.volumen = 0;
 } else if (nuevoVolumen > 100) {
            this.volumen = 100;
 } else {
      this.volumen = nuevoVolumen;
 }
     System.out.println("Volumen ajustado a: " + this.volumen + "%");
    }


void mostrarInformacion(){
System.out.println("==================================");
System.out.println("Titulo de la cancion: " + titulo);
System.out.println("Artista: " + artista);
System.out.println("Duración: " + duracionSegundos);
System.out.println("Segundo actual: " + segundoActual);
System.out.println("==================================");

}
public static void main(String[] args) {

    cancion c1 = new cancion("Smooth Criminal", "Michael Jackson", 418, 0, 0 );

c1.estado(1);
c1.segundos(100);
c1.mostrarInformacion();
c1.estado(0);
c1.cambiarVolumen(75);
c1.estado(1);
c1.segundos(318);
c1.mostrarInformacion();

}

}