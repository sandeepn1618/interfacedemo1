public class MobilePhone {
    public static void main(String[] args) {

        IMobilePhone mobile = new IMobilePhone("9491046395");
        mobile.powerOn();
        mobile.callPhone("9491046395");
        mobile.isRinging();
        mobile.answer();
    }
}
