package com.Encapsulation.Oops;

public class EncapsulationExamp {
    private int data;
    
    // Getter method to access data
    public int getData() {
        return data;
    }

    // Setter method to set data
    public void setData(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        EncapsulationExamp obj = new EncapsulationExamp();

        // Setting the value using setter method
        obj.setData(5);

        // Getting the value using getter method
        System.out.println("Value of data: " + obj.getData());
    }
}