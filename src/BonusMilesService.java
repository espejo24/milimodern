public class BonusMilesService {
    public int calculate (int cost){
        //int cost = price; // стоимость билета
        int mili = 20; // количество рублей за одну милю
        //int milCount = cost / mili; // количество миль
        return cost / mili;
    }


}
