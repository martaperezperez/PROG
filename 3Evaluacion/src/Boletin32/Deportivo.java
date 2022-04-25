
package Boletin32;


public class Deportivo extends Barco{
  float potenia;
  
  public Deportivo(String matricula, float eslora, float potencia){
      super(matricula,eslora);
      this.potenia =potencia;
  }
  public float calcularPrecio(int dias){
      return ((2*this.potenia)*dias);
  }
          
}
