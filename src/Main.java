import singleton.DbConnection;
import singleton.DbConnectionv2;

public class Main {
    public static void main(String[] args) {
        // Singleton v1
        var dbConnection = DbConnection.getInstance();

        dbConnection.addQuery("a1");
        dbConnection.addQuery("a2");
        dbConnection.addQuery("a3");

        var dbConnection2 = DbConnection.getInstance();
        dbConnection2.addQuery("b1");
        dbConnection2.addQuery("b2");
        dbConnection2.addQuery("b3");
        dbConnection2.showQueryHistory();

        // Singleton v2
        var dbConnection3 = DbConnectionv2.INSTANCE;
        dbConnection3.addQuery("a1");
        var dbConnection4 = DbConnectionv2.INSTANCE;
        dbConnection4.addQuery("b1");
        dbConnection4.showQueryHistory();
    }
}