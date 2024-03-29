import java.util.Stack;

public class History {
    private Stack<EditorState> editorStates = new Stack<>();

    public void push(EditorState state) {
        editorStates.push(state);
    }

    public EditorState pop() {
        return editorStates.pop();
    }

}
