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
            System.out.println("Совершеннолетний ему "+age1);
        } else {
            System.out.println("Нужно подождать ведь ему " + age1);
        }
    }

    public static void task2() {
        int temp = -1;
        if (temp <= -5) {
            System.out.println("На улице "+temp+", нужно надеть шапку");
        } else {
            System.out.println("Сегодня "+ temp+" можно идти без шапки");
        }

    }

    public static void task3() {
        int speed = 55;
        if (speed >= 60) {
            System.out.println("Cкорость превышена "+speed);
        } else {
            System.out.println("Превышения скорости нет "+speed);
        }
    }

    public static void task4() {
        int age = 5;
        boolean Kindergarten = age < 2 || age < 6;
        boolean school = age < 7 || age > 18;
        boolean university = age < 18 || age > 24;
        boolean work = age > 24 || age > 50;
        if (Kindergarten) {
            System.out.println("Надо ходить в детский сад так как ему " +age);
        } else {
            System.out.println("Не надо ходить в детский сад так как ему "+ age);
        }
        if (school) {
            System.out.println("Не надо ходитьв шоклу так как ему "+ age);
        } else {
            System.out.println("Надо ходить в школу так как ему "+ age);
        }
        if (university) {
            System.out.println("Не надо ходить в универ так как ему "+age);
        } else {
            System.out.println("Надо ходть в униер так как ему "+age);
        }
        if (work) {
            System.out.println("Надо ходить на работу так как ему "+age);
        } else {
            System.out.println("Не надо  ходить на работу так как ему "+age);
        }

    }

    public static void task5() {
        int age = 10;
        boolean noAttraction = age < 5;
        boolean attractionContol = age < 5 || age < 14;
        boolean goAttraction = age > 14;
        if (noAttraction) {
            System.out.println("Не может кататься на аттракционе так как ему "+age);
        } else {
            if (attractionContol) {
                System.out.println("Если взрослого нет, то кататься нельзя так как ему "+age);
            } else {
                if (goAttraction) {
                    System.out.println("Можно кататься без сапрвождения так как ему "+age);
                }
            }

        }


    }

    public static void task6() {
int passengers = 80;
int van = 102;
int seats = 60;
boolean vanSeats = passengers < seats;
boolean noSeats = passengers > seats && passengers < van;
int inTotal = seats- passengers;
int free = van - passengers;

if(vanSeats)
{
    System.out.println("Сидячие места есть "+inTotal);

        } else if (noSeats) {
    System.out.println("Сидячих мест нету но в вагоне еще "+free);
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


