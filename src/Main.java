public class Main {
    public static void main(String[] args) {
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 4;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightTotal = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес бойцов " + weightTotal + "кг");
        var weightDifference = (weightBoxer1 + weightBoxer2) % weightBoxer1;
        System.out.println("Разница в весе между бойцами " + weightDifference + "кг");
        var weightDifference2 = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе между бойцами " + weightDifference2 + "кг");

        var totalTime = 640;
        var staff = totalTime / 8;
        System.out.println("Всего работников в компании " + staff + " человек ");

        var staff2 = 94;
        var totalTime2 = staff2 * 8;
        System.out.println("Если в компании работает " + staff2 + " человека, то всего " + totalTime2 + " часов работы может быть поделено между сотрудниками ");






    }

}
