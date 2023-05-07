package singleton;

public class DbConnection {

    private static DbConnection dbConnection;

    private static String queryHistory = "History:\n";

    public static DbConnection getInstance(){
        if (dbConnection==null) dbConnection = new DbConnection();
        return dbConnection;
    }

    public void addQuery(String query){
        queryHistory+=query+"\n";
    }

    public void showQueryHistory(){
        System.out.println(queryHistory);
    }
}
