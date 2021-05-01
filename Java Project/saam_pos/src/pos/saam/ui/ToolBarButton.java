package pos.saam.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public abstract class ToolBarButton extends AbstractAction {
    public ToolBarButton(String name, Icon icon) {
        putValue(Action.NAME, name);
        putValue(Action.SMALL_ICON, icon);
        putValue(Action.SHORT_DESCRIPTION, "Manage " + name);
    }
}
