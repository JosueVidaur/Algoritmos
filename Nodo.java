import java.util.Scanner;

public class Nodo{
  private String elemento;
  public Nodo sig;

  public Nodo(){}

  public Nodo(String elemento){
    this.elemento=elemento;
    sig=null;
  }

  public String getElemento(){
    return elemento;
  }


public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Cola lista=new Cola();
      boolean seguir=true;
      int opcion;
      while(seguir==true){
        System.out.println("1. Mostrar lista");
        System.out.println("2. Ingresar elemento");
        System.out.println("3. Eliminar elemento");
        System.out.println("4. Salir");
        System.out.println("Elija una opcion");
        opcion =scan.nextInt();
        if(opcion==1){
          lista.mostrarLista();
        }
        if(opcion==2){
          System.out.println("Ingrese el elemento para la lista");
          lista.insertar(scan.next());
          System.out.println("Dato ingresado con exito");
        }
        if(opcion==3){
          lista.eliminar();
          System.out.println("Dato eliminado exitosamente");
        }
        if(opcion==4){
          System.out.println("Adios");
          seguir=false;
        }
    }
}
}
