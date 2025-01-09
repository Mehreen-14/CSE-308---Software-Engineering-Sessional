public class D_Harai extends service_implementation {
    int id;
    double deposit;
    @Override
    public void setID(int id) {
        this.id = id;
    }

    @Override
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
    @Override
    public int getID() {
       // System.out.println("D_Harai");
        System.out.println("ID");
        return id;
    }

    @Override
    public double getdeposit() {

        System.out.println("Deposit");
        return deposit;
    }

    @Override
    public void msg() {
        System.out.println("D_Harai");
    }
}
