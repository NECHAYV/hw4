public class Main {
    public static void main(String[] args) {
        int iWantSum = 2_459_000;
        int sum = 0;
        int quantity = 15000;
        double percent = 1D / 100;
        int month = 0;
        while (sum < iWantSum) {
            sum += quantity;
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        int population = 12_000_000;
        int fertilityPerThousand = 17;
        int mortalityPerThousand = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * fertilityPerThousand / 1000 - population * mortalityPerThousand / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        percent = 7D / 100;
        iWantSum = 12_000_000;
        sum = quantity;
        month = 0;
        while (sum < iWantSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        sum = quantity;
        month = 0;
        while (sum < iWantSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
            sum = quantity;
            month = 0;
            int months = 12 * 9;
            while (month < months) {
                sum = (int) (sum * (1 + percent));
                month++;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
                }

            }
        }
        int firstFriday = 3;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница " + day + "-e число. Необходимо подготовить отчет");
        }
        int period = 79;
        int startSeeing = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = startSeeing; year < end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }
    }
}







