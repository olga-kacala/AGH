public class Example {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int d = a += b += c;
        System.out.println("d=" + d);

        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);
    }
}

// The expression a += b += c is equivalent to a = a + (b = b + c)