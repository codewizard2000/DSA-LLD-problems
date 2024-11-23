package com.dailycodework.dream_shops.FacadeDesignPattern;

public class Main {
    public static void main(String[] args){
        CustomerServiceFacade customerServiceFacade= new CustomerServiceFacade();
        customerServiceFacade.handleCustomerInstruction("rishav",100);
    }
}
