public class Shirt02Test { 
  public static void main (String args[]) {
	  Shirt02 theShirt = new Shirt02();
	  System.out.println("Color Code: " + theShirt.getColorCode());
	  
	  // Set an invalid color code
	  theShirt.setColorCode('Z');
	  System.out.println("Color Code: " + theShirt.getColorCode());
  } 
}