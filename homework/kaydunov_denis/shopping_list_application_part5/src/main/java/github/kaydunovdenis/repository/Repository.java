package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.Entity;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface Repository<T extends Entity> {
    Map<String, T> getRepository();

    default void add(T t) {
        getRepository().put(t.getName(), t);
    }

    default boolean contain(@NotNull T t) {
        return getRepository().containsKey(t.getName())
                && getRepository().containsValue(t);
    }
}
