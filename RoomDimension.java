import java.util.*;

public class RoomDimension {
   
   double width;
   double length;
   
   public RoomDimension(double width, double length) {
      this.width = width;
      this.length = length;
   }
   
   public double getWidth() {
      return width;
   }
   
   public double getLength() {
      return length;
   }
   
   public double getArea() {
      return width * length;
      
   }
   
   public String toString() {
      return "The room dimensions are:\nWidth: " + width + "\nLength: " + length + "\nArea: " + getArea();
   }
}
