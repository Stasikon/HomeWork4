public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        int age1 = 22;
        if (age1 < 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Нужно подождать");
        }
    }

    public static void task2() {
        int temp = -1;
        if (temp <= -5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

    }

    public static void task3() {
        int speed = 55;
        if (speed >= 60) {
            System.out.println("Cкорость превышена");
        } else {
            System.out.println("Превышения скорости нет");
        }
    }

    public static void task4() {
        int age = 5;
        boolean Kindergarten = age < 2 || age < 6;
        boolean school = age < 7 || age > 18;
        boolean university = age < 18 || age > 24;
        boolean work = age > 24 || age > 50;
        if (Kindergarten) {
            System.out.println("Надо ходить в детский сад");
        } else {
            System.out.println("Не надо ходить в детский сад");
        }
        if (school) {
            System.out.println("Не надо ходитьв шоклу");
        } else {
            System.out.println("Надо ходить в школу");
        }
        if (university) {
            System.out.println("Не надо ходить в универ");
        } else {
            System.out.println("Надо ходть в униер");
        }
        if (work) {
            System.out.println("Надо ходить на работу");
        } else {
            System.out.println("Не надо  ходить на работу");
        }

    }

    public static void task5() {
        int age = 10;
        boolean noAttraction = age < 5;
        boolean attractionContol = age < 5 || age < 14;
        boolean goAttraction = age > 14;
        if (noAttraction) {
            System.out.println("Не может кататься на аттракционе");
        } else {
            if (attractionContol) {
                System.out.println("Если взрослого нет, то кататься нельзя");
            } else {
                if (goAttraction) {
                    System.out.println("Можно кататься без сапрвождения");
                }
            }

        }


    }

    public static void task6() {
int passengers = 20;
int van = 102;
int seats = 60;
boolean vanSeats = passengers < seats;
boolean noSeats = passengers > seats && passengers < van;

if(vanSeats)
{
    System.out.println("Сидячие места есть");

        } else if (noSeats) {
    System.out.println("Сидячих мест нету");
} else {
    System.out.println("Вагон полон");

}

    }
    public static void task7(){
        int one = 1;
        int two = 5;
        int three = 30;
        boolean maxOne = one > two && one > three;
        boolean maxTwo = two> one && two > three;
        boolean maxThree = three > one && three> two;
        if(maxOne){
            System.out.println("Максимальное one");
        }else if(maxTwo){
            System.out.println("Максимальное two");
        }else if (maxThree){
            System.out.println("Максимальное three");
        }



    }

}


