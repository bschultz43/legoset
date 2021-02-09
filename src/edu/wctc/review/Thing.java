package edu.wctc.review;

public abstract class Thing<T, S> {
    private T value;
    private S description;

    public Thing(T value, S description) {
        this.value = value;
        this.description = description;
    }

    public abstract String interactWithThing();

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public S getDescription() {
        return description;
    }

    public void setDescription(S description) {
        this.description = description;
    }
}
