package pattern1_creation.create3_abstract_factory.task.osx;

import pattern1_creation.create3_abstract_factory.task.Button;

public final class MacButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering a button in macOS style.");
    }
}
