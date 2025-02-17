package reflection.advance.custom_log_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GreetingHandler implements InvocationHandler {
    private Object target;
    public GreetingHandler(Object target){
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method,Object args[]) throws InvocationTargetException, IllegalAccessException {
        System.out.println("Logging before saying hello");
        Object result=method.invoke(target,args);
        System.out.println("Done greeting now go");
        return result;
    }

}
