import java.util.ArrayList;
import java.util.List;

public class UserStory extends Ticket {
    private final List<UserStory> dependencies;

    public UserStory(int id, String name, int estimate, List<UserStory> dependencies) {
        super(id, name, estimate);
        this.dependencies = dependencies;
    }

    public List<UserStory> getDependencies() {
        return new ArrayList<>(dependencies);
    }

    @Override
    public String toString() {
        return "[US " + getId() + "] " + getName();
    }
}

