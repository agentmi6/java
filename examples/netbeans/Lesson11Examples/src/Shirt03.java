public class Shirt03 {
  private int shirtID = 0; // Default ID for the shirt
  private String description = "-description required-"; // default
  // The color codes are R=Red, B=Blue, G=Green, U=Unset
  private char colorCode = 'U';
  private double price = 0.0; // Default price for all items
  
  public void setShirtId(int newID){
    shirtID = newID;
  }
  
  public int getShirtId(){
    return shirtID;
  }

  public void setDescription(String newDescription){
    description = newDescription;
  }
  
  public String getDescription(){
    return description;
  }
  
  public char getColorCode() {
    return colorCode;
  }

  public void setColorCode(char newCode) {    
    switch (newCode) {
    case 'R': 
    case 'G': 
    case 'B':
      colorCode = newCode;
      break;
    default:
      System.out.println("Invalid colorCode. Use R, G, or B");
    }
  }
  
  public void setPrice(double newPrice){
    price = newPrice;
  }
  
  public double getPrice(){
    return price;
  }
  
  public void display(){
    System.out.println("\nShirtID: " + getShirtId()
      + "\nDescription: " + getDescription()
      + "\nColor: " + getColorCode()
      + "\nPrice: " + getPrice()
    );
  }
  
} // end of class
