package roody.tasks;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Represents an Event Task.
 */
public class Event extends Task {
    private LocalDate start;
    private LocalDate end;
    private char type = 'E';

    /**
     * Creates an Event with specified description, start and end date.
     * @param description The description of the Event.
     * @param start The start date of the Event.
     * @param end The end date of the Event.
     */
    public Event(String description, LocalDate start, LocalDate end) {
        super(description);
        this.start = start;
        this.end = end;
    }
    public void setStart(LocalDate time) {
        this.start = time;
    }
    public void setEnd(LocalDate time) {
        this.end = time;
    }
    public LocalDate getStart() {
        return this.start;
    }
    public LocalDate getEnd() {
        return this.end;
    }
    @Override
    public String saveTask() {
        return super.saveTask() + '|' + this.type + '|' + this.start + '|' + this.end;
    }
    @Override
    public char getType() {
        return type;
    }
    @Override
    public String toString() {
        char done = ' ';
        if (isDone()) {
            done = 'X';
        }
        return "[E][" + done + "] " + super.toString() + " (from: "
            + start.format(DateTimeFormatter.ofPattern("MMM d yyyy"))
            + " to: " + end.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }
}
