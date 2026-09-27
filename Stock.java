
package odev2;


public class Stock {
     String symbol;
     String name ;
     double PreviousClosingPrice;
     double currentPrice;
     


public Stock(String newSymbol, String newName){
    symbol = newSymbol;
    name = newName;
   
}

public double getChangePercent(){
    return ((currentPrice - PreviousClosingPrice) / PreviousClosingPrice) * 100;
}
}