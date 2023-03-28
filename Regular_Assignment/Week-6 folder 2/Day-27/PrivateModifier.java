// class Data {
//     private String name;
// }

// public class Main {
//     public static void main(String[] main){
//         Data d = new Data();
//         d.name = "Mubarak";
//     }
// }

class Data {
    private String name;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name= name;
    }
}
public class PrivateModifier {
    public static void main(String[] main){
        Data d = new Data();
        d.setName("Programiz");
        System.out.println(d.getName());
    }
}