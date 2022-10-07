package pro.sky.java.ds_3_0.task;

public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Aleksandr", "Pushkin");
        Author pushkin2 = new Author("Aleksandr", "Pushkin");
        Author pushkin3 = new Author("Michail", "Pushkin");
        Author nosov = new Author("Evgeniy", "Nosov");
        Author grin = new Author("Aleksandr", "Grin");

        Book bronzeHorseman = new Book("Медный всадник", pushkin, 1981);
        Book bronzeHorseman2 = new Book("Медный всадник", pushkin, 1981);
        Book bronzeHorseman3 = new Book("Медный всадник", pushkin, 2000);
        Book inPole = new Book("В чистом поле", nosov, 2010);

        System.out.println(pushkin);
        System.out.println(inPole);
        System.out.println();

        //авторы одинаковые, когда у них совпадают и имя и фамилия
        System.out.println(pushkin.equals(bronzeHorseman));                   //сравнение объектов разных классов  false
        System.out.println(pushkin.equals(bronzeHorseman.getAuthorName()));   //одинаковые авторы                   true
        System.out.println(pushkin.equals(pushkin2));                        //одинаковые авторы                    true
        System.out.println(pushkin.equals(pushkin3));             //авторы с одинаковой фамилией и разными именами false
        System.out.println(pushkin.equals(grin));               //авторы с разными фамилиями и одинаковыми именами false
        System.out.println(pushkin.equals(nosov));               //авторы с разными фамилиями и именами            false
        System.out.println();

        System.out.println(pushkin.getFirstName().hashCode());
        System.out.println(pushkin.getLastName().hashCode());
        System.out.println(pushkin.hashCode());                 //у pushkin и pushkin2 с одинаковыми ФИ hashCode равны
        System.out.println(pushkin2.hashCode());                //у pushkin и pushkin2 с одинаковыми ФИ hashCode равны
        System.out.println(pushkin3.hashCode());
        System.out.println(grin.hashCode());
        System.out.println(nosov.hashCode());
        System.out.println();

        //книги одинаковые когда все поля совпадают
        System.out.println(bronzeHorseman.equals(nosov));               //разные классы             false
        System.out.println(bronzeHorseman.equals(bronzeHorseman2));     //все поля одинаковые       true
        System.out.println(bronzeHorseman.equals(bronzeHorseman3));     //год публикации разный     false
        System.out.println(bronzeHorseman.equals(inPole));              //все поля разные           false
        System.out.println();

        System.out.println(bronzeHorseman.hashCode());      //bronzeHorseman и bronzeHorseman2 одинаковые
        System.out.println(bronzeHorseman2.hashCode());     //bronzeHorseman и bronzeHorseman2 одинаковые
        System.out.println(inPole.hashCode());
    }
}
