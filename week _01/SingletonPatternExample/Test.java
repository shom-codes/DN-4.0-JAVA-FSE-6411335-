package SingletonPatternExample;

public class Test {
    public static void main(String[] args) {
        Logger lg1 = Logger.getInstance();

        Logger lg2 = Logger.getInstance();

        if(lg1 == lg2){
            System.out.println("\nSame instance\n");
        } else {
            System.out.println("\ndifferent instance\n");
        }

        lg1.log("check your inbox\n");
    }
}
