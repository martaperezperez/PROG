

package Boletin32;


import java.sql.SQLOutput;
import java.util.ArrayList;

public class Boletin32 {

    public static void main(String[] args) {
        ArrayList<Barco> RentBoat=new ArrayList<>();

        for (Barco boat:RentBoat){
            System.out.println(boat.getClass()+" "+ boat.calcularPrecio(dias:5)+ "€");
        }
    }
}
