public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("Задание 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }

        // task 2
        System.out.println("Задание 2");
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("Сегодня холодно, нужно надеть шапку.");
        }
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }
        // task 3
        System.out.println("Задание 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        // task 4
        System.out.println("Задача 4");
        int years = 17;
        boolean ageKindergarten = years >= 2 && years <= 6;
        if (ageKindergarten) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в детский сад");
        } else if (years >= 7 && years < 18) {
            System.out.println("Если возраст человека равен " + years + " то ему нужно ходить в школу");
        } else if (years >= 18 && years < 24) {
            System.out.println("Если возраст человека равен " + years + " то его место в университете");
        } else if (years >= 24) {
            System.out.println("Если возраст человека равен " + years + " то ему пора ходить на работу");

        }
        // task 5
        System.out.println("Задача 5");
        int childrenAge = 17;
        if (childrenAge < 5){
            System.out.println("Если возраст ребенка равен " + childrenAge + " ,то ему нельзя кататься на аттракционе");
        } else if (childrenAge >= 5 && childrenAge < 14){
            System.out.println("Если возраст ребенка равен " + childrenAge +  " ,то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childrenAge + " то ему можно кататься на атракционе без сопровождения взрослого");

        }

        // task 6
        System.out.println("Задача 6");
        int wagonCapacity = 102;
        int seating = 60;
        int standing = wagonCapacity - seating;
        int seatingUsed = 13;
        int standingUsed = 18;
        if (seatingUsed < seating){
            System.out.println("В ввгоне осталось " +(seating - seatingUsed) + " сидячих мест.");
        }else {
            System.out.println("Сидячих мест нет!");
        }
        if (standingUsed < standing){
            System.out.println("в вагоне осталось " +(standing-standingUsed)+ " стоячих мест");
        }else {
            System.out.println("Стоящих мест нет!");
        }

        // task 7
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println(one);
        } else if (two > one && two > three){
            System.out.println(two);
        }else {
            System.out.println(three); // :-)
        }


    }
}
