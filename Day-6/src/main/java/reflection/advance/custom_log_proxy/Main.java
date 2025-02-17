package reflection.advance.custom_log_proxy;

import java.lang.reflect.Proxy;
// moooooost important
public class Main {
    public static void main(String[] args) {
        ActualGreeting greet=new ActualGreeting();

        // creating proxy insttance
        Greetings instance=(Greetings) Proxy.newProxyInstance(
                ActualGreeting.class.getClassLoader(),
                new Class[] {Greetings.class},
                new GreetingHandler(greet)
        );
        instance.sayHello();

    }
}
