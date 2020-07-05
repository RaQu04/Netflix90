package pl.yellowduck.netflix90;

public class Main4 {
    public static void main(String[] args) {

        try {
            test();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void test() throws IllegalStateException {
        if (true) {
            throw new IllegalStateException("error");
        }

        System.out.println("After error");
    }
}
