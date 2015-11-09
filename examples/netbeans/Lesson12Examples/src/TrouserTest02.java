public class TrouserTest02 {
  public static void main (String args[]) {
    Clothing myPants = new Trousers(123, "Dress Trousers", 'B', 17.00, 34, 'S');
    Clothing myShirt = new Shirt(111, "Casual shirt", 'R', 49.99, 'M');
    
    //displayDetails1(myShirt); // Runtime Exception
    displayDetails2(myShirt);
    displayDetails2(myPants);
  } 

  public static void displayDetails1(Clothing cl) {
    cl.display();        
    Trousers tr = (Trousers) cl;
    System.out.println("Length: " + tr.getLength());
  }
  
  public static void displayDetails2(Clothing cl) {
    cl.display();
    if (cl instanceof Trousers){
      Trousers tr = (Trousers) cl;
      System.out.println("Length: " + tr.getLength());
    }
  }  
}
