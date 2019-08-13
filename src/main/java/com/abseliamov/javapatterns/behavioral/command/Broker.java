package com.abseliamov.javapatterns.behavioral.command;

public class Broker {
    Order buy;
    Order sell;

    public Broker(Order buy, Order sell) {
        this.buy = buy;
        this.sell = sell;
    }

    public void buyProduct() {
        buy.execute();
    }

    public void sellProduct() {
        sell.execute();
    }

//    private List<Order> orderList = new ArrayList<>();
//
//    public void takeOrder(Order order){
//        orderList.add(order);
//    }
//
//    public void executeOrder(){
//        for (Order order: orderList){
//            order.execute();
//        }
//        orderList.clear();
//    }
}
