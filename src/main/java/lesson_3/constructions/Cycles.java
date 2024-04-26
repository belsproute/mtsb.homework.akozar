package lesson_3.constructions;

public class Cycles {
    public void  doWhileCycle(){
        int first = 1;

        do {
            System.out.println("Counter = " + first);
            first++;
        } while (first < 10);
    }

    public void whileCycle(){
        int first = 10;

        while (first > 0){
            System.out.println("Counter = " + first);
            first--;
        }
    }

    public void forCycle(){
        for (int i = 0; i < 10; i++){
            System.out.println("Counter = " + i);
        }
    }

    public void forWithBreak(){ // Выход из цикла
        for (int i = 0; i < 10; i++){
            if (i == 5){break;}
            System.out.println("Counter = " + i);
        }
    }
    public void forWithContinue(){ // Продолжение цикла
        for (int i = 0; i < 10; i++){
            if (i == 5){continue;}
            System.out.println("Counter = " + i);
        }
    }
}
