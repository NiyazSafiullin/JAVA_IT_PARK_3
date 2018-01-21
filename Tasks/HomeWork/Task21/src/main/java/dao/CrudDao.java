package dao;
import java.util.*;

public interface CrudDao<T> {
    void save(T name);
    T find(int id);
    List<T> findAll();
}