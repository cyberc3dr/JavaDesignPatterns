package pattern1_creation.create3_abstract_factory.task.win;

import pattern1_creation.create3_abstract_factory.task.Button;
import pattern1_creation.create3_abstract_factory.task.Checkbox;
import pattern1_creation.create3_abstract_factory.task.GUIFactory;

public final class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
