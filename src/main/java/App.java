import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());


        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getSound());

        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getSound());

        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean(HelloWorld.class);
        System.out.println(helloWorld.getMessage());

        Cat cat = (Cat) applicationContext.getBean(Cat.class);
        System.out.println(cat.getSound());

        boolean areSameReference = (bean == helloWorld);
        {System.out.println(areSameReference);}

        boolean areSameReference2 = (cat1 == cat2);
        {
            System.out.println(areSameReference2);
        }
    }
}
