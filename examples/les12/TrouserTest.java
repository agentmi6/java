public class TrouserTest {
  public static void main (String args[]) {
    Clothing cl = new Trousers(123, "Dress Trousers", 'B', 17.00, 34, 'S');
    cl.display();
        
    // cl.getLength(); // Will not compile
    Trousers tr = (Trousers) cl;
    System.out.println("Length: " + 
            tr.getLength()); // This will compile
  } 
}
