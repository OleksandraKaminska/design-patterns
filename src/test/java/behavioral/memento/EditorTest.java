package behavioral.memento;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EditorTest {

    @Test
    public void whenRestore_thanStateSuccessfullyRestored() {
        Editor editor = new Editor();
        editor.addContent("Hi");
        editor.addContent("java");
        editor.addContent("developer");
        editor.save();

        EditorMemento editorMemento = editor.save();
        editor.addContent("!");

        assertEquals(editor.getContent(), "Hi java developer !");

        editor.restore(editorMemento);

        assertEquals(editor.getContent(), "Hi java developer");
    }
}