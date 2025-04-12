import java.sql.SQLException;
public class ex6 {
    interface DatabaseActions {
        void connect();
        void executeQuery(String query) throws SQLException;
    }
    static class FakeDatabase implements DatabaseActions {
        boolean online;
        public FakeDatabase(boolean online) {
            this.online = online;
        }
        public void connect() {
            if (!online) throw new IllegalStateException("Database is offline");
            System.out.println("Connected to database");
        }
        public void executeQuery(String query) throws SQLException {
            if (query == null || !query.trim().toUpperCase().startsWith("SELECT"))
                throw new SQLException("Invalid query");
            System.out.println("Query executed: " + query);
        }
    }
    public static void main(String[] args) {
        FakeDatabase db1 = new FakeDatabase(false);
        try {
            db1.connect();
        } catch (IllegalStateException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
        FakeDatabase db2 = new FakeDatabase(true);
        try {
            db2.connect();
            db2.executeQuery("UPDATE table");
        } catch (IllegalStateException e) {
            System.out.println("Connection error: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Query error: " + e.getMessage());
        }
    }
}
