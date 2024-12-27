package controllers;

import models.CLIApp;

public abstract class Controller {
    protected CLIApp cliApp;

    protected Controller(CLIApp cliApp) {
        this.cliApp = cliApp;
    }
}