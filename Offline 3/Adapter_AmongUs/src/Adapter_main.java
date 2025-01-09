public class Adapter_main {
    public static void main(String[] args) {
        Crew_Mates crewMate = new CrewMate();
        Imposters imposter = new Imposter();

        System.out.println("From CrewMate");
        crewMate.CMessage();
        System.out.println("From Imposter");
        imposter.IMessage();

        Adapter imp_adp = new Adapter(imposter);
        System.out.println("From Imposters who behave like Crew-mates");
        imp_adp.CMessage();
    }
}
