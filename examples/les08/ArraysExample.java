public class ArraysExample {
  public static void main(String[] args) {
    char [] status = {'0', '1', '2', '3'};
    int [] ages = {19, 42, 92, 33, 46};
    Shirt [] shirts = {new Shirt(), new Shirt(), new Shirt()};
    String [] names = {"John James", "John Doe", "Betsy Doe", "Jane Jones", "Fred Funk"};
    
    status[0] = '3';
    names[1] = "Fred Smith";
    ages[1] = 19;
    
    char s = status[0];
    String name = names[1];
    int age = ages[1];
    
  }
}
