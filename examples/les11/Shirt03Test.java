public class Shirt03Test { 
  public static void main (String args[]) {
	  Shirt03 theShirt = new Shirt03();
	  
	  // Set values for the Shirt
	  theShirt.setColorCode('R');
    theShirt.setDescription("Outdoors Shirt");
    theShirt.setPrice(39.99);
    
    theShirt.display();
  } 
}