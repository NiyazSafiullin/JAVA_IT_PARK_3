package temp;

import ru.itpark.callcenter.models.eservice;


import java.util.List;

public interface CallsService {
    List<eservice> getCalls(String orderBy);
    eservice getCalls(Long callsId);
    //void update(Long callsId, NamesForm form);
}
