import java.util.Date;

public class Patient {
  private String uniqueId;
  private Date dateOfAdmission;

  private int id;
  private String name;
  private int age;
  private Gender gender;
  private String aadharCardNumber;
  private String contactNumber;
  private String city;
  private String address;
  private String guardianName;
  private String guardianAddress;
  private String guardianContactNumber;
  private Date admissionDate;
  private boolean isRecovered;

  public Patient(int id, String name, int age, Gender gender, String aadharCardNumber, String contactNumber,
      String city, String address, String guardianName, String guardianAddress, String guardianContactNumber,
      Date admissionDate) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.aadharCardNumber = aadharCardNumber;
    this.contactNumber = contactNumber;
    this.city = city;
    this.address = address;
    this.guardianName = guardianName;
    this.guardianAddress = guardianAddress;
    this.guardianContactNumber = guardianContactNumber;
    this.admissionDate = admissionDate;
    this.isRecovered = false;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Gender getGender() {
    return gender;
  }

  public String getAadharCardNumber() {
    return aadharCardNumber;
  }

  public String getContactNumber() {
    return contactNumber;
  }

  public String getCity() {
    return city;
  }

  public String getAddress() {
    return address;
  }

  public String getGuardianName() {
    return guardianName;
  }

  public String getGuardianAddress() {
    return guardianAddress;
  }

  public String getGuardianContactNumber() {
    return guardianContactNumber;
  }

  public Date getAdmissionDate() {
    return admissionDate;
  }

  public boolean isRecovered() {
    return isRecovered;
  }

  public void setRecovered(boolean isRecovered) {
    this.isRecovered = isRecovered;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public void setDateOfAdmission(Date dateOfAdmission) {
    this.dateOfAdmission = dateOfAdmission;
  }

  public String getUniqueId() {
    return uniqueId;
  }

  public Date getDateOfAdmission() {
    return dateOfAdmission;
  }
}
