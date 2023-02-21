package com.platzi.jobsearch.cli;

import java.util.HashMap;
import java.util.Map;

public class CLIFunctions {
    public static Map<String, Object> toMap(CLIArguments cliArguments){
        Map<String, Object> params = new HashMap<>();
        params.put("KEYWORD", cliArguments.getKeyword());
        params.put("location", cliArguments.getLocation());
        params.put("page", cliArguments.getPage());
        params.put("gender", cliArguments.getGender());
        params.put("origin", cliArguments.getOrigin());
        params.put("isHelp", cliArguments.isHelp());

        return params;
    }
}
