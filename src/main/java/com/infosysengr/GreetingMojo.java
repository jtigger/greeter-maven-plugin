package com.infosysengr;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.LinkedList;
import java.util.List;

@Mojo(name = "greet")
public class GreetingMojo extends AbstractMojo {
    @Parameter( property = "context", defaultValue = "(none)")
    private String context;

    private static List<String> executedContexts = new LinkedList<String>();

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Hello, world (from " + context + ").");
        executedContexts.add(context);
        getLog().info(" > the blackboard reads: \"" + executedContexts.toString() + "\".");
    }
}
