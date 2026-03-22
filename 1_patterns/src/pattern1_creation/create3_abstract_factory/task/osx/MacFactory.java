package pattern1_creation.create3_abstract_factory.task.osx;

import pattern1_creation.create3_abstract_factory.task.Button;
import pattern1_creation.create3_abstract_factory.task.Checkbox;
import pattern1_creation.create3_abstract_factory.task.GUIFactory;

public final class MacFactory implements GUIFactory {

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
