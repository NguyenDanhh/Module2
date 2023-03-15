package CaseStudy.repository.Facility.impl;
import CaseStudy.common.ReadFile;
import CaseStudy.common.WriteFile;
import CaseStudy.model.Room;
import CaseStudy.repository.Facility.IRoomRepository;

import java.util.ArrayList;
import java.util.List;

public class RoomRepository implements IRoomRepository {
    private static final String PATH ="src/CaseStudy/data/file_room.csv";
    @Override
    public List<Room> getAll() {
        List<String> list = ReadFile.read(PATH);
        List<Room> list1 = new ArrayList<>();
        for (int i = 0 ; i < list.size() ; i++) {
            String[] array = list.get(i).split(",");
            Room room = new Room(Integer.parseInt(array[0]),array[1] ,Double.parseDouble(array[2]), array[3] , Integer.parseInt(array[4]) , array[5], array[6] );
            list1.add(room);
        }
        return list1;
    }

    @Override
    public void add(String path, Room room) {
        String str = room.toCSV();
        List<String> list = new ArrayList<>();
        list.add(str);
        WriteFile.write(path , list);
    }
}
