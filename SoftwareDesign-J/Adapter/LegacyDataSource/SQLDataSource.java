package Adapter.LegacyDataSource;

public class SQLDataSource implements DataSource {
    @Override
    public String fetchDataSource(String query) {
        return "Executing SQL query: " + query;
    }
}
