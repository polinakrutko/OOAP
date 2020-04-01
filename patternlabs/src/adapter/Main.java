package adapter;

public class Main {

    public static void main(String[] args){
        Adapter.IncomeDataAdapter incomeDataAdapter = new Adapter.IncomeDataAdapter(
                new Adapter.IncomeDataInfo(
                        "UA",
                        "JavaRush Ltd.",
                        "Ivan",
                        "Ivanov",
                        38,
                        501234567));
        System.out.println(incomeDataAdapter.getCompanyName());
        System.out.println(incomeDataAdapter.getCountryName());
        System.out.println(incomeDataAdapter.getName());
        System.out.println(incomeDataAdapter.getPhoneNumber());
    }
}
