package commands;

import controllers.Controller;
import controllers.execution.AdminController;
import controllers.execution.PublicController;
import models.CLIApp;

public class ExecutionController extends Controller {
    private final AdminController adminController;
    private final PublicController publicController;

    public ExecutionController(CLIApp cliApp) {
        super(cliApp);

        this.adminController = new AdminController(cliApp);
        this.publicController = new PublicController(cliApp);
    }
}
