public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Значение переменной dog   = " + dog);
        System.out.println("Значение переменной cat   = " + cat);
        System.out.println("Значение переменной paper = " + paper);
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8;
        dog = dog + 4;
        var cat = 3.6;
        cat = cat + 4;
        var paper = 763789;
        paper = paper + 4;
        System.out.println("Значение dog + 4   = " + dog);
        System.out.println("Значение cat + 4   = " + cat);
        System.out.println("Значение paper + 4 = " + paper);
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog - 3.5;
        var cat = 3.6;
        cat = cat - 1.6;
        var paper = 763789;
        paper = paper - 7639;
        System.out.println("Значение dog - 3.5    = " + dog);
        System.out.println("Значение cat - 1.6    = " + cat);
        System.out.println("Значение paper - 7639 = " + paper);
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("Инициализация переменной: " + friend);
        friend = friend + 2;
        System.out.println("Значение переменной увеличено на 2: " + friend);
        friend = friend / 7;
        System.out.println("Значение переменной разделили на 7: " + friend);
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();
    }
    public static void task6() {
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var boxersTotalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух боксеров равен " + boxersTotalWeight + " кг");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе двух боксеров равна " + weightDifference + " кг");
        System.out.println();
    }
    public static void task7() {
        System.out.println("Задача 7");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var subtractionWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница весов путем вычитания " + subtractionWeight + " кг");
        var remainderWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница весов - остаток от деления " + remainderWeight + " кг");
        System.out.println();
    }
    public static void task8() {
        System.out.println("Задача 8");
        var totalTime = 640;
        var workerTime = 8;
        var workersQuantity = totalTime / workerTime;
        System.out.println("Всего работников в компании - " + workersQuantity + " человек");
        var extraWorkers = 94;
        var totalNumberWorkers = workersQuantity + extraWorkers;
        var summaryTime = workerTime * totalNumberWorkers;
        System.out.print("Если в компании работает ");
        System.out.print(totalNumberWorkers);
        System.out.print(" человек, то всего ");
        System.out.print(summaryTime);
        System.out.print(" часов работы может быть поделено между сотрудниками");
    }
}