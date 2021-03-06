package net.kigawa.yamlutil;

import net.kigawa.kutil.kutil.interfaces.Named;

public abstract class YamlData implements Named {
    String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
