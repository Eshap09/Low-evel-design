package org.example.BehaviouralDesignPattern.StateDesignPattern.VendingMachineStateImpl;

import org.example.BehaviouralDesignPattern.StateDesignPattern.InventoryCollection.Coin;
import org.example.BehaviouralDesignPattern.StateDesignPattern.InventoryCollection.Item;
import org.example.BehaviouralDesignPattern.StateDesignPattern.VendingMachine;
import org.example.BehaviouralDesignPattern.StateDesignPattern.VendingMachineState;

import java.util.List;

public class IdleState implements VendingMachineState {
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on insert coin button");

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception{
        throw new Exception("you can not insert Coin in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception{
        throw new Exception("you can not choose Product in idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception{
        throw new Exception("you can not get change in idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception{
        throw new Exception("you can not get refunded in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception{
        throw new Exception("proeduct can not be dispensed idle state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }

}
