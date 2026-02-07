package click.mevi.dev.interfaces;

import java.util.HashMap;

public interface ConfigSerializer {
    HashMap<String, Object> load();
    void save();
}
