package ar.com.sistac.model.checklist;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Checklist {
    private Long id;
    private Map<Enum, Object> items;

    public Checklist(final Long id) {
        this.id = id;
        items = new HashMap<>();
    }

    public Map getItems() {
        return Collections.unmodifiableMap(items);
    }

    public void addItem(final Enum key, final Object value) {
        items.put(key, value);
    }
}
