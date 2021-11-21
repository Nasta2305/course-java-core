package com.rakovets.course.java.core.practice.decision_making_statements;

/**
 * Разработать программу для сайта посвященного астрологии.
 * <p>
 * Определить знак зодиака.
 * <p>
 * 21.3-20.4 - `Ram`
 * 21.4-20.5 - `Bull`
 * 21.5-21.6 - `Twins`
 * 22.6-22.7 - `Crab`
 * 23.7-22.8 - `Lion`
 * 23.8-21.9 - `Maiden`
 * 22.9-22.10 - `Scales`
 * 23.10-22.11 - `Scorpion`
 * 23.11-21.12 - `Archer`
 * 22.12-20.1 - `Goat`
 * 21.1-19.2 - `Water-bearer`
 * 20.2-20.3 - `Fish`
 */
class Task12 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int day = 22;
        int month = 12;

        String zodiacSign = getZodiacSign(day, month);
        System.out.printf("Result: %s", zodiacSign);
    }

    /**
     * Определяет знак зодиака.
     *
     * @param day   число дня рождения
     * @param month месяц дня рождения
     * @return знак зодиака
     */
    static String getZodiacSign(int day, int month) {
        switch (month) {
            case 1:
                if (day <=20) {
                    return "Goat";
                } else return "Water-bearer";
            case 2:
                if (day <=19) {
                    return "Water-bearer";
                } else return "Fish";
            case 3:
                if (day <=20) {
                    return "Fish";
                } else return "Ram";
            case 4:
                if (day <=20) {
                    return "Ram";
                } else return "Bull";
            case 5:
                if (day <=20) {
                    return "Bull";
                } else return "Twins";
            case 6:
                if (day <=21) {
                    return "Twins";
                } else return "Crab";
            case 7:
                if (day <=22)  {
                    return "Crab";
                } else return "Lion";
            case 8:
                if (day <=22) {
                    return "Lion";
                } else return "Maiden";
            case 9:
                if (day <=21) {
                    return "Maiden";
                } else return "Scales";
            case 10:
                if (day <=22) {
                    return "Scales";
                } else return "Scorpion";
            case 11:
                if (day <=22) {
                    return "Scorpion";
                } else return "Archer";
            case 12:
                if (day <=21) {
                    return "Archer";
                } else return "Goat";
            default:
                return null;
        }



    }
}
