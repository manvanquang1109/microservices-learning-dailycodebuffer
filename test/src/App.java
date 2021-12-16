public class App {

    public static void main(String []args) {
        App h = new App();
        Integer a = 1;
        Integer b = h.test(a);

        System.out.println(a);
        System.out.println(b);
    }

    public Integer test(Integer a) {
        a = 2;
        return a;
    }
}
