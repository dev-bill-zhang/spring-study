package top.windtown;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.windtown.model.User;

/**
 * @author bill
 * @className Program
 * @description TODO
 * @date 2020/8/12 23:53
 * @modified By
 */
public class Program {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user =  context.getBean("user", User.class);
        user.add();
    }
}
