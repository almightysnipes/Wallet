//Wallet
class Wallet {
String [] id = new String[2];
   double cash;
int cards;
int buisy;
   /** Construct a circle with radius 1 **/
   Wallet() {
      id[0] = " ";
      id[1] = " ";
      cash = 0;
      cards = 0;
      buisy= 0;
   }
   Wallet(String newidn, String newidb, double newcash, int newcards, int newbuisy){
   id[0] = newidn;
   id[1] = newidb;
   cash = newcash;
   cards = newcards;
   buisy = newbuisy;
   }
   void updatecash(double newcash) {
   cash = newcash;
   }
   void updateId(String newname, String newBday){
   id[0] = newname;
   id[1] = newBday;
   }
   void updatecards(int newcards){
   cards = newcards;
   }
   void updatebuisy(int newbuisy){
   buisy = newbuisy;
   if (buisy < 0){
   int nb = buisy *-1;
   System.out.println("You tried to remove " + nb + " card/s that didn't exist!");
   
   buisy = 0;
   }
   }
   int getcards() {
   return (cards + buisy);
   }
   String getid() {
   return (id[0] + " " + id[1] );
   }
   }