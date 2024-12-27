package views.console;

import controllers.CommandController;
import views.View;

public class ConsoleView extends View {
    private final CommandView commandView;

    public ConsoleView(CommandController commandController){
        super(commandController);
        this.commandView = new CommandView(this.commandController);
    }

    public void read() {
        this.commandView.interact();
    }

//    public void test(){
//        this.commandView.test();
//    }
}
