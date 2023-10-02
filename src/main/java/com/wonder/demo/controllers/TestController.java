package com.wonder.demo.controllers;

import com.wonder.demo.models.Note;
import com.wonder.demo.repositories.NoteRepository;
import com.wonder.demo.responses.TestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    @Autowired
    private NoteRepository noteRepository;
    @GetMapping
    public ResponseEntity<TestResponse> sayHello(){
        TestResponse response = new TestResponse();
        response.setMessage("Just Testing Something");
        response.setError(true);
        response.setStatusCode(HttpStatus.OK);
        return new ResponseEntity<>(response,response.getStatusCode());
    }

    @PostMapping("/note")
    public ResponseEntity<Note> saveNote(@RequestBody Note note){
        var savedNote = noteRepository.save(note);

        return new ResponseEntity<>(savedNote,HttpStatus.OK);
    }
}
