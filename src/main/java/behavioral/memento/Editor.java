package behavioral.memento;

import java.util.StringJoiner;

public class Editor {

    public static final String DELIMITER = " ";
    private StringJoiner content;

    public Editor() {
        this.content = new StringJoiner(DELIMITER);
    }

    public void addContent(String content) {
        this.content.add(content);
    }

    public String getContent() {
        return content.toString();
    }

    public EditorMemento save() {
        return new EditorMemento(this.content.toString());
    }

    public void restore(EditorMemento editorMemento) {
        this.content = new StringJoiner(DELIMITER).add(editorMemento.getContent());
    }

}
