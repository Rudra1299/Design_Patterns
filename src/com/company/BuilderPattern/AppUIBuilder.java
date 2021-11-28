package com.company.BuilderPattern;

import java.util.List;

public interface AppUIBuilder {

    void setDate(Date date);
    void setSearchEngine(SearchEngine searchEngine);
    void setIcons(List<String> icons);
}
