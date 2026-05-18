package semicolon.noStrings.data.repositories;//package africa.semicolon.noStrings.data.repositories;

import semicolon.noStrings.data.models.Hobby;

import java.util.ArrayList;
import java.util.List;


public class HobbyRepositoryImpl implements HobbyRepository {

    private List<Hobby> hobbies = new ArrayList<>();
    private HobbyRepository hobbyRepository;

    @Override
    public Hobby save(Hobby hobby) {
        int id = hobbyRepository.findById(hobby.getId()).getId();

        if (id == 0) {
            hobby.setId();
            hobbies.add(hobby);
        }

        else {
            update(hobby);
        }
        return hobby;
    }




    private void update(Hobby hobby) {
        Hobby existingHobby = findById(hobby.getId());

        int index = hobbies.indexOf(existingHobby);
        hobbies.set(index, hobby);
    }



    @Override
    public Hobby findById(int id) {

        for (Hobby hobby : hobbies) {
            if (hobby.getId() == id)
                return hobby;
        }
        return null;
    }


    @Override
    public Hobby findByName(String name) {
        for (Hobby hobby : hobbies) {

            if (hobby.getName(name).equalsIgnoreCase(name))
                return hobby;
        }
        return null;
    }



    @Override
    public List<Hobby> findAll() {
        return hobbies;
    }


    @Override
    public int count() {
        return hobbies.size();
    }

    @Override
    public void delete(Hobby hobbyId) {

        if (hobbyRepository.findById(hobbyId.getId()) == hobbyId) {
            hobbies.remove(hobbyId);
        }
    }


    @Override
    public void deleteAll() {
        hobbies.clear();

    }
}