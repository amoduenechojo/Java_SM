package semicolon.noStrings.data.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.noStrings.data.models.Profile;

import static org.junit.jupiter.api.Assertions.*;

class ProfileRepositoryImplTest {



    private ProfileRepository repository;

//    @BeforeEach
//    void setUp() {
//        repository = new ProfileRepositoryImpl();
//    }

    @Test
    public void testThatUserCanCreateNewProfile(){

        Profile newProfile = new Profile("Chojo", "Backend Engineer");
        assertTrue(repository.save("Chojo", "Backend Engineer"));

    }

    @Test
    public void testThatMultiplesProfilesCanBeCreated_allProfilesAreSaved(){



    }


    @Test
    void testThatProfileCanBeSavedAndFound() {

        Profile newProfile = new Profile("Chojo", "Backend Engineer");

        Profile saved = repository.save(newProfile);
        assertNotNull(saved);

        Profile found = repository.findById(saved.getProfileId());
        assertNotNull(found);
        assertEquals("Chojo", found.getUsername());
    }

    @Test
    void testUpdateExistingProfile() {
        Profile profile = new Profile("Chojo", "Backend Engineer");
        repository.save(profile);

        profile.updateBio("Cooking.");
        repository.save(profile);

        Profile found = repository.findById(profile.getProfileId());
        assertEquals("Cooking.", found.getBio());
    }

    @Test
    void testDeleteProfile() {
        Profile profile = new Profile("Chojo.", "BackEnd Engineer");
        repository.save(profile);
        String targetId = profile.getProfileId();

        boolean isDeleted = repository.delete(targetId);
        assertTrue(isDeleted);

        Profile found = repository.findById(targetId);
        assertNull(found);
    }
}