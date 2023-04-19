class RunThread implements Runnable {
  
  public void run() {
    
    System.out.println("Thread is running");
  }
}
class ThreadDemoReader {
  
  public static void main(String args[]) {
    RunThread t1 = new RunThread();
    Thread thread = new Thread(t1);
    thread.start();
  }
}