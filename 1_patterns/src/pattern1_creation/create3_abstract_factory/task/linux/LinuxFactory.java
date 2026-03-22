package pattern1_creation.create3_abstract_factory.task.linux;

import pattern1_creation.create3_abstract_factory.task.Button;
import pattern1_creation.create3_abstract_factory.task.Checkbox;
import pattern1_creation.create3_abstract_factory.task.GUIFactory;

public final class LinuxFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
