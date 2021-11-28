package com.company.BuilderPattern;

import java.util.List;

public class AppIcons {
    private List<String> icons;

    public List<String> getIcons() {
        return icons;
    }

    public AppIcons(List<String> icons) {
        this.icons = icons;
    }
}
