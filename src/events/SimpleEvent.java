package events;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

public class SimpleEvent<T> implements Event<T> {

    private final List<Consumer<T>> listeners = new CopyOnWriteArrayList<>();

    @Override
    public void addListener(Consumer<T> listener) throws NullPointerException {
        synchronized (listeners) {
            listeners.add(listener);
        }
    }

    @Override
    public void removeListener(Consumer<T> listener) throws NullPointerException {
        synchronized (listeners) {
            listeners.remove(listener);
        }
    }

    @Override
    public void trigger(T t) {
        listeners.forEach(listener -> listener.accept(t));
    }
}