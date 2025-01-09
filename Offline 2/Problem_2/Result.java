public class Result {
    private int student_id;
    private int mark;
    private String recheck;
    public Result(int i, int mark) {
        this.student_id = i;
        this.mark = mark;
        recheck="none";
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getRecheck() {
        return recheck;
    }

    public void setRecheck(String recheck) {
        this.recheck = recheck;
    }
    public void ResultPublish(){
        System.out.println("Student : "+student_id+" Marks : "+mark);
    }
}
