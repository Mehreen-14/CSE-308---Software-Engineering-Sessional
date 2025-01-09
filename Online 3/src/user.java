public class user extends transaction_abstraction{

    public user(service_implementation im){
        this.si = im;
    }

    @Override
    public void Msg() {
        this.si.msg();
    }

    @Override
    public void setID(int id) {
        this.si.setID(id);
    }

    @Override
    public void setDeposit(double deposit) {
        this.si.setDeposit(deposit);
    }

    @Override
    public int getID() {

        return this.si.getID();
    }

    @Override
    public double getdeposit() {
       // System.out.println("deposit :"+this.si.getdeposit());
        return this.si.getdeposit();
    }
}