package CaseStudy.repository.Facility;

import CaseStudy.model.House;

import java.util.List;
import java.util.Map;

public interface IHouseRepository {
    List<House> getAll();
    void add (String path , House house );
}
