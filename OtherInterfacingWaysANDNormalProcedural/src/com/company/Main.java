package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        messagePassing();
        sharedMemory();
        proceduralInterfacing();

    }

    public static void messagePassing(){
        messagePasser();
    }

    public static void messagePasser(){
        //Pass a message to its receiver whenever its counting index reaches or passes the value 10
        boolean message = false;

        for(int i = 0; ;i++){
            if(i == 10){
                messageReciever(message);
                break;
            }
        }
    }

    public static void messageReciever(boolean message){
        boolean messagerecieved = false;

        messagerecieved = message;

        if(messagerecieved){
            System.out.println("Message has been recieved from messagePasser");
            System.out.println("Value of Message is: " + message);
        }
    }

    public static void sharedMemory(){
       int[] sharedArray = new int[20] ;
        operationOneUsingSharedMemory(sharedArray);
        operationTwoUsingSharedMemory(sharedArray);
    }

    public static void operationOneUsingSharedMemory(int[] array){
        //Fill the array with data
        Random rand = new Random();
        for(int i = 0; i < array.length ; i++){
            array[i] = rand.nextInt(100);
            System.out.println(array[i] + " has been added to the index " + i + " of the array");
        }
    }

    public static void operationTwoUsingSharedMemory(int[] array){
        //Access and print
        for(int i = 0; i < array.length ; i++){
            System.out.println("Value at index " + i + " of the array is: " + array[i]);
        }
    }

    public static void proceduralInterfacing(){
        System.out.println("ProceduralInterfacing: Call procedure");
        System.out.println("ProceduralInterfacing: A random number generated in the range of 100 is :" + procedure());
        System.out.println("Procedural Interfacing: Control returned to Main");
    }

    public static int procedure(){
        System.out.println("Procedure: The call method is called from the running part of the code(proceduralInterfacing) and giving it control till it finish's execution");
        Random rand = new Random();
        int number = rand.nextInt(100);
        return number;
    }
}
