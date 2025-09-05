// src/VariableSnapshot.java
package src;

public class VariableSnapshot {
    private final String name;
    private final Object value;
    private final String stepDescription;

    public VariableSnapshot(String name, Object value, String stepDescription) {
        this.name = name;
        this.value = value;
        this.stepDescription = stepDescription;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public String getStepDescription() {
        return stepDescription;
    }
}
