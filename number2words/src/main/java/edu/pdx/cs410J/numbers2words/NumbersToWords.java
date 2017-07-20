package edu.pdx.cs410J.numbers2words;

public class NumbersToWords {

    public static void main(String[] args) {
        String result = NumbersToWords.convert(Integer.MAX_VALUE);
        System.out.println(result);
    }

    public static String convert(int number) {
        if (number < 0 || number > Integer.MAX_VALUE) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (number >= 1000000000) {
            int extra = number / 1000000000;
            sb.append(map(extra) + " Billion").append(" ");
            number = number % 1000000000;
        }

        if (number >= 1000000) {
            int extra = number / 1000000;
            sb.append(convert999(extra) + " Million").append(" ");
            number = number % 1000000;
        }


        if (number >= 1000) {
            int extra = number / 1000;
            sb.append(convert999(extra) + " Thousand").append(" ");
            number = number % 1000;
        }

        if (number > 0) {
            sb.append(convert999(number));
        }
        return sb.toString();
    }

    public static String convert999(int extra) {
        StringBuilder sb = new StringBuilder();
        if (extra >= 100) {
            int hunNumber = extra / 100;
            sb.append(map(hunNumber) + " hundred").append(" ");
            extra = extra % 100;
        }

        if (extra > 0) {
            if (extra > 0 && extra <= 20) {
                sb.append(map(extra));
            } else {
                int secondDecimal = extra / 10;
                sb.append(map(secondDecimal * 10));
                int firstDecimal = extra % 10;
                if (firstDecimal > 0) {
                    sb.append(" " + map(firstDecimal));
                }
            }
        }
        return sb.toString();
    }

    public static String map(int number) {
        switch (number) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
            case 20:
                return "Twenty";
            case 30:
                return "Thirty";
            case 40:
                return "Fourty";
            case 50:
                return "Fifty";
            case 60:
                return "Sixty";
            case 70:
                return "Seventy";
            case 80:
                return "Eighty";
            case 90:
                return "Ninety";
        }
        return null;
    }
}
