public class ShirtTest03 {
    public static void main (String[] args) {
        Shirt myShirt = new Shirt();
        System.out.println("Shirt color: " + myShirt.colorCode);      
        changeShirtColor(myShirt, 'B');
        System.out.println("Shirt color: " + myShirt.colorCode);
    }
    
    public static void changeShirtColor(Shirt theShirt, char color) {
        theShirt = new Shirt();
        theShirt.colorCode = color;     
    }
}
