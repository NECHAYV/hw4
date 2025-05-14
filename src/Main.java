public class Main {
    public static void main(String[] args) {

        int age = 20;
        if (age < 21) {
            System.out.println("Ты не совершеннолетний");
        } else {
            System.out.println("Ты совершеннолетний");
        }
        int degrees = 4;
        if (degrees < 5)  {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость больше 60, придется заплатить штраф");
        } else {
            System.out.println("Если скорость меньше 60, можете ездить спокойно");
        }
        int years = 18;
        if (years >= 2 && years <= 6) {
            System.out.println("Ты маленький, и тебе нужно ходить в садик");
        } else if (years >= 7 && years <= 17) {
            System.out.println("Ты ходишь в школу");
        } else if (years >= 18 && years <= 24) {
            System.out.println("Ты оказывается уже в универе");
        } else if (years > 24) {
            System.out.println("Ты должен ходить на работу");
        } else if (years < 2) {
            System.out.println("Сиди дома с мамой и папой");
        }
        int babyAge = 14;
        if (babyAge < 5) {
            System.out.println("Если возраст ребенка меньше 5 лет, то ему нельзя кататься на аттракционах");
        } else if (babyAge > 5 && babyAge < 14) {
            System.out.println("Если возраст ребенка больше 5, но меньше 14, то ему можно кататься на аттракционах только со взрослыми");
        } else if (babyAge >= 14) {
            System.out.println("Если возраст ребенка больше 14, то ему можно кататься на аттракционе одному");
        }
        int people = 93;
        int totalPlaces = 102;
        int totalNumberOfSeats = 62;
        if (people >= 102) {
            System.out.println("Вагон полностью заполнен");
        } else if (people <= 62) {
            System.out.println("Есть свободное место, и ты можешь присесть");
        } else if (people >= 62) {
            System.out.println("Сидячих мест больше нет");
        }
        int one = 10;
        int two = 25;
        int three = 15;

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        }
        else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        }
        else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}