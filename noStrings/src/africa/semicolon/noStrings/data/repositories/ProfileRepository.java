package semicolon.noStrings.data.repositories;

import semicolon.noStrings.data.models.Profile;

public interface ProfileRepository {

    Profile save(Profile profile);
    Profile findById(String profileId);

    boolean delete(String profileId);

}