public class Adapter implements Crew_Mates{
    Imposters imposters;
    public Adapter(Imposters imposters){
        this.imposters = imposters;
    }
    @Override
    public void CMessage() {
       imposters.IMessage();
    }
}
