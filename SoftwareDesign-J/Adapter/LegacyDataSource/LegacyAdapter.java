package Adapter.LegacyDataSource;


public class LegacyAdapter implements DataSource {

   private LegacySystem legacySystem;
   private static LegacyAdapter instance;

    private LegacyAdapter(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    public static LegacyAdapter getInstance(LegacySystem legacySystem) {
       if (instance == null) {
           instance=new LegacyAdapter(legacySystem);
       }
       return instance;
   }


    @Override
    public String fetchDataSource(String query) {
        return legacySystem.getData(query);
    }
}
