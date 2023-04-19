import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class PatientManager {
  private List<Patient> patients;

  PatientManager() {
    this.patients = new ArrayList<Patient>();
  }

  void addPatient(Patient patient) throws Exception {
    if (patient == null) {
      throw new Exception("Patient object is null");
    }

    if (patient.getName() == null || patient.getName().trim().isEmpty()) {
      throw new Exception("Patient name is empty");
    }

    if (patient.getAge() < 1 || patient.getAge() > 99) {
      throw new Exception("Invalid patient age");
    }

    if (patient.getAadharCardNumber() == null || !patient.getAadharCardNumber().matches("\\d{12}")) {
      throw new Exception("Invalid Aadhar card number");
    }

    if (patient.getContactNumber() == null || !patient.getContactNumber().matches("\\d{10}")) {
      throw new Exception("Invalid contact number");
    }

    if (patient.getCity() == null || patient.getCity().trim().isEmpty()) {
      throw new Exception("City name is empty");
    }

    if (patient.getAddress() == null || patient.getAddress().trim().isEmpty()) {
      throw new Exception("Address is empty");
    }
    if (patient.getGuardianName() == null || patient.getGuardianName().trim().isEmpty()) {
      throw new Exception("Guardian name is empty");
    }

    if (patient.getGuardianAddress() == null || patient.getGuardianAddress().trim().isEmpty()) {
      throw new Exception("Guardian address is empty");
    }

    if (patient.getGuardianContactNumber() == null || !patient.getGuardianContactNumber().matches("\\d{10}")) {
      throw new Exception("Invalid guardian contact number");
    }

    String uniqueId = generateUniqueId();
    patient.setUniqueId(uniqueId);

    Date currentDate = new Date();
    patient.setDateOfAdmission(currentDate);

    this.patients.add(patient);
  }

  private String generateUniqueId() {
    long currentTimeMillis = System.currentTimeMillis();
    int randomNum = (int) (Math.random() * 100000);
    String uniqueId = String.format("%d%d", currentTimeMillis, randomNum);
    return uniqueId;
  }

  List<Patient> getAllPatients() throws Exception {
    if (this.patients.isEmpty()) {
      throw new Exception("No patients found");
    }

    return this.patients;
  }

  Patient getPatientById(String uniqueId) throws Exception {
    if (uniqueId == null || uniqueId.trim().isEmpty()) {
      throw new NullPointerException("Unique id is null or empty");
    }

    for (Patient patient : this.patients) {
      if (patient.getUniqueId().equals(uniqueId)) {
        return patient;
      }
    }

    throw new Exception("No patient found with unique id: " + uniqueId);
  }

  Patient getPatientByName(String name) throws Exception {
    if (name == null || name.trim().isEmpty()) {
      throw new NullPointerException("Patient name is null or empty");
    }

    for (Patient patient : this.patients) {
      if (patient.getName().equalsIgnoreCase(name)) {
        return patient;
      }
    }

    throw new Exception("No patient found with name: " + name);
  }

  List<Patient> getPatientsByCity(String city) throws Exception {
    if (city == null || city.trim().isEmpty()) {
      throw new NullPointerException("City name is null or empty");
    }

    List<Patient> patientsByCity = new ArrayList<Patient>();

    for (Patient patient : this.patients) {
      if (patient.getCity().equalsIgnoreCase(city)) {
        patientsByCity.add(patient);
      }
    }

    if (patientsByCity.isEmpty()) {
      throw new Exception("No patients found in city: " + city);
    }

    return patientsByCity;
  }

  List<Patient> getPatientsByAge(int startAge, int endAge) throws Exception {
    if (startAge < 1 || endAge > 99 || startAge > endAge) {
      throw new Exception("Invalid age range");
    }

    List<Patient> patientsByAge = new ArrayList<Patient>();

    for (Patient patient : this.patients) {
      if (patient.getAge() >= startAge && patient.getAge() <= endAge) {
        patientsByAge.add(patient);
      }
    }

    if (patientsByAge.isEmpty()) {
      throw new Exception("No patients found in age range: " + startAge + "-" + endAge);
    }

    return patientsByAge;
  }

  void markPatientRecovered(String uniqueId) throws Exception {
    if (uniqueId == null || uniqueId.trim().isEmpty()) {
      throw new Exception("Unique ID is empty");
    }

    boolean foundPatient = false;

    for (Patient patient : patients) {
      if (patient.getUniqueId().equals(uniqueId)) {
        patient.setRecovered(true);
        foundPatient = true;
        break;
      }
    }

    if (!foundPatient) {
      throw new Exception("Patient with given ID not found");
    }
  }
}