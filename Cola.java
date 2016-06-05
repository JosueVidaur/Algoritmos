
public class Cola{
  private Nodo primero;
  private Nodo ultimo;

  public Cola(){
    primero=ultimo=null;
    }

  public boolean vacio(){
    return (primero==ultimo);
    }

  public void insertar(String elemento){
    Nodo temporal=new Nodo(elemento);
    if(vacio()==true){
      primero=ultimo=temporal;
      }
    else{
      ultimo.sig=temporal;
      }
    }

   public void eliminar(){
    if(vacio()==true){
      System.out.println("La cola esta vacia, no es posible borrar elementos");
      }
    else{
      primero=primero.sig;
      }
    }

    public void mostrarLista(){
      System.out.println(primero.getElemento());
      Nodo temporal = new Nodo();
      temporal = primero;
      while(temporal != null){
      temporal = temporal.sig;
      System.out.println(temporal.getElemento());}

    }
}
