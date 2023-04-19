import java.util.ArrayList;
import java.util.List;

public class PatientManager {
  private List<Patient> patientList;

  public PatientManager() {
    this.patientList = new ArrayList<Patient>();
  }

  public void addPatient(Patient patient) {
    if (patient.getAge() < 1 || patient.getAge() > 99) {
      System.out.println("Invalid age. Age should be between 1 and 99.");
      return;
    }

    if (patient.getAadharCardNumber().length() != 12) {
      System.out.println("Invalid Aadhar Card number. Aadhar Card number should contain 12 digits.");
      return;
    }

    if (patient.getContactNumber().length() != 10) {
      System.out.println("Invalid contact number. Contact number should contain 10 digits.");
      return;
    }

    // assign unique id to patient
    patient.setUniqueId("P" + (patientList.size() + 1));

    // add patient to list
    patientList.add(patient);

    System.out.println("Patient added successfully. Unique Id: " + patient.getUniqueId());
  }

  public void showAllPatients() {
    if (patientList.isEmpty()) {
      System.out.println("No patients found.");
      return;
    }

    System.out.println("List of all patients:");
    for (Patient patient : patientList) {
      System.out.println("Name: " + patient.getName() + ", Unique Id: " + patient.getUniqueId());
    }
  }

  public void getPatientDetails(String idOrName) {
    boolean found = false;

    for (Patient patient : patientList) {
      if (patient.getUniqueId().equalsIgnoreCase(idOrName) || patient.getName().equalsIgnoreCase(idOrName)) {
        found = true;
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Gender: " + patient.getGender());
        System.out.println("Aadhar Card Number: " + patient.getAadharCardNumber());
        System.out.println("Contact Number: " + patient.getContactNumber());
        System.out.println("City: " + patient.getCity());
        System.out.println("Address: " + patient.getAddress());
        System.out.println("Date of Admission: " + patient.getDateOfAdmission());
        System.out.println("Guardian Name: " + patient.getGuardianName());
        System.out.println("Guardian Address: " + patient.getGuardianAddress());
        System.out.println("Guardian Contact Number: " + patient.getGuardianContactNumber());
        System.out.println("Unique Id: " + patient.getUniqueId());
        break;
      }
    }

    if (!found) {
      System.out.println("Patient not found.");
    }
  }

  public void getPatientsByCity(String city) {
    boolean found = false;

    for (Patient patient : patientList) {
      if (patient.getCity().equalsIgnoreCase(city)) {
        found = true;
        System.out.println("Name: " + patient.getName() + ", Unique Id: " + patient.getUniqueId());
      }
    }

    if (!found) {
      System.out.println("No patients found from " + city + ".");
    }
  }

  public void getPatientsByAgeGroup(int startAge, int endAge) {
    boolean found = false;
    for (Patient patient : patientList) {
      int age = patient.getAge();
      if (age >= startAge && age <= endAge) {
        System.out.println(patient.toString());
        found = true;
      }
    }
    if (!found) {
      System.out.println("No patients found in the age group " + startAge + " to " + endAge + ".");
    }
  }

  public void markPatientRecovered(int patientId) {
    boolean found = false;
    for (Patient patient : patientList) {
      if (patient.getPatientId() == patientId) {
        patient.setRecovered(true);
        System.out.println("Patient with ID " + patientId + " marked as recovered.");
        found = true;
      }
    }
    if (!found) {
      System.out.println("Patient with ID " + patientId + " not found.");
    }
  }

public void deletePatient(int patientId) {
    boolean found = false;
    Iterator<Patient> iterator = patientList.iterator();
    while (iterator.hasNext()) {
        Patient patient = iterator.next();
        if (patient.getPatientId() == patientId) {
            iterator.remove();
            System.out.println("Patient with ID " + patientId + " deleted from the system.");
            found = true;
        }
    }
    if (!found) {
        System.out.println("Patient with ID " + patientId + " not found.");
    }
}
}