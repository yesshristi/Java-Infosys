public class EventRegistration {
    String name;
    String nameOfEvent;
    double registrationFee;

    EventRegistration(String name, String nameOfEvent){
        this.name = name;
        this.nameOfEvent = nameOfEvent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }

    public double getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public void registerEvent() {
        if(nameOfEvent.equals("ShakeALeg")) 
            registrationFee = 100;
        else if(nameOfEvent.equals("Sing&Win")) 
            registrationFee = 150;
        else if(nameOfEvent.equals("Actathon")) 
            registrationFee = 70;
        else if(nameOfEvent.equals("PlayAway")) 
            registrationFee = 130;

        System.out.println("Thank you " + getName() + " for your participation. Your registration fee is " + getRegistrationFee());
    }
}

 class SingleEventRegistration extends EventRegistration {
    int participantNo;

    SingleEventRegistration(String name, String nameOfEvent, int participantNo){
        super(name, nameOfEvent);
        this.participantNo = participantNo;
    }

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }

    @Override
    public void registerEvent() {
        if(getNameOfEvent().equals("ShakeALeg")) 
            setRegistrationFee(100);
        else if(getNameOfEvent().equals("Sing&Win")) 
            setRegistrationFee(150);
        else if(getNameOfEvent().equals("PlayAway")) 
            setRegistrationFee(130);

        System.out.println("Thank you " + getName() + " for your participation. Your registration fee is " + getRegistrationFee());
        System.out.println("Your participant number is: " + getParticipantNo());
    }

    public static void main(String[] args) {
        SingleEventRegistration eventReg = new SingleEventRegistration("John", "Sing&Win", 5);
        eventReg.registerEvent();
    }
}
