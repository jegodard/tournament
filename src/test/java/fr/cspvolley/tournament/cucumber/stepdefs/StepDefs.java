package fr.cspvolley.tournament.cucumber.stepdefs;

import fr.cspvolley.tournament.TournamentApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TournamentApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
