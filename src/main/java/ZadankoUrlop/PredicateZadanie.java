package ZadankoUrlop;

import java.time.LocalDate;
import java.time.Month;
import java.util.function.Predicate;

public class PredicateZadanie {
    public static void main(String[] args) {



            Urlop urlop1 = new Urlop(LocalDate.of(2017, 7, 13),
                LocalDate.of(2017, 8, 1));
        Urlop urlop2 = new Urlop(LocalDate.of(2019, 3, 10),
        LocalDate.of(2019, 3, 17));

        Predicate<Urlop> czyAktualnaDataWOkresieUrlopu =
                urlop -> {
                    LocalDate dzisiaj = LocalDate.now();
                    return !dzisiaj.isBefore(urlop.getDataOd())
                            && !dzisiaj.isAfter(urlop.getDataDo());
                };
        System.out.println(czyAktualnaDataWOkresieUrlopu.test(urlop1));
        System.out.println(czyAktualnaDataWOkresieUrlopu.test(urlop2));




    }
}
