package github.kaydunovdenis.repository;

import github.kaydunovdenis.bean.product.Entity;

import java.util.Map;

public interface Repository<T extends Entity> {
    Map<String, T> getRepository();

    default void add(T t) {
        getRepository().put(t.getName(), t);
    }

    boolean contain(T t);
}
