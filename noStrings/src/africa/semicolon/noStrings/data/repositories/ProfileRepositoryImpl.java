package semicolon.noStrings.data.repositories;

import semicolon.noStrings.data.models.Profile;

import java.util.ArrayList;
import java.util.List;

public class ProfileRepositoryImpl implements ProfileRepository {

    private final List<Profile> profiles = new ArrayList<>();

    @Override
    public Profile save(Profile profile) {
        if (profile == null) {
            return null;
        }

        for (int count = 0; count < profiles.size(); count++) {

            if (profiles.get(count).getProfileId().equals(profile.getProfileId())) {
                profiles.set(count, profile);
                return profile;
            }
        }
        profiles.add(profile);
        return profile;
    }

    @Override
    public Profile findById(String profileId) {

        for (int count = 0; count < profiles.size(); count++) {
            if (profiles.get(count).getProfileId().equals(profileId)) {
                return profiles.get(count);
            }
        }
        return null;
    }

    @Override
    public boolean delete(String profileId) {

        for (int count = 0; count < profiles.size(); count++) {
            if (profiles.get(count).getProfileId().equals(profileId)) {
                profiles.remove(count);
                return true;
            }
        }
        return false;
    }
}