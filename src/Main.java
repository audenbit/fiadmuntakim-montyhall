import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // setting doors
        int goat1;
        int goat2;
        int car;
        car = (int) (Math.random() * (3 - 1 + 1)) + 1;
        if (car == 1) {
            goat1 = (int) (Math.random() * (3 - 2 + 1)) + 2;
            if (goat1 == 2) {goat2 = 3;} else {goat2 = 2;}
        } if (car == 2) {
            int goat1Choice2 = (int) (Math.random() * (2 - 1 + 1)) + 1; // will later decide of goat1 is 1 or 3
            if (goat1Choice2 == 1) {goat1 = 1;} else {goat1 = 3;}
            if (goat1 == 1) {goat2 = 3;} else {goat2 = 1;}
        } else  {
            int goat1Choice3 = (int) (Math.random() * (2 - 1 + 1)) + 1; // will later decide of goat1 is 1 or 2
            if (goat1Choice3 == 1) {goat1 = 1;} else {goat1 = 2;}
            if (goat1 == 1) {goat2 = 2;} else {goat2 = 1;}
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Monty Hall game!");
        System.out.println("There are two goats and a car randomly placed behind doors 1, 2, and 3");
        System.out.print("Where do you think the car is? Enter 1, 2, or 3 -> ");
        int userGuess = sc.nextInt();
        sc.nextLine();
        MontyHall monty = new MontyHall(goat1, goat2, car, userGuess);
        System.out.println("One of the goats is behind door number " + monty.checkUserFirstPick(userGuess));
        System.out.print("Do you want to switch your guess? (Yes/No) -> ");
        String switchInput = sc.nextLine();
        monty.checkIfSwitch(switchInput);
        userGuess = monty.getUserDoorGuess();

        if (monty.checkUserEqualCar(userGuess)) {
            System.out.println("The car is behind door " + car + ". You won!");
        } else {
            System.out.println("The car is behind door " + car + ". You lost :( (Or you could say you won a goat!)");
        }
    }
}
