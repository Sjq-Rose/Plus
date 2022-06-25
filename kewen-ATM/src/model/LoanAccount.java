package model;

public class LoanAccount  extends  Account{
    //ÉêÇë´û¿î
    private double loaning;

    public LoanAccount(double loaning) {
        this.loaning = loaning;
    }

    public LoanAccount(long id, String password, String name, String personID, String tel, double balance, int type, double loaning) {
        super(id, password, name, personID, tel, balance, type);
        this.loaning = loaning;
    }

    public void  LoanApplica(double money){

    }



}
