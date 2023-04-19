import java.util.ArrayList;
import java.util.List;

public class Patient {
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

  public Patient(String name, int age, String gender, String aadharCardNumber, String contactNumber, String city,
      String address, String dateOfAdmission, String guardianName, String guardianAddress, String guardianContactNumber,
      String uniqueId) {
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
  }

  // Getter and setter methods for all attributes

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getAadharCardNumber() {
    return aadharCardNumber;
  }

  public void setAadharCardNumber(String aadharCardNumber) {
    this.aadharCardNumber = aadharCardNumber;
  }

  public String getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getDateOfAdmission() {
    return dateOfAdmission;
  }

  public void setDateOfAdmission(String dateOfAdmission) {
    this.dateOfAdmission = dateOfAdmission;
  }

  public String getGuardianName() {
    return guardianName;
  }

  public void setGuardianName(String guardianName) {
    this.guardianName = guardianName;
  }

  public String getGuardianAddress() {
    return guardianAddress;
  }

  public void setGuardianAddress(String guardianAddress) {
    this.guardianAddress = guardianAddress;
  }

  public String getGuardianContactNumber() {
    return guardianContactNumber;
  }

  public void setGuardianContactNumber(String guardianContactNumber) {
    this.guardianContactNumber = guardianContactNumber;
  }

  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }
}