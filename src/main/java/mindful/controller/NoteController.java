package mindful.controller;

import mindful.persistence.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private NoteRepository _noteRepository;

    @RequestMapping(value = "/notes/{referenceKey}", method= RequestMethod.GET)
    public ResponseEntity<Note> fetchNote(@PathVariable(value="referenceKey") String referenceKey){

        Note retrieved = _noteRepository.findByReferenceKey(referenceKey);
        if (null == retrieved){
            return new ResponseEntity<Note>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(retrieved, HttpStatus.OK);
    }

    @RequestMapping(value = "/notes", method= RequestMethod.POST)
    public ResponseEntity<Note> addNote(@RequestBody Note note){

        if (note == null || note.getText() == null || note.getText().isEmpty()){
            return new ResponseEntity<>(note, HttpStatus.BAD_REQUEST);
        }

        // Add the note
        _noteRepository.save(note);

        return new ResponseEntity<Note>(note, HttpStatus.CREATED);

    }
}
