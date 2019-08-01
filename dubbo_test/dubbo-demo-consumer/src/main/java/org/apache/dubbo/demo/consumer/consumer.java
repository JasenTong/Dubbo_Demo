package org.apache.dubbo.demo.consumer;
import org.apache.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class consumer {
    /**
     * 消费者
     * @param args       数组指针
     * @throws Exception  抛出异常
     */
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/Spring/dubbo_demo_consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        DemoService demoService = (DemoService)context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHello("world");
        // Display the call result
        System.out.println(hello);
    }
}
