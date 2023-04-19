import java.util.Date;

public class HospitalManagement {
  public static void main(String[] args) {
    Patient patient = new Patient(1, "John Doe", 30, Gender.MALE, "1234567890", "9999999999", "New York", "123 Main St",
        "Jane Doe", "456 Main St", "8888888888", new Date());

    System.out.println(patient.getName());

    patient.setRecovered(true);

    System.out.println(patient.isRecovered());
  }
}
