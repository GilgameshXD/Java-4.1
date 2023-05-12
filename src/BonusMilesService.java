public class BonusMilesService {
    public int calculate(int price) {
        int oneBonusMileEquals = 20;
        int miles = price / oneBonusMileEquals;
        return miles;
    }
}
