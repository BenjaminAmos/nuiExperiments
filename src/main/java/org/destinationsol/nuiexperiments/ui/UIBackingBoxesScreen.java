package org.destinationsol.nuiexperiments.ui;

import org.destinationsol.ui.nui.NUIScreenLayer;
import org.terasology.nui.BaseInteractionListener;
import org.terasology.nui.Canvas;
import org.terasology.nui.InteractionListener;
import org.terasology.nui.events.NUIMouseClickEvent;
import org.terasology.nui.widgets.UILabel;

import javax.inject.Inject;

public class UIBackingBoxesScreen extends NUIScreenLayer {
    private final InteractionListener BACKGROUND_CLICK_LISTENER = new BaseInteractionListener() {
        @Override
        public boolean onMouseClick(NUIMouseClickEvent event) {
            backgroundClickCount++;
            touchDetectLabel.setText("Click registered on background " + backgroundClickCount + " times");
            return true;
        }
    };
    private int backgroundClickCount;
    private UILabel touchDetectLabel;

    @Inject
    public UIBackingBoxesScreen() {
    }

    @Override
    public void initialise() {
        touchDetectLabel = find("touchDetectLabel", UILabel.class);
    }

    @Override
    public void onAdded() {
        super.onAdded();
        backgroundClickCount = 0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.addInteractionRegion(BACKGROUND_CLICK_LISTENER);
        super.onDraw(canvas);
    }
}
