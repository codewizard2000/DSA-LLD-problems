package com.dailycodework.dream_shops.FacadeDesignPattern;
// stru
public class CustomerServiceFacade {
    private KycService kycService;
    private TransferMoney transferMoney;

    public CustomerServiceFacade(){
        this.kycService=new KycService();
        this.transferMoney=new TransferMoney();
    }

    public void  handleCustomerInstruction(String customername, int amount){
        kycService.performKyc(customername);
        transferMoney.transferMoney(customername,amount);
    }
}
