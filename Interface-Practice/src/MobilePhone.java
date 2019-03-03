public class MobilePhone implements ITelphone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber){
        this.myNumber=myNumber;
    }

    public void powerOn(){
        isOn=true;
        System.out.println("Desk phone does not have a power button.");
    }


    public void dial(int phoneNumber) {
        if(isOn)
        System.out.println("Ringing now : "+ phoneNumber + "Mobile Phone");
        else System.out.println("Phone is switched off");
    }

    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber){
            isRinging=true;
            System.out.println("Melody Ring");
        }
        else {
            isRinging = false;
            System.out.println("Wrong number ");
        }

        return isRinging;
    }

    public boolean isRinging() {
        return false;
    }
}

