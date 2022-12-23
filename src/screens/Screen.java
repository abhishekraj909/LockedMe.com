package screens;

public interface Screen {
    abstract void Show();

    void GetUserInput();

    void NavigateOption(int option);
}
