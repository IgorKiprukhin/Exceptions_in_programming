package HomeWork3;

public class DateExcrptionE extends Exception {
    public DateExcrptionE() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DateNotCorrectFormat");
        System.out.printf("It`s not correct date format: %s", i);
        System.out.println();
    }
}