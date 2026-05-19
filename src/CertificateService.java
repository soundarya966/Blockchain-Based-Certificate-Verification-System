import java.util.ArrayList;

public class CertificateService {

    ArrayList<Certificate> certificates = new ArrayList<>();

    // Issue certificate
    public void issueCertificate(String studentName, String courseName) {

        Certificate certificate =
                new Certificate(studentName, courseName);

        certificates.add(certificate);

        System.out.println("\nCertificate Issued Successfully!");
        System.out.println("Student Name: "
                + certificate.getStudentName());

        System.out.println("Course Name: "
                + certificate.getCourseName());

        System.out.println("Certificate Hash: "
                + certificate.getCertificateHash());
    }

    // Verify certificate
    public void verifyCertificate(String hash) {

        boolean found = false;

        for (Certificate certificate : certificates) {

            if (certificate.getCertificateHash().equals(hash)) {

                found = true;

                System.out.println("\nCertificate Verified Successfully!");
                System.out.println("Student Name: "
                        + certificate.getStudentName());

                System.out.println("Course Name: "
                        + certificate.getCourseName());
            }
        }

        if (!found) {
            System.out.println("\nInvalid Certificate!");
        }
    }

    // Display all certificates
    public void displayCertificates() {

        System.out.println("\nIssued Certificates:");

        for (Certificate certificate : certificates) {

            System.out.println("--------------------------------");

            System.out.println("Student: "
                    + certificate.getStudentName());

            System.out.println("Course: "
                    + certificate.getCourseName());

            System.out.println("Hash: "
                    + certificate.getCertificateHash());

            System.out.println("--------------------------------");
        }
    }

    public ArrayList<Certificate> getCertificates() {
        return certificates;
    }
}
