package singleton;

public enum DbConnectionv2 {
    INSTANCE;

    String queryHistory = "History:\n";

    public void addQuery(String query){
        queryHistory+=query+"\n";
    }

    public void showQueryHistory(){
        System.out.println(queryHistory);
    }
}
