import java.io.*;

public class FileOutputStreamDemo {
  public static void main(String[] args) {
    try {
      java.io.FileOutputStream fw = new java.io.FileOutputStream("xyz.txt");
      String str = "hi hello how are you";
      byte[] bytes = str.getBytes();

      fw.write(bytes);
      fw.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
