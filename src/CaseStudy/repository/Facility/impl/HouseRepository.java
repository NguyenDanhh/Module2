package CaseStudy.repository.Facility.impl;

import CaseStudy.common.ReadFile;
import CaseStudy.common.WriteFile;
import CaseStudy.model.House;
import CaseStudy.repository.Facility.IHouseRepository;

import java.util.*;

public class HouseRepository implements IHouseRepository {
    private static final String PATH = "src/CaseStudy/data/file_house.csv";
    @Override
    public List<House> getAll() {
        List<String> list = ReadFile.read(PATH);
        List<House> list1 = new ArrayList<>();
        for (int i = 0 ; i < list.size() ; i++) {
            String[] array = list.get(i).split(",");
            House house = new House(Integer.parseInt(array[0]) ,array[1], Double.parseDouble(array[1]) , array[2] , Integer.parseInt(array[3]),
                    array[4] , array[5] , Integer.parseInt(array[6]));
            list1.add(house);
        }
        return list1;
    }

    @Override
    public void add(String path , House house) {
        String str = house.toCSV();
        List<String> list = new ArrayList<>();
        list.add(str);
        WriteFile.write(path , list);
    }
}
