package mindful.persistence;

import mindful.representation.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ben on 2015-03-17.
 */
public interface NoteRepository extends MongoRepository<Note, String>{

    public Note findByReferenceKey(String referenceKey);

}
