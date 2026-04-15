interface LoginService {
    boolean login(String username, String password);
}

class EmailService implements LoginService {
    public boolean login(String username, String password) {
        System.out.println("Logging into email");
        return true;
    }
}

class BankingService implements LoginService {
    public boolean login(String username, String password) {
        System.out.println("Logging into bank account");
        return true;
    }
}

class Exercise3 {
    public static void main(String[] args) {
        EmailService email = new EmailService();
        BankingService bank = new BankingService();

        email.login("user1", "1234");
        bank.login("user2", "abcd");
    }
}