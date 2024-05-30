package week8.task6;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<String> data;
    private static final int MAX_NAME_LENGTH = 26;
    private static final String PHONE_NUMBER_REGEX = "\\D{10}";
    private static final int MAX_RECORDS = 100;

    public PhoneBook() {
        this.data = new ArrayList<>();
    }

    public void insert(String name, String phoneNumber) throws  PhoneBookFullException{
        validateInput(name, phoneNumber);

        if(data.size() >= MAX_RECORDS){
            throw new PhoneBookFullException("PhoneBook is full. Cannot insert more records.");
        }

        data.removeIf(entry -> entry.endsWith("-" + phoneNumber));
        data.add(name + "-" + phoneNumber);
    }

    public boolean deleteByPhoneNumber(String phoneNumber) throws  EntryNotFoundException{
        if(data.removeIf(entry->entry.endsWith("-" + phoneNumber))){
            return true;
        }else{
            throw new EntryNotFoundException("Entry not found for phone number: " + phoneNumber);
        }
    }

    public List<String> getAllNamesStartingWith(String prefix) throws  EntryNotFoundException{
        List<String> result = new ArrayList<>();
        for (String entry : data) {
            String name = entry.split("-")[0];
            if (name.startsWith(prefix)) {
                result.add(entry);
            }
        }
        if(result.isEmpty()){
            throw new EntryNotFoundException("No entries found starting with the specified prefix.");
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String entry : data) {
            result.append(entry).append("\n");
        }
        return result.toString();
    }

    private void validateInput(String name, String phoneNumber){
        if(name.length() > MAX_NAME_LENGTH){
            throw new IllegalArgumentException("Name length exceeds the maximum allowed length of 26 characters.");
        }

        if(!phoneNumber.matches(PHONE_NUMBER_REGEX)){
            throw new IllegalArgumentException("Invalid phone number format. Please enter a 10-digit number.");
        }
    }

    private boolean isValidPhoneNumber(String phoneNumber){
        if(phoneNumber.length() != 10){
            return false;
        }

        for (char digit : phoneNumber.toCharArray()) {
            if(!Character.isDigit(digit)){
                return false;
            }
        }
        return true;
    }
}


