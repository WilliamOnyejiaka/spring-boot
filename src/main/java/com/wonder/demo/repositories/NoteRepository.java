package com.wonder.demo.repositories;

import com.wonder.demo.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note,Integer> {

    //@Query("SELECT * FROM Note n WHERE n.id = :username")
    //Optional<List<Note>> findUsersByUsernameJPQL(@Param("username") String username);

}
