package com.company.model;

public class WarmupBand {
    private final String name;
    private Style style;

    public WarmupBand(String name, Style style) {
        this.name = name;
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }
}
