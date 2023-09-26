package Day22_09;
interface AnonymousInterface {
    void info();
}

public class Anonymous {
    public static void main(String[] args) {
        AnonymousInterface anonymous = new AnonymousInterface() {
            @Override
            public void info() {
                System.out.println("Anonymous Class!");
            }
        };

        anonymous.info();
    }
}
