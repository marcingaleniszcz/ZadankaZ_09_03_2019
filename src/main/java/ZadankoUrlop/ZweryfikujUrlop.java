package ZadankoUrlop;

import java.time.LocalDate;
import java.util.function.Predicate;

public class ZweryfikujUrlop implements Predicate<Urlop> {
    private LocalDate data;

    public ZweryfikujUrlop(LocalDate data) {
        this.data = data;
    }
    public boolean test(Urlop urlop){
        return data != null
                && !data.isBefore(urlop.getDataOd())
                && !data.isAfter(urlop.getDataDo());
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data){
        this.data = data;
    }
}
