package org.apache.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class provider {
    public static void main(String[] args) throws Exception {
       System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/Spring/dubbo_demo_provider.xml"});
        context.start();
        System.out.println("Provider started.");
        System.in.read(); // press any key to exit
    }
}
