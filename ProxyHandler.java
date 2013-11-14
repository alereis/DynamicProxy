import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
 
public class ProxyHandler implements InvocationHandler{
	
	private Object target;
 
    public ProxyHandler(Object target) {
        this.target = target;
    }
 
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Client theClient = (Client)args[0];
        System.out.println(theClient.toString());
    	
    	Object result = method.invoke(target, args); 
        return result;
    }
}