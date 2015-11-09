public class Shirt04Test {
  public static void main (String args[]) {
    Shirt04 shirt1 = new Shirt04();
    shirt1.display();
    
    Shirt04 shirt2 = new Shirt04('G');
    shirt2.display();
    
    Shirt04 shirt3 = new Shirt04('B', 64.99);
    shirt3.display();    
  }
}
