package semicolon.noStrings.data.repositories;

import semicolon.noStrings.data.models.Hobby;

import java.util.List;

public interface HobbyRepository {
    Hobby save(Hobby hobby);
    Hobby findById(int id);

    Hobby findByName(String name);
    List<Hobby> findAll();

    int count();


    void delete(Hobby id);

    void deleteAll();
}
