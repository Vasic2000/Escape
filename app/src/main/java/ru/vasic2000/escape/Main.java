package ru.vasic2000.escape;

import ru.vasic2000.core.CoreFW;
import ru.vasic2000.core.SceneFW;
import ru.vasic2000.escape.scenes.LoaderResourcesScene;

public class Main extends CoreFW {
    public SceneFW getStartScene() {
        return new LoaderResourcesScene(this);
    }
}
