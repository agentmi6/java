


import java.io.File;
import java.io.IOException;

public class MultipleExceptionExample {
  public static void main (String args[]) {
    try { createFile(); }
    catch (IOException ioe) {
      System.out.println(ioe);
    } 
    catch (IllegalArgumentException iae) {
      System.out.println(iae);
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void createFile() throws IOException {
    File testFile = new File("c://notWriteableDir"); 
    File tempFile = testFile.createTempFile("tm", null, testFile);
    System.out.println("Temp filename is " + tempFile.getPath());
    int myInt[] = new int[5]; 
    myInt[5] = 25;
  }
}
