package com.epam.laboratory.parsers;

import java.util.ArrayList;

abstract public class Parser {

    ArrayList<?> objects = new ArrayList<>();

    public ArrayList<?> parse(String pathToFile, String objectType) {
        return objects;
    }
}
