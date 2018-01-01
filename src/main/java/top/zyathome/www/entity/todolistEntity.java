package top.zyathome.www.entity;

public class todolistEntity {
    private Integer todolistId;

    private String todoContent;

    private Byte todoStatus;

    private Byte deleteFalg;

    private Integer userId;

    public Integer getTodolistId() {
        return todolistId;
    }

    public void setTodolistId(Integer todolistId) {
        this.todolistId = todolistId;
    }

    public String getTodoContent() {
        return todoContent;
    }

    public void setTodoContent(String todoContent) {
        this.todoContent = todoContent == null ? null : todoContent.trim();
    }

    public Byte getTodoStatus() {
        return todoStatus;
    }

    public void setTodoStatus(Byte todoStatus) {
        this.todoStatus = todoStatus;
    }

    public Byte getDeleteFalg() {
        return deleteFalg;
    }

    public void setDeleteFalg(Byte deleteFalg) {
        this.deleteFalg = deleteFalg;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}