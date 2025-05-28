public class Main {
    public static void main(String[] args) {
        for (int o = 0; o < 17; o = o + 2) {
            System.out.println(o);
        }
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        for (int u = 10; u >= 0; u = u - 1) {
            System.out.println(u);
        }
        for (int p = 10; p >= -10; p = p - 1 ) {
            System.out.println(p);
        }
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year);
        }
        for (int number = 7; number <= 98; number = number + 7) {
            System.out.println(number);
        }
        for (int chislo = 1; chislo <= 512; chislo = chislo * 2) {
            System.out.println(chislo);
        }
        int monthlySavings = 29000;
        int totalSavings = 0;

        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlySavings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }
        int monthlysavings = 29000;
        double totalsavings = 0;
        double monthlyInterestRate = 0.12 / 12;

        for (int month = 1; month <= 12; month++) {
            totalsavings = (totalsavings + monthlysavings) * (1 + monthlyInterestRate);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (int) totalsavings + " рублей");
        }
        int multiplier = 2;
        for (int i = 1; i <= 10; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + "*" + i + "=" + result);
        }
    }
}