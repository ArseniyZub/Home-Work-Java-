package OOP.Seminar5;

public interface CommandHandler {

    String commandName();
    
    void handleCommand(RobotMap map, String[] args);
}
