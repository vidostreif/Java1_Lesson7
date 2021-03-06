package vido.geekbrains;

/*
1. Расширить задачу про котов и тарелки с едой
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
 */

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.info();

        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Barsik", 10);
        cats[1] = new Cat("Murzik", 25);
        cats[2] = new Cat("Vasya", 20);
        cats[3] = new Cat("Kolobok", 50);
        cats[4] = new Cat("Modelchik", 1);


        for (Cat cat : cats) {
            if (!cat.eat(plate)) {
                plate.addFood(cat.getAppetite());
                cat.eat(plate);
            }
            cat.info();
            plate.info();
        }
    }
}
