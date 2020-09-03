/*
Name: Nazar Kabylov
CptS 233: MicroAssignment #1
Date: 09/04/2020
gitRepo url: https://github.com/NazKab/MA1
*/



import java.util.*;

public class RoomClient {
   
   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
   
      double width;
      double length;
      double price;
      RoomDimension dimensions;
      RoomCarpet cost;
      
      System.out.println("This program calculates the price of a carpet.");
      
      System.out.println("Please enter the price per square unit :");
      price = scan.nextDouble();
      
      System.out.println("Please enter the width: ");
      width = scan.nextDouble();
      
      System.out.println("Please enter the length: ");
      length = scan.nextDouble();
      
      dimensions = new RoomDimension(width, length);
      cost = new RoomCarpet(dimensions, price);
      
      System.out.println(cost);
   }
   
   
}