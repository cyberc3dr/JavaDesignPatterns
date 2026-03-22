package pattern1_creation.create3_abstract_factory.task.osx;

import pattern1_creation.create3_abstract_factory.task.Checkbox;

public final class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a checkbox in macOS style.");
    }
}
