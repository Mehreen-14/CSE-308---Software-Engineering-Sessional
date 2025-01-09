public class VendingMachine {
    private InitialState initialState;
    private Order_State order_state;
    private State state;

    private int state_no;

    private int totalProduct = 4; //total products
    private int price = 20;

    public int getTotalProduct() {
        return totalProduct;
    }

    public void setState(int s) {
        //0 - Initial State
        //1 - Order_state
        if(s==0){
            state = new InitialState(this);
        }
        else if(s==1){
           state = new Order_State(this);
        }
    }

    public void setTotalProduct(int totalProduct) {
        this.totalProduct = totalProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public VendingMachine(){
        System.out.println("SnackKeeper is here.....");
        state = new InitialState(this);
    }

    public void Processing() {

          state.BuyingItem();

    }
}
