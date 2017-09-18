package ar.com.sistac.model.audit.checklist;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Checklist {
    private Long id;
    private Map<String, Boolean> items;

    public Checklist(final Long id) {
        this.id = id;
        items = new HashMap<>();
    }

    public Map<String, Boolean> getItems() {
        return Collections.unmodifiableMap(items);
    }

    public void addItem(final String key, final Boolean value) {
        items.put(key, value);
    }
}
