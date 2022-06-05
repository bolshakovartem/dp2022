package lab5.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import lab5.animal.user;

//@RepositoryRestResource(collectionResourceRel = "user1", path = "user")
public interface postRepository2 extends JpaRepository<user, Integer> {

  //List<user> findByLastName(@Param("name") String name);

}