package ra.learn_session09.generic;

import java.util.List;

public interface IShop<T> {
    List<T> findAll();

    void create(T t);

    void update(T t);

    void delete(T t);
}