public class Trousers extends Clothing {
    // The color codes are S=Small,M=Medium,L=Large, U=Unset
    private char fit = 'U';
    private int length = 0; // Length in inches, 0 default

    public Trousers(int itemID, String description, 
            char colorCode, double price, int length, char fit) {
        super(itemID, description, colorCode, price);
        this.fit = fit;
        this.length = length;
    }

    public void display() {
        System.out.println("Trouser ID: " + getItemID());
        System.out.println("Trouser description:" + getDescription());
        System.out.println("Color Code: " + getColorCode());
        System.out.println("Trouser price: " + getPrice());
        System.out.println("Trouser length: " + getLength());
        System.out.println("Fit: " + getFit());
    } // end of display method

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
} // end of class

