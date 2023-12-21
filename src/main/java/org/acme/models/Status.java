package org.acme.models;

public enum Status {
    OK("OK"),
    GOOD("Good"),
    BAD("Bad"),
    AVERAGE("Average");

    private String label;

    Status(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
