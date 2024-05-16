import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserStory registration = new UserStory(1, "Форма реєстрації", 3, new ArrayList<>());
        UserStory login = new UserStory(2, "Форма входу", 2, new ArrayList<>());
        List<UserStory> dependenciesForDashboard = new ArrayList<>();
        dependenciesForDashboard.add(registration);
        dependenciesForDashboard.add(login);
        UserStory dashboard = new UserStory(3, "Панель інструментів", 5, dependenciesForDashboard);

        Bug bug1 = Bug.createBug(1, "Помилка при валідації електронної пошти", 2, registration);
        Bug bug2 = Bug.createBug(2, "Помилка авторизації через соціальні мережі", 3, login);

        Sprint sprint = new Sprint(10, 5);
        sprint.addUserStory(registration);
        sprint.addUserStory(login);
        sprint.addUserStory(dashboard);
        sprint.addBug(bug1);
        sprint.addBug(bug2);

        System.out.println("Загальна оцінка часу виконання: " + sprint.getTotalEstimate());

        System.out.println("Тікети у спринті:");
        List<Ticket> tickets = sprint.getTickets();
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }
}