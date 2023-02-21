package com.platzi.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {
    CLIArguments(){

    }

    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            validateWith = CLIKeywordValidate.class,
            description = "KEYWORD"
    )

    private String keyword;

    @Parameter(
            names = {"--location", "-l"},
            description = "Cada búsqueda puede incluir una locación"
    )
    private Object location;
    @Parameter(
            names = {"--page", "-p"},
            description = "La API devuelve 50 resultado, usa un número para la página"
    )
    private int page = 0;

    @Parameter(
            names = {"--gender"},
            description = "Buscar por géneros"
    )
    private String gender;
    @Parameter(
            names = {"--origin"}
    )
    private Object origin;
    @Parameter(
            names = "--help",
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "Mostrar ayuda"
    )
    private Boolean help;

    public String getKeyword() {
        return keyword;
    }

    public Object getLocation() {
        return location;
    }

    public int getPage() {
        return page;
    }

    public String getGender() {
        return gender;
    }

    public Boolean isHelp() {
        return help;
    }

    public Object getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", location=" + location +
                ", page=" + page +
                ", gender='" + gender + '\'' +
                ", origin='" + origin + '\'' +
                ", isHelp=" + help +
                '}';
    }

    public static CLIArguments newInstance(){
        return new CLIArguments();
    }
}
