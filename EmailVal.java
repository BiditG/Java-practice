public class EmailVal {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]+\\.(com|org|net)$";
        String[] emails = {"user@example.com","invalid-email@","testdomain.org","name@site.net"};

        for (String email : emails) {
            System.out.println(email + " is valid? " + email.matches(regex));
 }
}
}
