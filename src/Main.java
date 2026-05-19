public class Main {

    public static void main(String[] args) {

        CertificateService service =
                new CertificateService();

        System.out.println("====================================");
        System.out.println(" CERTIFICATE VERIFICATION SYSTEM ");
        System.out.println("====================================");

        // Issue Certificates
        service.issueCertificate(
                "Alice",
                "Blockchain Fundamentals"
        );

        service.issueCertificate(
                "Bob",
                "Cybersecurity Essentials"
        );

        // Display All Certificates
        service.displayCertificates();

        // Verify First Certificate
        String verifyHash =
                service.getCertificates()
                        .get(0)
                        .getCertificateHash();

        System.out.println("\nVerifying Certificate...\n");

        service.verifyCertificate(verifyHash);

        System.out.println("\n====================================");
        System.out.println(" VERIFICATION COMPLETED ");
        System.out.println("====================================");
    }
}
