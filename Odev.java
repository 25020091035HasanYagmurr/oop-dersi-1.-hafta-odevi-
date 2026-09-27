
package odev;

public class Odev {

    public static void main(String[] args) {
       Rectangle dikdortgen1 = new Rectangle(4,40);
       Rectangle dikdortgen2 = new Rectangle(30.5,35.9);
       
       System.out.println("--- 1. dikdortgen ---");
       System.out.println("genislik: " + dikdortgen1.width);
       System.out.println("yukseklik: " + dikdortgen1.height);
       System.out.println("alan: "  + dikdortgen1.getArea());
       System.out.println("cevre: " + dikdortgen1.getPerimeter());

       System.out.println("\n--- 2. dikdortgen ---");
       System.out.println("genislik: " + dikdortgen2.width);
       System.out.println("yukseklik: " + dikdortgen2.height);
       System.out.println("alan: " + dikdortgen2.getArea());
       System.out.println("cevre: " + dikdortgen2.getPerimeter());
    }
}
