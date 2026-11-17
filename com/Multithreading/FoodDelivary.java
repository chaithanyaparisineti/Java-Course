package com.Multithreading;
class Food {
    boolean isDelivered = false;
    synchronized void RecivedFood() {
        System.out.println("Customer: Waiting for Food...");
        while (!isDelivered) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Customer: Food Received!");
        System.out.println("Enjoy Your Food...");
    }
    synchronized void DeliveredFood() {
        System.out.println("Delivery: Food is being delivered...");
        isDelivered = true;
        System.out.println("Delivery: Food delivered successfully!");
        notify();
    }
}
class Customer extends Thread {
    Food food;
    Customer(Food food) {
        this.food = food;
    }
    public void run() {
        food.RecivedFood();
    }
}
class Delivery extends Thread {
    Food food;
    Delivery(Food food) {
        this.food = food;
    }
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        food.DeliveredFood();
    }
}
public class FoodDelivary {
    public static void main(String[] args) {
        Food food = new Food();
        Customer customer = new Customer(food);
        Delivery delivery = new Delivery(food);
        customer.start();
        delivery.start();
    }
}
