package topic6;

public class exercise61 {
    public static void main(String[] args) {
        Tester tester1 = new Tester();
            tester1.setName("Nuno");
            tester1.setMindset("Focused");
            tester1.setTesterByChance(true);
            tester1.setLongToenails(10);

        Tester tester2 = new Tester();
            tester2.setName("Artur");
            tester2.setMindset("Determined");
            tester2.setTesterByChance(false);
            tester2.setLongToenails(15);

        System.out.println("The tester 1 is named " + tester1.getName() + " he is " + tester1.getMindset() + ". Is he a tester? " + tester1.getTesterByChance() + " and his toenails are " + tester1.getLongToenails() + " cm.");
        tester1.isTesterByChance = false;
        System.out.println("Is tester 1 a tester? " + tester1.getTesterByChance());
        tester2.mindset = "Focused";
        System.out.println(tester2.getMindset());
        System.out.println("testerLongNails");
    }

}
