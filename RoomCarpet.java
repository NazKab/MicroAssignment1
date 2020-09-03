import java.util.*;

public class RoomCarpet extends RoomDimension {
   
   RoomDimension size;
   double carpetCost;
  
   public RoomCarpet(RoomDimension dim, double cost) {
      super(dim.getWidth(), dim.getLength());
      size = new RoomDimension(dim.getWidth(), dim.getLength());
      carpetCost = cost;
   }
  
   public double getTotalCost() {
      return carpetCost;
   }
   
   public String toString() {
      return size + "\nThe total cost with given size is: $" + carpetCost * size.getArea(); 
   }
   
}