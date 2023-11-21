package services;

public class AuthService {
    private static AuthService instance;

    private AuthService() {}

    public static synchronized AuthService getInstance() {
        if (instance == null) {
            instance = new AuthService();
        }
        return instance;
    }

    public boolean authenticate(String username, String password) {
        return "admin".equals(username) && "password123".equals(password);
    }
}
