class bank {
    private int balance= 1000;

    void deposit(int amount){
        balance = balance + amount;
    }
    void showbalanace(){
        System.out.println(balance);
    }
    
}

public class encapsulation{
    public static void main(String[] args) {
        bank b = new bank();
        b.deposit(100);
        b.showbalanace();

    }
}