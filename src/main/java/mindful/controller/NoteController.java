package mindful.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import mindful.representation.Note;

import java.util.Date;

/**
 * Created by ben on 15-03-08.
 */

@RestController // This annotation is shorthand for @Controller and @ResponseBody
public class NoteController
{

    @RequestMapping(value = "/notes/{noteId}", method= RequestMethod.GET)
    public ResponseEntity<Note> fetchNote(@PathVariable(value="noteId") String noteId){

        Note note = new Note();
        note.setCreatedBy("test");
        note.setDateCreated(new Date());
        note.setText("testing one two three " + noteId);

        return new ResponseEntity<>(note, HttpStatus.OK);
    }

    @RequestMapping(value = "/notes", method= RequestMethod.POST)
    public ResponseEntity<Note> addNote(@RequestBody Note note){

        if (note == null || note.getText() == null || note.getText().isEmpty()){
            return new ResponseEntity<>(note, HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<Note>(note, HttpStatus.CREATED);

    }
}
