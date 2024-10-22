public class BankAccount {
    private double saldo;

    public BankAccount(){
        saldo = 0;
    }

    public double cekSaldo(){
        return saldo;
    }

    public void depositSaldo(double saldo){
        this.saldo += saldo;
    }

    public void withdrawSaldo(double saldo){
        if(this.saldo >= saldo){
            this.saldo -= saldo;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
