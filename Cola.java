
public class Cola{
  private Nodo primero;
  private Nodo ultimo;

  public Cola(){
    primero=ultimo=null;
    }

  public boolean vacio(){
    if(primero == ultimo && !(primero != null){
      return true;}
    else {return false;}
    }

  public void insertar(String elemento){
    Nodo temporal=new Nodo(elemento);
    if(vacio()==true){
      primero=temporal;
      ultimo=temporal;
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
      Nodo temporal = new Nodo();
      temporal = primero;
      while(temporal != null){
      System.out.println(temporal.getElemento());
      temporal = temporal.sig;
      }

    }
}
