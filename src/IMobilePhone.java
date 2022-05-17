public class IMobilePhone implements  Telephone {

    private String myNumber;
    private boolean isRinging;

    private  boolean isPowerOn;

    public IMobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone is turned on");
    }

    @Override
    public void dailNumber(String phoneNumber) {
        System.out.println("Now ringing" + phoneNumber);
    }

    @Override
    public void answer() {
        if (isRinging && isPowerOn) {
            System.out.println("Answering the mobilePhone");
            isRinging = false;
        } else{

        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber && isPowerOn) {
            isRinging = true;
            System.out.println("Phone is Ringing");
        } else{
            isRinging = false;
            System.out.println("Phone is turned off or wrong number entered");
        }
        return isRinging;
    }


    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
