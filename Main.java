package com.company;

public class Main {

    public static void main(String[] args) {
	    sleepIn(true, false);
        sleepIn(true, true);
        sleepIn(false, true);
        sleepIn(false, false);
        sleepIn(true, true);

        sumDouble(2, 3);
        sumDouble(2, 2);

        close10(8, 13);
        close10(13, 8);

        close10(7, 13);
        close10(9, 13);
        close10(13, 8);
        close10(10, 12);
        close10(11, 10);
        close10(5, 21);
        close10(0, 20);
        close10(10, 10);

        notString("candy");
        notString("x");
        notString("not bad");
        notString("bad");
        notString("not");
        notString("is not");
        notString("no");

        System.out.println(frontBack("pawn"));

}
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation) {
            return true;
        }
        else if (!weekday) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        }
        else {
            return (2 * (a + b));
        }
    }

    public static int close10(int a, int b) {
        if (Math.abs(10 - a) < Math.abs(10 - b)) {
            return a;
        }
        else if (Math.abs(10 - a) > (Math.abs(10 - b))) {
            return b;
        }
        else {
            return 0;
        }
    }

    public static  String notString(String str) {
        if (str.startsWith("not")) {
            return str;

        }
        else {
            return ("not " + str);
        }
    }

    /*public static String frontBack(String str) {
        StringBuilder newString = new StringBuilder(str);
        newString.setCharAt(0, str.charAt(str.length()));
        newString.setCharAt(str.length(), str.charAt(0));
        return newString.toString();
    }*/



}
