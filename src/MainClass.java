public class MainClass {
    public static void main(String[] args) {
        DeskPhone phone = new DeskPhone("12345");
        phone.powerOn();
        phone.callPhone("12345");

        phone.answer();
    }
}
