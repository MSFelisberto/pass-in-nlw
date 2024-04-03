package rocketseat.com.passin.domain.Attendee.exception;

public class AttendeeAlreadyRegisteredException extends RuntimeException{
    public AttendeeAlreadyRegisteredException(String message){
        super(message);
    }
}
