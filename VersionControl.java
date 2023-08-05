package CW_ISKL.homeWork.seminar_3;

public class VersionControl implements Control{
    @Override
    public void execute(String input) {
        new Model(input);
    }
}
