package CaseStudy.repository.Facility.impl;

import CaseStudy.common.ReadFile;
import CaseStudy.common.WriteFile;
import CaseStudy.model.Villa;
import CaseStudy.repository.Facility.IVillaRepository;

import java.util.ArrayList;
import java.util.List;

public class VillaRepository implements IVillaRepository {
    private static final String PATH = "src/CaseStudy/data/file_villa.csv";

    @Override
    public List<Villa> getAll() {
        List<String> list = ReadFile.read(PATH);
        List<Villa> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String[] array = list.get(i).split(",");
            Villa villa = new Villa(Integer.parseInt(array[0]), array[1], Double.parseDouble(array[2]),
                    array[3], Integer.parseInt(array[4]), array[5], array[6], Double.parseDouble(array[7]), Integer.parseInt(array[8]));
            list1.add(villa);
        }
        return list1;
    }

    @Override
    public void add(String path, Villa villa) {
        String str = villa.toCSV();
        List<String> list = new ArrayList<>();
        list.add(str);
        WriteFile.write(path, list);
    }
}
