package com.company;

import java.util.Objects;

public class Function {
    private String function;

    public Function(String fc) {
        function = fc;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getFunction() {
        return function;
    }

    public boolean equals(Function o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return this.function.equals(o.function);
    }

    @Override
    public int hashCode() {
        return Objects.hash(function);
    }
}
