public class Certificate {

    private String studentName;
    private String courseName;
    private String certificateHash;

    public Certificate(String studentName, String courseName) {

        this.studentName = studentName;
        this.courseName = courseName;

        this.certificateHash = StringUtil.applySha256(
                studentName + courseName + System.currentTimeMillis()
        );
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCertificateHash() {
        return certificateHash;
    }
}
