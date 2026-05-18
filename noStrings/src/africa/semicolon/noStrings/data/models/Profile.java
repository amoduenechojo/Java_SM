package semicolon.noStrings.data.models;
import java.util.Random;

public class Profile {
    private final String profileId;
    private String username;
    private String bio;

    private  final Random RANDOM = new Random();


    public Profile(String username, String bio) {
        this.profileId = generateRandomId();
        this.username = validateUsername(username);
        this.bio = bio;
    }


    public Profile(String profileId, String username, String bio) {
        this.profileId = profileId;
        this.username = validateUsername(username);
        this.bio = bio;
    }


    private String generateRandomId() {
        int nextId = RANDOM.nextInt(10000);
        return String.valueOf(nextId);
    }



    private String validateUsername(String username) {
        if (username == null || username.length() < 3) {
            throw new IllegalArgumentException("Username must be at least 3 characters long.");
        }
        return username;
    }


    public void updateBio(String newBio) {
        if (newBio != null && newBio.length() > 150) {
            throw new IllegalArgumentException("Bio cannot exceed 150 characters.");
        }
        this.bio = newBio;
    }


    public String getProfileId() {
        return profileId;
    }

    public String getUsername() {
        return username;
    }

    public String getBio() {
        return bio;
    }
}