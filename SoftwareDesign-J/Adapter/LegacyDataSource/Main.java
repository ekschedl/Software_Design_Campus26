package Adapter.LegacyDataSource;

public class Main {
    public static void main(String[] args) {
        LegacySystem legacySystem = new LegacySystem();
        DataSource sqlDataSource = new SQLDataSource();

        DataSource legacySystemAdapted = LegacyAdapter.getInstance(legacySystem);
        
        System.out.println(legacySystemAdapted.fetchDataSource("Select*"));
    }
}
