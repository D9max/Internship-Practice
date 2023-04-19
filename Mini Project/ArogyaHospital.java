//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
//import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Scanner;
// import java.util.stream.Collectors;
// import java.io.*;
// import java.util.Iterator;

class ArogyaMemberException extends Exception {
    ArogyaMemberException(String str) {
        super(str);
    }
}
class AarogyaMember {
    String name;
    int age;
    String gender;
    String aadharCardNumber;
    String contactNumber;
    String city;
    String address;
    String dateOfAdmission;
    String guardianName;
    String guardianAddress;
    long guardianContactNumber;
    boolean recovered;
    private long memberId;

    public AarogyaMember(long memberId, String name, int age) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        recovered = false;
    }

    public long getId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public boolean isRecovered() {
        return recovered;
    }

    public void markAsRecovered() {
        recovered = true;
    }

    public void input() throws ArogyaMemberException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = sc.nextLine();

        while (true) {
            System.out.println("Enter age: ");
            String ageStr = sc.next();
            if (ageStr.equals("0") || ageStr == null) {
                throw new ArogyaMemberException("Age cannot be 0 or null.");
            }
            try {
                age = Integer.parseInt(ageStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid age. Please enter a valid age.");
            }
        }

        System.out.println("Enter gender: ");
        gender = sc.next();

        while (true) {
            System.out.println("Enter Aadhar Card number: ");
            aadharCardNumber = sc.next();
            if (aadharCardNumber.matches("\\d{12}")) {
                break;
            }
            System.out.println("Invalid Aadhar card number. Please enter a valid 12 digit Aadhar card number.");
        }

        while (true) {
            System.out.println("Enter contact number: ");
            contactNumber = sc.next();
            if (contactNumber.matches("[7-9]\\d{9}")) {
                break;
            }
            System.out.println("Invalid contact number. Please enter a valid 10 digit contact number starting with 7, 8, or 9.");
        }

        System.out.println("Enter city: ");
        city = sc.next();
        sc.nextLine();

        System.out.println("Enter address: ");
        address = sc.nextLine();

        System.out.println("Enter date of admission (dd/mm/yyyy): ");
        dateOfAdmission = sc.nextLine();

        System.out.println("Enter guardian name: ");
        guardianName = sc.nextLine();

        System.out.println("Enter guardian address: ");
        guardianAddress = sc.nextLine();

        System.out.println("Enter guardian contact number: ");
        guardianContactNumber = sc.nextLong();
        sc.nextLine();
    }
}

public class ArogyaHospital {
    public static void addMember(HashSet<AarogyaMember> members, long memberId) throws ArogyaMemberException {
    AarogyaMember newMember = new AarogyaMember(memberId, "", 0);
    newMember.input();
    members.add(newMember);
    System.out.println("Member added successfully with ID " + memberId);
}

public static void markRecovered(HashSet<AarogyaMember> members) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter member ID to mark as recovered: ");
    long memberId = sc.nextLong();
    boolean found = false;
    for (AarogyaMember member : members) {
        if (member.getId() == memberId) {
            member.markAsRecovered();
            System.out.println("Member " + memberId + " marked as recovered.");
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Member with ID " + memberId + " not found.");
    }
}
public static void displayMembers(HashSet<AarogyaMember> members) {
    System.out.println("List of all members:");
    for (AarogyaMember member : members) {
        System.out.println("ID: " + member.getId() + ", Name: " + member.getName() + ", Age: " + member.getAge() + ", City: " + member.getCity() + ", Recovered: " + member.isRecovered());
    }
}
public static void searchMember(HashSet<AarogyaMember> members) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter member ID to search: ");
    long memberId = sc.nextLong();
    boolean found = false;
    for (AarogyaMember member : members) {
        if (member.getId() == memberId) {
            System.out.println("Member found:");
            System.out.println("ID: " + member.getId() + ", Name: " + member.getName() + ", Age: " + member.getAge() + ", Gender: " + member.gender + ", Aadhar Card Number: " + member.aadharCardNumber + ", Contact Number: " + member.contactNumber + ", City: " + member.getCity() + ", Address: " + member.address + ", Date of Admission: " + member.dateOfAdmission + ", Guardian Name: " + member.guardianName + ", Guardian Address: " + member.guardianAddress + ", Guardian Contact Number: " + member.guardianContactNumber + ", Recovered: " + member.isRecovered());
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Member with ID " + memberId + " not found.");
    }
}

  public static void searchMembersByCityAndAge(HashSet<AarogyaMember> members, String city, int minAge, int maxAge) {
    boolean found = false;
    for (AarogyaMember m : members) {
        if (m.getCity().equalsIgnoreCase(city) && m.getAge() >= minAge && m.getAge() <= maxAge) {
            System.out.println(m.getName() + " " + m.getAge() + " " + m.getCity() + " " + m.isRecovered());
            found = true;
        }
    }
    if (!found) {
        System.out.println("No members found in city " + city + " with age between " + minAge + " and " + maxAge);
    }
}

  public static void updateMember(HashSet<AarogyaMember> members, long memberId) throws ArogyaMemberException {
    for (AarogyaMember member : members) {
        if (member.getId() == memberId) {
            System.out.println("Enter updated member details:");
            member.input();
            System.out.println("Member with ID " + memberId + " has been updated.");
            return;
        }
    }
    System.out.println("No member found with ID " + memberId);
}

  public static void deleteMember(HashSet<AarogyaMember> members, long memberId) {
            for (AarogyaMember member : members) {
            if (member.getId() == memberId) {
            members.remove(member);
            System.out.println("Member with ID " + memberId + " has been deleted.");
            return;
        }
    }
System.out.println("No member found with ID " + memberId);
}
  
public static void main(String[] args) {
    HashSet<AarogyaMember> members = new HashSet<>();
    long memberId = 100000; 
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("````````````````````````````````````````````````````````````");
        System.out.println("* ➕ Welcome to Arogya Hospital InformationManagement System 🏥 *\n");
      System.out.println("````````````````````````````````````````````````````````````");;
        System.out.println("Enter operation to perform:\n");
      
        System.out.println("1. Add new member 💁");
        System.out.println("2. Mark member as recovered 🔖");
        System.out.println("3. Display all members 📝");
        System.out.println("4. Search for a member 🔍");
        System.out.println("5. update member 👆");
        System.out.println("6. search Members By City And Age 🧐");
        System.out.println("7. Delete a member 😒");
        System.out.println("8. Exit 🙋‍♂️");
int choice = sc.nextInt();
      
sc.nextLine(); 
    switch (choice) {
        case 1:
            AarogyaMember member = new AarogyaMember(memberId++, "", 0);
            try {
                member.input();
            } catch (ArogyaMemberException e) {
                System.out.println("Error: " + e.getMessage());
                continue;
            }
            members.add(member);
            System.out.println("Member added successfully.");
            break;
        case 2:
            System.out.println("Enter member ID to mark as recovered: ");
            long memberIdToMark = sc.nextLong();
            sc.nextLine();
            boolean found = false;
            for (AarogyaMember m : members) {
                if (m.getId() == memberIdToMark) {
                    m.markAsRecovered();
                    System.out.println("Member marked as recovered.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Member not found with ID: " + memberIdToMark);
            }
            break;
        case 3:
            System.out.println("All members:");
            for (AarogyaMember m : members) {
                System.out.println(m.getName() + " " + m.getAge() + " " + m.getCity() + " " + m.isRecovered());
            }
            break;
        case 4:
            System.out.println("Enter member ID to search: ");
            long memberIdToSearch = sc.nextLong();
            sc.nextLine();
            found = false;
            for (AarogyaMember m : members) {
                if (m.getId() == memberIdToSearch) {
                    System.out.println("Member found:");
                    System.out.println("Name: " + m.getName());
                    System.out.println("Age: " + m.getAge());
                    System.out.println("Gender: " + m.gender);
                    System.out.println("Aadhar Card Number: " + m.aadharCardNumber);
                    System.out.println("Contact Number: " + m.contactNumber);
                    System.out.println("City: " + m.city);
                    System.out.println("Address: " + m.address);
                    System.out.println("Date of Admission: " + m.dateOfAdmission);
                    System.out.println("Guardian Name: " + m.guardianName);
                    System.out.println("Guardian Address: " + m.guardianAddress);
                    System.out.println("Guardian Contact Number: " + m.guardianContactNumber);
                    System.out.println("Recovered: " + m.isRecovered());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Member not found with ID: " + memberIdToSearch);
            }
            break;
          case 5:
                    System.out.print("Enter member ID to update: ");
                    long updateId = sc.nextLong();
                    try {
                        updateMember(members, updateId);
                    } catch (ArogyaMemberException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                        case 6:
                    System.out.print("Enter city to search: ");
                    String searchCity = sc.nextLine();
                    System.out.print("Enter minimum age: ");
                    int minAge = sc.nextInt();
                    System.out.print("Enter maximum age: ");
                    int maxAge = sc.nextInt();
                    searchMembersByCityAndAge(members, searchCity, minAge, maxAge);
                    break;

             case 7:
                     System.out.println("Enter member ID: ");
                        long deleteId = sc.nextLong();
                        deleteMember(members, deleteId);
                        break;
            case 8:
                      System.out.println("Exiting program...");
                      System.exit(0);
                  default:
                      System.out.println("Invalid choice. Please enter a valid choice.");
                      break;
           }
        }
    }
}
