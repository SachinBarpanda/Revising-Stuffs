public class DeskPhone implements ITelphone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber){
        this.myNumber=myNumber;
    }

    public void powerOn(){
        System.out.println("Desk phone does not have a power button.");
    }


    public void dial(int phoneNumber) {
        System.out.println("Ringing now : "+ phoneNumber + "deskPhone");
    }

    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber){
            isRinging=true;
            System.out.println("Ring Ring");
        }
        else isRinging = false;

        return isRinging;
    }

    public boolean isRinging() {
        return false;
    }
}
