package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before ("@joinCommunity")
    public void beforeScenario()
    {
        System.out.println("beforeScenario");
    }

    @After ("@joinCommunity")
    public void afterScenario()
    {
        System.out.println("afterScenario");
    }
}
