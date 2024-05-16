import java.util.ArrayList;
import java.util.List;

public class Sprint {
    private final int capacity;
    private final int ticketLimit;
    private final List<Ticket> tickets;

    public Sprint(int capacity, int ticketLimit) {
        this.capacity = capacity;
        this.ticketLimit = ticketLimit;
        this.tickets = new ArrayList<>();
    }

    public void addUserStory(UserStory userStory) {
        if (userStory == null || userStory.isCompleted() || tickets.size() >= ticketLimit) {
            return;
        }
        tickets.add(userStory);
    }

    public void addBug(Bug bug) {
        if (bug == null || bug.isCompleted() || tickets.size() >= ticketLimit) {
            return;
        }
        tickets.add(bug);
    }

    public List<Ticket> getTickets() {
        return new ArrayList<>(tickets);
    }

    public int getTotalEstimate() {
        int totalEstimate = 0;
        for (Ticket ticket : tickets) {
            totalEstimate += ticket.getEstimate();
        }
        return totalEstimate;
    }

    public int getCapacity() {
        return capacity;
    }
}