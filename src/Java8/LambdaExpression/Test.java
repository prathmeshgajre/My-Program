package Java8.LambdaExpression;

import encapsulation.Student;

import java.util.*;
import java.util.function.*;

public class Test {
    public static void main(String[] args) {
        /*Runnable runnable = () -> {
            for (int i = 0; i <= 10 ; i++) {
                System.out.println(i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();


        List<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(56);
        list.add(75);
        list.add(24);
        list.add(17);
        list.add(33);

        Collections.sort(list, (a , b) -> b-a);
        System.out.println(list);*/

        /*Employee employee = new Employee() {
            @Override
            public String getSalary() {
                return "10,000";
            }

            @Override
            public String getName() {
                return "Prathm";
            }
        };
        System.out.println(employee.getName() + " " + employee.getSalary());*/


    /*private void doSomething () {
        Employee employee = () -> {
            int x = 20;
            System.out.println(x);
            return "Ram";
        };

        Employee employee1 = new Employee() {
            int x = 10;
            @Override
            public String getName() {
                System.out.println(this.x);
                return "Ram";
            }
        };*/


    /*
    --------------------------------------------------------------------------------------------------------------------------------------

    Predicate -> Boolean Valued Function
    Function -> Operation

    Consumer -> Taking Input
    Supplier ->


    Predicate<Integer> salary = x -> x > 100000;
        System.out.println(salary.test(1));             //False
     */
      /*List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
      int sum = number.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();

      int sum2 = 0;
        for (int num : number) {
            if (num % 2 == 0){
                sum2 += num;
            }
        }

        Predicate - Checking conditions

        Predicate<String> letter = x -> x.toLowerCase().charAt(0) == 'v';
        System.out.println(letter.test("Vipul"));

        and()
        Predicate<String> startWith = x -> x.toLowerCase().charAt(0) == 'p';
        Predicate<String> endsWith = x -> x.toLowerCase().charAt(x.length()-1) == 'm';
        Predicate<String> and = startWith.and(endsWith);
        System.out.println(and.test("prathm"));

        or()
        Predicate<String> startWith = x -> x.toLowerCase().charAt(0) == 'p';
        Predicate<String> endsWith = x -> x.toLowerCase().charAt(x.length()-1) == 'm';
        Predicate<String> or = startWith.or(endsWith);
        System.out.println(or.test("Jack"));

        negate()
        Predicate<String> startWith = x -> x.toLowerCase().charAt(0) == 'p';
        Predicate<String> endsWith = x -> x.toLowerCase().charAt(x.length()-1) == 'm';
        System.out.println(startWith.negate().test("prathm"));

        isEqual()
        Predicate<Object> predicate = Predicate.isEqual("Prathm");
        System.out.println(predicate.test("Prathm"));

        Function

        apply()
        Function<String,Integer> function = x -> x.length();
        System.out.println(function.apply("Prathm"));

        Function<String,String> function = x -> x.substring(0,4);
        System.out.println(function.apply("Prathm"));
        //Prat

        Function Chaining

        andThen()
        Function<String,String> function = x -> x.toUpperCase();
        Function<String,String> function1 = x -> x.substring(0,6);

        Function<String, String> stringStringFunction = function.andThen(function1);
        System.out.println(stringStringFunction.apply("Prathmesh"));

        System.out.println(function.andThen(function1).apply("Prathmesh"));

        andThen()
        Function<Integer,Integer> function1 = x -> 2 * x;
        Function<Integer,Integer> function2 = x -> x * x * x;

        System.out.println(function1.andThen(function2).apply(3));  //216
        System.out.println(function2.andThen(function1).apply(3));  //54

        compose() => work same like andThen
        System.out.println(function1.compose(function2).apply(3));  //54

        identity() => Whatever you give in input you get same output.
        Function<String, String> identity = Function.identity();
        System.out.println(identity.apply("Prathm"));

-------------------------------------------------------------------------------------------------------------
        Consumer

        accept()
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello");

        Consumer<List<Integer>> listConsumer = li -> {
            for (Integer i : li) {
                System.out.println(i + 200);
            }
        };
        listConsumer.accept(Arrays.asList(1,2,3,4,5));

        andThen()
        Consumer<List<Integer>> listConsumer1 = li -> {
            for (Integer i : li) {
                System.out.println(i + 200);
            }
        };
        Consumer<List<Integer>> listConsumer2 = li -> {
            for (Integer i : li) {
                System.out.println(i);
            }
        };
        listConsumer1.andThen(listConsumer2).accept(Arrays.asList(1,2,3,4));

------------------------------------------------------------------------------------------------------------
        Supplier

        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());

        Supplier<Integer> supplier1 = () -> (int) (Math.random() * 100);
        System.out.println(supplier1.get());

-------------------------------------------------------------------------------------------------------------

        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }

------------------------------------------------------------------------------------------------------------
        Bi-Pedicate

        and()
        negate()
        or() in Bi-Predicate

        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x % 2 == 0 || y % 2 == 0;
        System.out.println(biPredicate.test(40, 7));

        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x % 2 == 0 && y % 2 == 0;
        System.out.println(biPredicate.test(40, 7));
        -----------------------------------------------------------------------------------
        Bi-Function
        BiFunction<String,String ,Integer> biFunction = (x,y) -> x.length() + y.length();
        System.out.println(biFunction.apply("Hiii","Java"));

       andThen() in Bi-Function
       ---------------------------------------------------------------------------------------
       Bi-Consumer
       BiConsumer<Integer, Integer> biConsumer = (x,y) -> System.out.println(x+y);
       biConsumer.accept(1,2);          //3

       BiConsumer<String, String>  biConsumer1 = (x,y) -> System.out.println(x+y);
       biConsumer1.accept("Hiii","Java");       //HiiiJava

       BiConsumer<String, Integer>  biConsumer2 = (x,y) -> System.out.println(x+y);
       biConsumer2.accept("Hiii",1);            //Hiii1

       BiConsumer<Integer, String>   biConsumer3 = (x,y) -> System.out.println(x+y);
       biConsumer3.accept(5,"Ram");         //5Ram

       andThen() in Bi-Consumer

-----------------------------------------------------------------------------------------------------------
UnaryOperator and BinaryOperator

    UnaryOperator<Integer>  operator = x -> x * x;
        System.out.println(operator.apply(5));

    UnaryOperator<String> operator = str -> str.toUpperCase();
        System.out.println(operator.apply("Hello"));

    BinaryOperator<String> operator = (str1 ,str2) -> str1 + str2;
        System.out.println(operator.apply("Ram"," Lakhan"));


















        */

        BinaryOperator<String> operator = (str1 ,str2) -> str1 + str2;
        System.out.println(operator.apply("Ram"," Lakhan"));




    }

}
