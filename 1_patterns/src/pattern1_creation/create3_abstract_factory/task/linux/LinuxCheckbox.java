package pattern1_creation.create3_abstract_factory.task.linux;

import pattern1_creation.create3_abstract_factory.task.Checkbox;

public final class LinuxCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("Rendering a checkbox in Linux style.");
    }
}
