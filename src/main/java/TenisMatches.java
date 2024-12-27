import controllers.CommandController;
import models.CLIApp;
import views.View;
import views.console.ConsoleView;

public class TenisMatches {
    private final CLIApp cliApp;
    private final View view;
    private final CommandController commandController;

    private TenisMatches(){
        this.cliApp = new CLIApp();
        this.commandController = new CommandController(this.cliApp);
        this.view = new ConsoleView(this.commandController);
    }

    private void start(){
        do{
            this.view.read();
        } while(true);
    }

    public static void main(String[] args) {
        new TenisMatches().start();
    }
}
