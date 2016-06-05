public class Nodo{
  private String elemento;
  public Nodo sig;
  Nodo(String elemento){
    this.elemento=elemento;
    sig=null;
  }

  public String getElemento(){
    return elemento;
  }
}
