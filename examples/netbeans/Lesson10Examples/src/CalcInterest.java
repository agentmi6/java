public class CalcInterest {
  public static void main(String[] args) {
    CalcInterest calc = new CalcInterest();
    System.out.println("Years to double: " + 
            calc.getYearsToDouble(1000, 10));
   
  }
  
  public  int  getYearsToDouble(int initialSum, int interest) {
    int years = 0;      
    int currentSum = initialSum * 100; // Convert to pennies
    int desiredSum = currentSum * 2;  
    while ( currentSum <= desiredSum) {
       currentSum += currentSum * interest/100;
       years++;        
    }
    return years;
  }  
}
