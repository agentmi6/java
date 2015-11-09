public class ShirtTest { 
  public static void main (String args[]) {
	  Shirt theShirt = new Shirt();

	  // Set a valid colorCode
	  theShirt.setColorCode('R');
	  System.out.println("Color Code: " + theShirt.getColorCode());
	  
	  // Set an invalid color code
	  theShirt.setColorCode('Z');
	  System.out.println("Color Code: " + theShirt.getColorCode());
  } 
}