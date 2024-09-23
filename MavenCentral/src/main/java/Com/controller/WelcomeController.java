package Com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //通过@Controller注解，让本类纳入SpringMVC管理范围，承担springMVC里的C角色
public class WelcomeController { //类名可自定义，关键是类里的注解与方法定义
    @RequestMapping("/welcome") //当一个HTTP请求的URL与这个路径匹配时，Spring MVC会将请求转发给这个方法处理。
    @ResponseBody //这个注解告诉Spring MVC框架，方法的返回值不应该被解释为一个视图名称，而应该直接作为HTTP响应体的内容发送给客户端。
    public String hello() {
        return "Hello World!";
    }
}

