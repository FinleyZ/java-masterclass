package academy.learningJava;

public class House {
    private BathRoom bathRoom;
    private LivingRoom livingRoom;
    private Kitchen kitchen;
//    private Person thePerson;

    public House(BathRoom bathRoom, LivingRoom livingRoom, Kitchen kitchen) {
        this.bathRoom = bathRoom;
        this.livingRoom = livingRoom;
        this.kitchen = kitchen;
//        this.thePerson = thePerson;
    }

    public BathRoom getBathRoom() {
        return bathRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

//    public Person getThePerson() {
//        return thePerson;
//    }

    public void whoInTheRoom(){
        if (getBathRoom().isCatBath() && getBathRoom().getPersonInBathRoom().isCat()){
            System.out.println("Pinko is peeing peeing ");
        }else {
            System.out.println( "pinko is not in the bathroom");
        }

        if (getBathRoom().getPersonInBathRoom().isYiLing() && getBathRoom().isToilet()){
            System.out.println("Yiling is peeing peeing");
        } else{
                System.out.println("Yiling is not in the bathroom" );
            }

        if (getKitchen().isStove()&& getKitchen().getPersonInKitchen().isYiLing()){
            System.out.println("Yiling is cooking ");
        }else{
            System.out.println("Yiling is not in the kitchen");
        }

        if (getKitchen().isStove() && getKitchen().getPersonInKitchen().isCat()){
            System.out.println("Pinko is hungry");
        }else{
            System.out.println("Pinko is not in the kitchen");
        }

        if (getLivingRoom().isSofa()&&getLivingRoom().getPersonInLivingRoom().isCat() && getLivingRoom().getPersonInLivingRoom().isYiLing()){
            System.out.println("Pinko is sleeping on Yiling's lap");
        }else if (getLivingRoom().isSofa()&&getLivingRoom().getPersonInLivingRoom().isCat()){
            System.out.println("Pinko is eating flower");
        }else if (getLivingRoom().isSofa()&&getLivingRoom().getPersonInLivingRoom().isYiLing()){
            System.out.println("yiling is playing switch");
        }else{
            System.out.println("Nobody at living room");
        }

        }
}
