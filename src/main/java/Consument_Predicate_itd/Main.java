package Consument_Predicate_itd;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Consumer<String> wielkieLitery = (ciagZnakow) -> System.out.println(ciagZnakow.toUpperCase());
//
//
//        Consumer<String> dlugosc = (ciagZnakow) -> System.out.println(ciagZnakow.length());
//
//        Consumer<String> kompozyt = wielkieLitery.andThen(dlugosc);
//        kompozyt.accept("Cos tam");
//
//        Supplier<LocalDateTime> aktualnyCzas = LocalDateTime::now;
//        System.out.println(aktualnyCzas.get());
//        Thread.sleep(5000);
//        System.out.println(aktualnyCzas.get());

//        Supplier<Integer> wylosuj = () -> new Random(). nextInt(11);
//        System.out.println(wylosuj.get());
//        System.out.println(wylosuj.get());
//        System.out.println(wylosuj.get());
//
//        Supplier<Czlowiek> dostawcaLudzi = () -> new Czlowiek();
//        Supplier<Czlowiek> dostawcaLudziRef = Czlowiek::new;
//        System.out.println(dostawcaLudziRef.get());
//        System.out.println(dostawcaLudziRef.get());

        Predicate<String> isNotNull = (s) -> s !=null;
        System.out.println(isNotNull.test("dssd"));
        System.out.println(isNotNull.test(null));


        Predicate<String> isEmpty = (ciagZnakow) -> ciagZnakow.isEmpty();
//        Predicate<String> isEmpty2 = String::isEmpty;
//        System.out.println(isEmpty2.test("dssd"));
//        System.out.println(isEmpty2.test(""));
//        System.out.println(isEmpty2.test(null));

        Predicate<String> and = isNotNull.and(isEmpty);
        System.out.println(and.test("dasd"));
        System.out.println(isNotNull.test(""));
        System.out.println(isNotNull.test(null));

        Predicate<String> or = isNotNull.or(isEmpty);
        System.out.println(or.test("dasd"));
        System.out.println(or.test(""));
        System.out.println(or.test(null));


//        Consumer<Integer> liczba = (liczby) -> System.out.println(liczby * 2);
//        liczba.accept(5);

//        Stream.of("a", "b").forEach(ciagZnakow -> System.out.println(ciagZnakow));
    }
}
