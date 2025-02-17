package reflection.advance.custom_log_proxy;

public class ActualGreeting implements Greetings {

    @Override
    public void sayHello() {
        System.out.println("Hello from Kali Linux");
    }
}
