
public class Cola{
  private Nodo primero;
  private Nodo ultimo;

  public Cola(){
    primero=ultimo=null;
    }

  public boolean vacio(){
    return (primero==null);
    }

  public void insertar(String elemento){
    Nodo temporal=new Nodo(elemento);
    if(vacio()==true){
      primero=temporal;
      primero.sig = ultimo;
      }
    else{
      if(ultimo != null){
        ultimo.sig = temporal;
      }
      else{
        ultimo = temporal;
      }
    
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
      if(vacio()==true){
        System.out.println("Lista vacia");
      }
      else{
      temporal = primero;
      while(temporal != null){
      System.out.println(temporal.getElemento());
      temporal = temporal.sig;
      }
      }
    }
}
