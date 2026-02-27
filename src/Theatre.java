public class Theatre {
    public static void main(String[] args) {

        Director director1 = new Director("Лев", "Польский", Gender.gender.MALE, 12);
        Director director2 = new Director("Иван", "Краснов", Gender.gender.MALE, 34);


        Person musicAuthor = new Person("Ирина", "Колокольцева", Gender.gender.FEMALE);
        Person choreographer = new Person("Светлана", "Камынина", Gender.gender.FEMALE);


        Actor actor1 = new Actor("Сергей", "Петров", Gender.gender.MALE, 186);
        Actor actor2 = new Actor("Фёдор", "Ухов", Gender.gender.MALE, 165);
        Actor actor3 = new Actor("Мария", "Катушкина", Gender.gender.FEMALE, 157);


        Show show = new Show("Обычный спектакль", 132, director1);
        Opera opera = new Opera("Пиковая дама", 150, director1, musicAuthor,
                "Текст либретто оперы...", 15);
        Ballet ballet = new Ballet("Лебединое озеро", 160, director2, musicAuthor,
                "Текст либретто балета...", choreographer);

        System.out.println("=== Распределение актёров ===\n");


        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor1);
        opera.addActor(actor3);

        ballet.addActor(actor2);


        System.out.println("\n=== Списки актёров ===\n");
        show.printActorsList();
        System.out.println();
        opera.printActorsList();
        System.out.println();
        ballet.printActorsList();


        System.out.println("\n=== Замена актёра в обычном спектакле ===\n");
        show.replaceActor("Петров", actor3);
        System.out.println();
        show.printActorsList();


        System.out.println("\n=== Попытка заменить несуществующего актёра ===\n");
        opera.replaceActor("Сидоров", actor2);


        System.out.println("\n=== Либретто музыкальных спектаклей ===\n");
        opera.printLibretto();
        System.out.println();
        ballet.printLibretto();


        System.out.println("\n=== Информация о режиссёрах ===\n");
        show.printDirectorInfo();
        opera.printDirectorInfo();
        ballet.printDirectorInfo();
    }
}