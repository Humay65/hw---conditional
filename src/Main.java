import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задание 1");
        int age = 24;
        if ( age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен" + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        // task 2
        System.out.println("Задание 2");
        int temperature = 10;
        if  (temperature <= 5)  {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        // task 3
        System.out.println("Задание 3");
        byte speed = 60;
        if ( speed >= 80) {
            System.out.println("Если скорость " + speed + ", то  придется заплатить штраф");
        } else {
            System.out.println("Если суорость " + speed + ", то можно ездить спокойно");
        }

        // task 4
        System.out.println("Задание 4");
        int year = 15;
        boolean needGoToKindergarten = year >= 2 &&  year <= 6;
        boolean needGoToSchool = year> 6 && year <= 18;
        boolean needToBeAtUniversity = year >= 18 && year <= 24;
        boolean needToWork = year > 24;
        if (needGoToKindergarten) {
            System.out.println("Если возраст человека равен " + year + " , то ему нужно ходить в детский сад");
        } else if (needGoToSchool){
            System.out.println("Если возраст человека равен " + year + " , то ему нужно ходить в школу");
        } else if (needToBeAtUniversity) {
            System.out.println("Если возраст человека равен " + year + " , то его место в университете");
        } else if (needToWork ) {
            System.out.println("Если возраст человека равен " + year + " , то ему пора ходит на работу");
        }

        // task 5
        System.out.println("Задание 5");
        byte  yearsOld = 10;
        boolean attractionForbidden = yearsOld < 5;
        boolean accompaniedByAdults = yearsOld >= 5 && yearsOld< 14;
        boolean canRideFreely = yearsOld >= 14;
        if (attractionForbidden){
            System.out.println("Если возраст ребенка равен " + yearsOld +  " , то ему (ей) нельзя кататься на аттракционе");
        } else if (accompaniedByAdults) {
            System.out.println("Если возраст ребенка равен " + yearsOld + " , то ему (ей) можно только в сопровождении взрослого");
        } else if (canRideFreely){
            System.out.println("Если возраст ребенка равен " + yearsOld + ", то ему (ей) можно кататься самостоятельно");
        }

        // task 6
        System.out.println("Задание 6");
        int passengers = 67;
        boolean capacity = passengers < 102;
        boolean chanceToSit = passengers < 60;
        if (chanceToSit){
            System.out.println("В вагоне есть сидячие и стоячие места");
        }else if (capacity) {
            System.out.println ("В вагоне только стоячие места");
        } else System.out.println("Вагон полный");

        // task 7
        System.out.println("Задание 7");
        int a = 22;
        int b = 44;
        int c = 9;
        if ( a >= b && a >= c ){
            System.out.println("Самое большое число: " + a );
        } else if ( b >= c && b >= a ){
            System.out.println("Самое большое число: " + b );
        } else
            System.out.println("Самое большое число: " + c );
        }
    }
