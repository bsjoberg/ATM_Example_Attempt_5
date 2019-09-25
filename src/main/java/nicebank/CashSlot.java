package nicebank;

public class CashSlot {
    private int contents;

    public Integer getContents() {
        return contents;
    }

    public void dispense(int dollars) {
        contents = dollars;
    }
}
