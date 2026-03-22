package pattern1_creation.create3_abstract_factory.task.win;

import pattern1_creation.create3_abstract_factory.task.Checkbox;

public final class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a checkbox in Windows style.");
    }
}
