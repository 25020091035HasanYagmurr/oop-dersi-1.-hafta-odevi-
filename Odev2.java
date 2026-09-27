
package odev2;


public class Odev2 {

    
    public static void main(String[] args) {
           
            Stock hisse = new Stock("ORCL" ,"Oracle Corporation");
            hisse.PreviousClosingPrice = 34.5;
            hisse.currentPrice = 34.35;
     
            System.out.println("hisse sembolu: " + hisse.symbol);
            System.out.println("hisse adi: " + hisse.name);
            System.out.println("fiyat degisim yuzdesi: " + hisse.getChangePercent());
    }
    
}
