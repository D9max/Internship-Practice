import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.*;
import java.util.Iterator;

class Patient {
  private String name;
  private int age;
  private String gender;
  private String aadharCardNumber;
  private String contactNumber;
  private String city;
  private String address;
  private String dateOfAdmission;
  private String guardianName;
  private String guardianAddress;
  private String guardianContactNumber;
  private String uniqueId;
  private boolean recovered;

 Patient(String uniqueId, String name, int age, String gender, String aadharCardNumber, String contactNumber, String city,
      String address, String dateOfAdmission, String guardianName, String guardianAddress, String guardianContactNumber) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.aadharCardNumber = aadharCardNumber;
    this.contactNumber = contactNumber;
    this.city = city;
    this.address = address;
    this.dateOfAdmission = dateOfAdmission;
    this.guardianName = guardianName;
    this.guardianAddress = guardianAddress;
    this.guardianContactNumber = guardianContactNumber;
    this.uniqueId = uniqueId;
    this.recovered = false;
  }
  String getName() {
    return name;
  }

  int getAge() {
    return age;
  }

  String getGender() {
    return gender;
  }

  String getAadharCardNumber() {
    return aadharCardNumber;
  }

  String getContactNumber() {
    return contactNumber;
  }

  String getCity() {
    return city;
  }

  String getAddress() {
    return address;
  }

  String getDateOfAdmission() {
    return dateOfAdmission;
  }

  String getGuardianName() {
    return guardianName;
  }

  String getGuardianAddress() {
    return guardianAddress;
  }

  String getGuardianContactNumber() {
    return guardianContactNumber;
  }

  String getUniqueId() {
    return uniqueId;
  }

  boolean isRecovered() {
    return recovered;
  }

  public void setRecovered(boolean recovered) {
    this.recovered = recovered;
  }
}

public class PatientManagementSystem {
  private List<Patient> patientList;

  public PatientManagementSystem() {
    patientList = new ArrayList<>();
  }

  public void addPatient() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter patient name: ");
    String name = scanner.nextLine();
    System.out.print("Enter patient age: ");
    int age = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter patient gender: ");
    String gender = scanner.nextLine();
    System.out.print("Enter patient Aadhar Card number: ");
    String aadharCardNumber = scanner.nextLine();
    System.out.print("Enter patient contact number: ");
    String contactNumber = scanner.nextLine();
    System.out.print("Enter patient city: ");
    String city = scanner.nextLine();
    System.out.print("Enter patient address: ");
    String address = scanner.nextLine();
    System.out.print("Enter patient date of admission: ");
    String dateOfAdmission = scanner.nextLine();
    System.out.print("Enter guardian name: ");
    String guardianName = scanner.nextLine();
    System.out.print("Enter guardian address: ");
    String guardianAddress = scanner.nextLine();
    System.out.print("Enter guardian contact number: ");
    String guardianContactNumber = scanner.nextLine();
    String uniqueId = generateUniqueId();
    Patient patient = new Patient(uniqueId, name, age, gender, aadharCardNumber, contactNumber, city, address,
        dateOfAdmission, guardianName, guardianAddress, guardianContactNumber);
    patientList.add(patient);
    System.out.println("Patient added successfully with ID: " + uniqueId);
  }

  void updatePatientStatus() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter patient ID: ");
    String id = scanner.nextLine();
    boolean found = false;
    for (Patient patient : patientList) {
      if (patient.getUniqueId().equalsIgnoreCase(id)) {
        found = true;
        System.out.print("Enter new status for patient " + patient.getName() + " (e.g. Recovered, Deceased): ");
        String newStatus = scanner.nextLine();
        patient.setRecovered(newStatus.equalsIgnoreCase("recovered"));
        System.out.println("Patient status updated successfully.");
        break;
      }
    }
    if (!found) {
      System.out.println("Patient not found with ID: " + id);
    }
  }


  public void deletePatient() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter patient ID: ");
    String id = scanner.nextLine();
    boolean found = false;
    for (Patient patient : patientList) {
      if (patient.getUniqueId().equalsIgnoreCase(id)) {
        found = true;
        patientList.remove(patient);
        System.out.println("Patient deleted successfully.");
        break;
      }
    }
    if (!found) {
      System.out.println("Patient not found with ID: " + id);
    }
  }

  private String generateUniqueId() {
    int maxId = 0;
    for (Patient patient : patientList) {
      int id = Integer.parseInt(patient.getUniqueId().substring(1));
      if (id > maxId) {
        maxId = id;
      }
    }
    return "P" + String.format("%04d", maxId + 1);
  }

  void listPatients() {
    if (patientList.isEmpty()) {
      System.out.println("No patients found in the system.");
      return;
    }
    System.out.println("List of Patients:");
    for (Patient patient : patientList) {
      System.out.println(patient.getName() + " - " + patient.getUniqueId());
    }
  }

  void getPatientDetails() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter patient ID or name: ");
    String idOrName = scanner.nextLine();
    for (Patient patient : patientList) {
      if (patient.getUniqueId().equalsIgnoreCase(idOrName) || patient.getName().equalsIgnoreCase(idOrName)) {
        System.out.println(patient);
        return;
      }
    }
    System.out.println("Patient not found with ID or name: " + idOrName);
  }

  void filterPatientsByCity() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter city name: ");
    String city = scanner.nextLine();
    List<Patient> filteredList = patientList.stream().filter(patient -> patient.getCity().equalsIgnoreCase(city))
        .collect(Collectors.toList());
    if (filteredList.isEmpty()) {
      System.out.println("No patients found in the system from city: " + city);
      return;
    }
    System.out.println("List of Patients from " + city + ":");
    for (Patient patient : filteredList) {
      System.out.println(patient.getName() + " - " + patient.getUniqueId());
    }
  }

  void filterPatientsByAgeGroup() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter age group (e.g. 50-60): ");
    String ageGroup = scanner.nextLine();
    String[] ageRange = ageGroup.split("-");
    int lowerBound = Integer.parseInt(ageRange[0]);
    int upperBound = Integer.parseInt(ageRange[1]);
    List<Patient> filteredList = patientList.stream()
        .filter(patient -> patient.getAge() >= lowerBound && patient.getAge() <= upperBound)
        .collect(Collectors.toList());
    if (filteredList.isEmpty()) {
      System.out.println("No patients found in the system in the age group: " + ageGroup);
      return;
    }
    System.out.println("List of Patients in the age group " + ageGroup + ":");
    for (Patient patient : filteredList) {
      System.out.println(patient.getName() + " - " + patient.getUniqueId());
    }
  }

  void saveToFile() {
    try {
      FileOutputStream fos = new FileOutputStream("patientData.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(patientList);
      oos.close();
      fos.close();
      System.out.println("Patient data saved to file.");
    } catch (IOException e) {
      System.out.println("Error occurred while saving patient data to file: " + e.getMessage());
    }
  }

  void loadFromFile() {
    try {
      FileInputStream fis = new FileInputStream("patientData.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      patientList = (List<Patient>) ois.readObject();
      ois.close();
      fis.close();
      System.out.println("Patient data loaded from file.");
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Error occurred while loading patient data from file: " + e.getMessage());
    }
  }
  public static void main(String[] args) {
    PatientManagementSystem pms = new PatientManagementSystem();
    Scanner scanner = new Scanner(System.in);
    int choice = -1;
    while (choice != 0) {
      pms.printMenu();
      choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 1:
          pms.addPatient();
          break;
        case 2:
          pms.updatePatientStatus();
          break;
        case 3:
          pms.deletePatient();
          break;
        case 4:
          pms.listPatients();
          break;
        case 5:
          pms.getPatientDetails();
          break;
        case 6:
          pms.filterPatientsByCity();
          break;
        case 7:
          pms.filterPatientsByAgeGroup();
          break;
        case 8:
          pms.saveToFile();
          break;
        case 9:
          pms.loadFromFile();
          break;
        case 0:
          System.out.println("Thank you for using Patient Management System. Goodbye!");
          break;
        default:
          System.out.println("Invalid choice. Please choose again.");
          break;
      }
    }
  }
