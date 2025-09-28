package ru.vasic2000.escape;

import ru.vasic2000.my_libgdx.core.CoreFW;
import ru.vasic2000.my_libgdx.core.SceneFW;

public class Main extends CoreFW {
    public SceneFW getStartScene() {
        return new LoaderResourcesScene(this);
    }
}
