package pl.wwksals.tutostore.tutostore2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.wwksals.tutostore.tutostore2.model.User;
import pl.wwksals.tutostore.tutostore2.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    private UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }


    public User getById(Long id){
        return repository.getOne(id);
    }

    public Optional<User> getByUsernameAndPassword(String username, String password){

       return repository.getByUsernameAndPassword(username, password);

    }

    public List<User> findAll(){
        return repository.findAll();
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }

    public void create(User user){
        repository.save(user);
    }

    public void update(User user){
        repository.save(user);
    }
}
