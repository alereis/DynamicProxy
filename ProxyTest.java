import java.lang.reflect.Proxy;
 
public class ProxyTest {
 
    public static void main(String[] args) {
    	
    	Client plainClient = new Client();
 
    	EmploymentRecord proxiedClient = (EmploymentRecord) Proxy.newProxyInstance(plainClient.getClass().getClassLoader(),
        plainClient.getClass().getInterfaces(), new ProxyHandler(plainClient));
 
        System.out.print("Call to method without using the proxy.\n");
        plainClient.Create(plainClient);
 
        System.out.println("-------------------------------------------------------");
        System.out.println("Call to method using the proxy.");
        proxiedClient.Create(plainClient);
        
        proxiedClient.Remove(plainClient);
    }
}