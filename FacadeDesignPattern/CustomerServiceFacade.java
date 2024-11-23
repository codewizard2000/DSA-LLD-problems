package com.dailycodework.dream_shops.FacadeDesignPattern;
// this is a part of strutural design pattern where customer service facade will hanlde all operations to make easy for client to call one method and rest will e handled automatially
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
