public abstract class transaction_abstraction {
    service_implementation si;
    int id;
    double deposit;
    public abstract void Msg();
    public abstract void setID(int id);
    public abstract void setDeposit(double deposit);
    public abstract int getID();
    public abstract double  getdeposit();
    public void change_service(service_implementation im){
        this.si=im;
    }
}
