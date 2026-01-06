package model;

public class Course {
    int courseId;
    String CourseName;
    int duration;
    double fee;

    public Course(int courseId, String courseName, int duration, double fee) {
        this.courseId = courseId;
        CourseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
