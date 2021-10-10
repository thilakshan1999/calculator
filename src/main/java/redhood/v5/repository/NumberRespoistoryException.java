package redhood.v5.repository;


public class NumberRespoistoryException extends Exception {
    public NumberRespoistoryException(Exception e, String message) {
        super(message,e);
    }
}
