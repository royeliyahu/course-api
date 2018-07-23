package io.javabrains.springbootstarter;
import io.javabrains.springbootstarter.java8.Greeter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {
    public static void main(String[] args) {
        SpringApplication.run(CourseApiApp.class, args);

        Greeter greeter = new Greeter();

        greeter.Greet();

        MyLambda myLambdaFunc = () -> System.err.println("printing my LAmbda!!");

        MyLambdaAdd addddd = (int a, int b) -> a+b;


        solution(345, 239325090);



    }

    public static int solution(int A, int B) {
        // write your code in Java SE 8

       int[] a = new int[6];

        System.err.println(a.length);
//        Math.m
        return 1;
    }
}


interface MyLambda{
    void foo();


}

interface MyLambdaAdd{
     int add(int a, int b);
}
