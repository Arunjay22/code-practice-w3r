package LambdaExpression;

// (interfaces with exactly one abstract method, such as Runnable or Comparator)
interface Summation{
    int add(int a, int b);
}
public class Ex1  {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Summation summation = (a1, b1) -> a1 + b1;

        int add = summation.add(a, b);
        System.out.println(add);

    }
}
