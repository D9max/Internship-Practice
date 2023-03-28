public class Greetings {
  public static void main(String args[]) {
    Customer cust = new Customer();
    cust.setCid(123);
    cust.setName("mubarak");
    cust.setNooforders(4);
    System.out.println(cust.getCid() + "" + cust.getName() + "" + cust.getNooforders());
  }
}