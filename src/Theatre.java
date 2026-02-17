public class Theatre {

    public static void main(String[] args) {

        /*
        Создать трёх актеров и двух режиссёров. Также создайте одного автора музыки и одного хореографа.
        Создать три спектакля: обычный, оперный и балет.
        Распределить актёров по спектаклям. Используйте для этого метод добавления нового актёра в спектакль.
        Один актёр может участвовать в нескольких спектаклях.
        Для каждого спектакля выведите на экран список актёров.
        Замените актёра в одном из спектаклей на актёра из другого спектакля и ещё раз выведите для него список актёров.
        Попробуйте заменить в другом спектакле несуществующего актёра
        Для оперного и балетного спектакля выведите на экран текст либретто.
        */

        //Создать трёх актеров и двух режиссёров. Также создайте одного автора музыки и одного хореографа.
        Actor actor1 = new Actor(Gender.MALE, "Роман", "Костицын", 1.79);
        Actor actor2 = new Actor(Gender.MALE, "Диего", "Рамирез", 2.01);
        Actor actor3 = new Actor(Gender.FEMALE, "Джессика", "Кросс", 1.65);

        Director director1 = new Director(Gender.MALE, "Павел", "Якин");
        Director director2 = new Director(Gender.MALE, "Евгений", "Петров");

        Person musicAuthor1 = new Person(Gender.MALE, "Франц", "Лист");
        Person choreographer1 = new Person(Gender.FEMALE, "Алла", "Духова");

        MusicalShow musicalShow1 = new MusicalShow("Новогодний спектакль", 60, director1,
                musicAuthor1, "Бах, ба-бах");

        Opera opera1 = new Opera("Сон в летнюю ночь", 90, director1, musicAuthor1,
                "Действие 1: Ссора и магия. " +
                        "В волшебном лесу царь эльфов Оберон ссорится с царицей Титанией из-за пажа. " +
                        "Он приказывает Паку принести магический цветок, чтобы Титания влюбилась в первое встречное существо. " +
                        "В это время в лесу прячутся влюбленные Гермия и Лизандр, за которыми следуют Деметрий и Елена.", 25);

        Ballet ballet1 = new Ballet("Щелкунчик", 120, director2, musicAuthor1,
                "Рождественская ёлка: В доме Штальбаумов праздник. " +
                        "Крёстный Дроссельмейер дарит Мари уродливую куклу — Щелкунчика.", choreographer1);

        musicalShow1.addActor(actor1);
        musicalShow1.addActor(actor2);

        opera1.addActor(actor1);

        ballet1.addActor(actor2);
        ballet1.addActor(actor2);  // проверка, что дубли не добавляются
        ballet1.addActor(actor3);


        musicalShow1.printActorList();
        opera1.printActorList();
        ballet1.printActorList();

        musicalShow1.replaceActor(actor1, actor3);
        musicalShow1.printActorList();

        opera1.replaceActor(actor3, actor2);
        opera1.printActorList();


        System.out.println("Текст либретто для " + opera1.getTitle() + ":");
        System.out.println(opera1.getLibrettoText());

        System.out.println("Текст либретто для " + ballet1.getTitle() + ":");
        System.out.println(ballet1.getLibrettoText());


    }
}
