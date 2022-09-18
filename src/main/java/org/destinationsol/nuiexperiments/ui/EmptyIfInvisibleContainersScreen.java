package org.destinationsol.nuiexperiments.ui;

import org.destinationsol.ui.nui.NUIScreenLayer;
import org.destinationsol.ui.nui.widgets.EmptyIfInvisibleContainer;
import org.terasology.nui.widgets.UICheckbox;

import javax.inject.Inject;

public class EmptyIfInvisibleContainersScreen extends NUIScreenLayer {
    private UICheckbox showCheckbox;
    private EmptyIfInvisibleContainer hideBox;

    @Inject
    public EmptyIfInvisibleContainersScreen() {
    }

    @Override
    public void initialise() {
        hideBox = find("hideBox", EmptyIfInvisibleContainer.class);
        hideBox.setVisible(true);
        showCheckbox = find("showCheckbox", UICheckbox.class);
        showCheckbox.setChecked(true);
        showCheckbox.subscribe(button -> {
            hideBox.setVisible(showCheckbox.isChecked());
        });
    }
}
