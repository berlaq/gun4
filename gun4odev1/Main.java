package gun4odev1;

public class Main {
    public static void main(String[] args){

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySQLDatabaseManager();
        customerManager.getCustomers();


    }
}
