package reflection.advance.dependency_injection;

// here in this class we are using dependancy
public class Client {
    @Inject
    private Service service;
    public void clientCall(){
        service.showMessage();
    }
}
