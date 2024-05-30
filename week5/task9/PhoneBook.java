package week5.task9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneBook {
    private List<String> data;

    public PhoneBook(){
        this.data = new ArrayList<>();
    }

    public void insert(String name, String phoneNumber){
        data.removeIf(entry -> entry.endsWith("-" + phoneNumber));
        data.add(name + "-" + phoneNumber);
    }

    public boolean deleteByPhoneNumber(String phoneNumber){
        return data.removeIf(entry -> entry.endsWith("-" + phoneNumber));
    }

    public List<String> getAllNamesStartingWith(String prefix){
        List<String> result = new ArrayList<>();
        for (String entry : data) {
            String name = entry.split("-")[0];
            if(name.startsWith(prefix)){
                result.add(entry);
            }
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
}


