//Test Wallet
public class TestWallet {
   /**Main method**/
   public static void main(String[] args) {
     //Create a circle with radius 1
     Wallet JohnW = new Wallet("John","03/00",15,3,1);
    Wallet JalenW = new Wallet("Jalen","10/03",0,3,4);
 Wallet DaishawnW = new Wallet("Daishawn","06/00",394,2,1);
    Wallet HenryW = new Wallet("Henry","07/98",81,1,1);
   Wallet QuyrenW = new Wallet("Quyren","02/00",.04,4,3);
   Wallet LittleW = new Wallet("Little","06/01",80,5,6);
    Wallet RoudyW = new Wallet("Roudy","07/99",0,3,2);
    Wallet ShamarW = new Wallet("Shamar","02/01",67,4,1);
    Converter num1 = new Converter(5853);
        Converter num2 = new Converter("MMLVII");

    System.out.println("Roman " + num1.Roman);
    System.out.println("Decimal " + num2.Decimal);
         
         System.out.println("John's cash " + JohnW.cash);
   JohnW.updatecash(JohnW.cash + 100);
         System.out.println("John's cash " + JohnW.cash);  
    
System.out.println("John's Buisy " + JohnW.buisy);
   JohnW.updatebuisy(JohnW.buisy - 200);
         System.out.println("John's buisy " + JohnW.buisy);
         
    
     System.out.println("Jalen's cash " + JalenW.cash);
   JalenW.updatecash(JalenW.cash + 100);
         System.out.println("Jalen's cash " + JalenW.cash);
         
    
System.out.println("Jalen's Buisy " + JalenW.buisy);
   JalenW.updatebuisy(JalenW.buisy - 200);
         System.out.println("Jalen's buisy " + JalenW.buisy);


    System.out.println("Daishawn's cash " + DaishawnW.cash);
   DaishawnW.updatecash(DaishawnW.cash + 100);
         System.out.println("Daishawn's cash " + DaishawnW.cash);
         
    
System.out.println("Daishawn's Buisy " + DaishawnW.buisy);
   DaishawnW.updatebuisy(DaishawnW.buisy - 200);
         System.out.println("Daishawn's buisy " + DaishawnW.buisy);
         
         
          System.out.println("Henry's cash " + HenryW.cash);
   HenryW.updatecash(HenryW.cash + 100);
         System.out.println("Henry's cash " + HenryW.cash);
         
    
System.out.println("Henry's Buisy " + HenryW.buisy);
   HenryW.updatebuisy(HenryW.buisy - 200);
         System.out.println("Henry's buisy " + HenryW.buisy);


    System.out.println("Quyren's cash " + QuyrenW.cash);
   QuyrenW.updatecash(QuyrenW.cash + 100);
         System.out.println("Quyren's cash " + QuyrenW.cash);
         
    
System.out.println("Quyren's Buisy " + QuyrenW.buisy);
   QuyrenW.updatebuisy(QuyrenW.buisy - 200);
         System.out.println("Quyren's buisy " + QuyrenW.buisy);

   
    System.out.println("Little's cash " + LittleW.cash);
   LittleW.updatecash(LittleW.cash + 100);
         System.out.println("Little's cash " + LittleW.cash);
         
    
System.out.println("Little's Buisy " + LittleW.buisy);
   LittleW.updatebuisy(LittleW.buisy - 200);
         System.out.println("Little's buisy " + LittleW.buisy);

   
    System.out.println("Roudy's cash " + RoudyW.cash);
   RoudyW.updatecash(RoudyW.cash + 100);
         System.out.println("Roudy's cash " + RoudyW.cash);
         
    
System.out.println("Roudy's Buisy " + RoudyW.buisy);
   RoudyW.updatebuisy(RoudyW.buisy - 200);
         System.out.println("Roudy's buisy " + RoudyW.buisy);
         
       
          System.out.println("Shamar's cash " + ShamarW.cash);
   ShamarW.updatecash(ShamarW.cash + 100);
         System.out.println("Shamar's cash " + ShamarW.cash);
         
    
System.out.println("Shamar's Buisy " + ShamarW.buisy);
   ShamarW.updatebuisy(ShamarW.buisy - 200);
         System.out.println("Shamar's buisy " + ShamarW.buisy);


System.out.println("JohnW" + JohnW.getid() + " " + JohnW.cash + " " + JohnW.cards + " " + JohnW.buisy);
System.out.println("JalenW" + JalenW.getid() + " " + JalenW.cash + " " + JalenW.cards + " " + JalenW.buisy);
System.out.println("DaishawnW" + DaishawnW.getid() + " " + DaishawnW.cash + " " + DaishawnW.cards + " " + DaishawnW.buisy);
System.out.println("HenryW" + HenryW.getid() + " " + HenryW.cash + " " + HenryW.cards + " " + HenryW.buisy);
System.out.println("QuyrenW" + QuyrenW.getid() + " " + QuyrenW.cash + " " + QuyrenW.cards + " " + QuyrenW.buisy);
System.out.println("LiitleW" + LittleW.getid() + " " + LittleW.cash + " " + LittleW.cards + " " + LittleW.buisy);
System.out.println("RoudyW" + RoudyW.getid() + " " + RoudyW.cash + " " + RoudyW.cards + " " + RoudyW.buisy);
System.out.println("ShamarW" + ShamarW.getid() + " " + ShamarW.cash + " " + ShamarW.cards + " " + ShamarW.buisy);
}
}