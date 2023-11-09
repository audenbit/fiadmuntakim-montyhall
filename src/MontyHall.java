public class MontyHall {
    private int goat1;
    private int goat2;
    private int car;
    private int revealedGoatDoor;
    private int userDoorGuess;


    public MontyHall(int goat1, int goat2, int car, int userDoorGuess) {
        this.goat1 = goat1;
        this.goat2 = goat2;
        this.car = car;
        this.userDoorGuess = userDoorGuess;
    }

    public int getUserDoorGuess() {
        return userDoorGuess;
    }

    public int checkUserFirstPick(int userDoorGuess) {
        if (userDoorGuess == car) {
            int randomGoatDoorReturn = (int) (Math.random() * (2 - 1 + 1)) + 1;
            if (randomGoatDoorReturn == 1) {revealedGoatDoor = goat1;} else {revealedGoatDoor = goat2;}
        } else if (userDoorGuess == goat1) {
            revealedGoatDoor = goat2;
        } else if (userDoorGuess == goat2) {
            revealedGoatDoor = goat1;}
        return revealedGoatDoor;
    }

    public void checkIfSwitch(String switchChoice) {
        if (switchChoice.equals("Yes")) {
            if ((userDoorGuess == 1 && revealedGoatDoor == 2) || (userDoorGuess == 2 && revealedGoatDoor == 1)) {
                userDoorGuess = 3;
            } else if ((userDoorGuess == 1 && revealedGoatDoor == 3) || (userDoorGuess == 3 && revealedGoatDoor == 1)) {
                userDoorGuess = 2;
            } else if ((userDoorGuess == 2 && revealedGoatDoor == 3) || (userDoorGuess == 3 && revealedGoatDoor == 2)) {
                userDoorGuess = 1;
            }
        }
    }


    public boolean checkUserEqualCar(int userDoorGuess) {
        return userDoorGuess == car;
    }
}
