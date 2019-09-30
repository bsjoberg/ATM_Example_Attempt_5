package nicebank;

public class InsufficientFundsException extends Exception {
    @Override
    public String getMessage() {
        return "Insufficient Funds for this Withdrawal Attempt";
    }
}
