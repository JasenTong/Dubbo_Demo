package org.apache.dubbo.demo.provider;


import org.apache.dubbo.demo.DemoService;

public class DemoServiceImpl implements DemoService {
    /**
     * 提供者
     *
     * @param name 调用内容
     * @return     字符串
     */
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
