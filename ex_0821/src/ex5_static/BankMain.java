package src.ex5_static;

public class BankMain {
    public static void main(String[] args) {
        Bank b1 = new Bank("신촌", "02-1111-1111");
        Bank b2 = new Bank("강남", "02-2222-2222");
        Bank b3 = new Bank("역삼", "02-3333-3333");

        b1.interest = 12.f;

        b1.info();
        b2.info();
        b3.info();
    }
}

