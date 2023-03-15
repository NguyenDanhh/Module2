package CaseStudy.repository.Facility;

import CaseStudy.model.House;
import CaseStudy.model.Villa;

import java.util.List;

public interface IVillaRepository {
    List<Villa> getAll();
    void add (String path ,Villa villa);
}
