 class Bank{
    void rateofinterest(){
        System.out.println("Bank gives interest");
    }
    
}
class sbi extends Bank{
    void sbiloan(){
        System.out.println("Sbi provides Loan");
    }
}
class hdfc extends Bank{
    void hdfccredit(){
        System.out.println("Hdfc Bank provide creadit card");
    }
}
public class Ex_Inhetance{
    public static void main(String[] args) {
        sbi a=new sbi();
        a.rateofinterest();
        a.sbiloan();

        hdfc c=new hdfc();
        c.rateofinterest();
        c.hdfccredit();
    }
}