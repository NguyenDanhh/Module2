package CaseStudy.repository.Facility;

import CaseStudy.model.House;
import CaseStudy.model.Room;

import java.util.List;

public interface IRoomRepository {
    List<Room> getAll();
    void add (String path , Room room );
}
