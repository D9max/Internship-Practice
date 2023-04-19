import java.io.FileReader;
class FileReadDemo {
  public static void main(String args[]) {
    try {
      FileReader fr = new FileReader("abc.txt");
      int i;
      while ((i = fr.read()) != -1) {
        System.out.print((char) i);
      }
      }catch (Exception e) {
      System.out.println(e);
    } 
  }
}
