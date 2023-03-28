public class Customer {
  private int cid;
  private String name;
  private int nooforders;

  void setCid(int cid) {
    this.cid = cid;
  }

  void setName(String name) {
    this.name = name;
  }

  void setNooforders(int nooforders) {
    this.nooforders = nooforders;
  }

  int getCid() {
    return this.cid;
  }

  String getName() {
    return this.name;
  }

  int getNooforders() {
    return this.nooforders;
  }
}