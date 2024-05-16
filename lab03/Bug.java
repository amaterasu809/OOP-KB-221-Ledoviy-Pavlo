public class Bug extends Ticket {
    private final UserStory userStory;

    public Bug(int id, String name, int estimate, UserStory userStory) {
        super(id, name, estimate);
        this.userStory = userStory;
    }

    @Override
    public String toString() {
        return "[Bug " + getId() + "] " + userStory.getName() + ": " + getName();
    }

    public static Bug createBug(int id, String name, int estimate, UserStory userStory) {
        if (userStory == null || userStory.isCompleted()) {
            return null;
        }
        return new Bug(id, name, estimate, userStory);
    }
}

