package ku;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Pornpavee Seri-umnuoy
 */
public class Recursion {

    public static void main(String[] args) {
        List<String> test1 = new ArrayList<>();
        test1.add("a");
        test1.add("b");
        test1.add("b");
        test1.add("b");
        test1.add("c");
        test1.add("b");
        test1.add("c");
        test1.add("c");

        System.out.println(unique(test1));

        for(int i = 0; i<=10;i++) System.out.print(fibonacciSample(i) + " ");

        System.out.println();

        for(int i = 0; i<=10;i++) System.out.print(fibonacci(i) + " ");
    }

    /**
     * Remove duplicate consecutive items from a list, changing the list parameter.
     * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list
     * will contain {a, b, c, b, c}. Only consecutive duplicates are removed.
     * Objects are compared using their own equals method.
     * @param list of any kind of object. The elements are not null.
     * @return reference to the list parameter with consecutive duplicates removed.
     */
    public static List<?> unique(List list){
        if(list.size() > 1) {

            if (list.get(0).equals(list.get(1))) {
                list.remove(0);
                unique(list);
            } else unique(list.subList(1, list.size()));
        }
        return list;
    }

    /**
     * Starter fibonacci code
     */
    public static long fibonacciSample(int n) {
        // the base case
        if (n < 2) return 1;
        // the recursive step
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static long fibonacci(int n) {
        return fibonacciHelper(n,1,1);
    }

    /**
     * A mathod for find fibonacci number
     * start at f(0) = 1
     * @param n the fibonacci that you want to find
     * @param num1 first fibonacci number
     * @param num2 second fibonacci number
     * @return current fibonacci number
     */
    public static long fibonacciHelper(int n,int num1,int num2){
        if(n == 0) return num1;
        return fibonacciHelper(n-1,num2,num1+num2);
    }

}
