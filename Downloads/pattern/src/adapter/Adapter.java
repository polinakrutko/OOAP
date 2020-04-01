package adapter;


import java.util.HashMap;
import java.util.Map;

public class Adapter {

    // инициализация поля countries
    public static Map<String, String> countries = new HashMap<>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }
    static class IncomeDataInfo implements IncomeData{
        String countryCode;
        String company;
        String firstName;
        String lastName;
        int phoneCode;
        int phoneNumber;

        public IncomeDataInfo(String countryCode, String company, String firstName, String lastName, int phoneCode, int phoneNumber){
            this.countryCode = countryCode;
            this.company = company;
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneCode = phoneCode;
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String getCountryCode() {
            return countryCode;
        }

        @Override
        public String getCompany() {
            return company;
        }

        @Override
        public String getContactFirstName() {
            return firstName;
        }

        @Override
        public String getContactLastName() {
            return lastName;
        }

        @Override
        public int getCountryPhoneCode() {
            return phoneCode;
        }

        @Override
        public int getPhoneNumber() {
            return phoneNumber;
        }
    }

    public static class IncomeDataAdapter implements Customer, Contact{
        IncomeData incomeData;

        public IncomeDataAdapter(IncomeData i){
            incomeData = i;
        }

        @Override
        public String getCompanyName() {
            return incomeData.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(incomeData.getCountryCode());
        }

        @Override
        public String getName() {
            return incomeData.getContactLastName()+", " + incomeData.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            return "+" + incomeData.getCountryPhoneCode() + "(0" + incomeData.getPhoneNumber() / 10000000 + ")" + incomeData.getPhoneNumber() % 10000000;
        }
    }
}
