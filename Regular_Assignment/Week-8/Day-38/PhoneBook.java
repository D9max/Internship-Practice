public class Phonebook {
    private PhoneNumber[] phoneNumbers;
    private int numEntries;

    public Phonebook(int maxEntries) {
        phoneNumbers = new PhoneNumber[maxEntries];
        numEntries = 0;
    }

    public void addEntry(String name, String phoneNumber) {
        if (numEntries < phoneNumbers.length) {
            phoneNumbers[numEntries] = new PhoneNumber(name, phoneNumber);
            numEntries++;
        }
    }

    public String searchByName(String name) {
        for (int i = 0; i < numEntries; i++) {
            if (phoneNumbers[i].getName().equals(name)) {
                return phoneNumbers[i].getPhoneNumber();
            }
        }
        return null;
    }

    public String searchByPhoneNumber(String phoneNumber) {
        int left = 0;
        int right = numEntries - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = phoneNumbers[mid].getPhoneNumber().compareTo(phoneNumber);
            if (compare == 0) {
                return phoneNumbers[mid].getName();
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    private class PhoneNumber {
        private String name;
        private String phoneNumber;

        public PhoneNumber(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
    }
}
