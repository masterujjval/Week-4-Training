package reflection.advance.dependency_injection;
public class Main {
    public static void main(String[] args) throws Exception {
        Client client = new Client(); // Client object create kiya
        SimpleDIContainer.injectDependencies(client); // Dependencies inject ki
        client.clientCall(); // Service method call kiya
    }
}
