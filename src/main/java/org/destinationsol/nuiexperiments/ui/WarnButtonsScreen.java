package org.destinationsol.nuiexperiments.ui;

import org.destinationsol.ui.nui.NUIScreenLayer;
import org.destinationsol.ui.nui.widgets.UIWarnButton;

import javax.inject.Inject;

public class WarnButtonsScreen extends NUIScreenLayer {
    private UIWarnButton warningButton;

    @Inject
    public WarnButtonsScreen() {
    }

    @Override
    public void initialise() {
        warningButton = find("warningButton", UIWarnButton.class);
    }

    @Override
    public void update(float delta) {
        super.update(delta);
        warningButton.enableWarn();
    }
}
