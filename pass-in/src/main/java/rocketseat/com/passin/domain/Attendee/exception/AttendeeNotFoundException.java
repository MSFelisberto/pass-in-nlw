package rocketseat.com.passin.domain.Attendee.exception;

public class AttendeeNotFoundException extends RuntimeException{

    public AttendeeNotFoundException(String message) {
        super(message);
    }
}
