package sedgewickwayne.symboltables;

public interface SymbolTable<Key, Value> {
    void put(Key key, Value value);
    Value get(Key key);
    void delete(Key key);
    boolean contains(Key key);
    boolean isEmpty();
    int size();
}