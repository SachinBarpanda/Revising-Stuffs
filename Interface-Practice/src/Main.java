public class Main {
    public static void main(String[] args) {
        ITelphone SamsPhone;
//        SamsPhone = new DeskPhone(977645821);
//        SamsPhone.powerOn();
//        SamsPhone.isRinging();
//        SamsPhone.callPhone(85214756);
//        SamsPhone.answer();

        SamsPhone = new MobilePhone(982339399);
        SamsPhone.callPhone(982339399);
        SamsPhone.answer();
    }
}
