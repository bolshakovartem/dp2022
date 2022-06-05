package lab5.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import lab5.animal.PostComment2;

//@RepositoryRestResource(collectionResourceRel = "user1", path = "user")
public interface userRepository extends JpaRepository<PostComment2, Long> {

  //List<user> findByLastName(@Param("name") String name);

}