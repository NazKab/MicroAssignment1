import java.util.*;

public class RoomDimension {
   
   double width;
   double length;
   
   public RoomDimension(double wide, double loong) {
      width = wide;
      length = loong;
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