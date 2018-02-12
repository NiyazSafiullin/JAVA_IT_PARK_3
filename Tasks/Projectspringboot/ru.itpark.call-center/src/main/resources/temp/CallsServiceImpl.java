package temp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.callcenter.models.eservice;
import ru.itpark.callcenter.repositories.CallsRepository;

import java.util.List;
@Service
public class CallsServiceImpl implements CallsService {
    @Autowired
    private CallsRepository callsRepository;
    @Override
    public List<eservice> getCalls(String orderBy) {
        switch (orderBy) {
        case "registration_date": return callsRepository.findByOrderByRegistrationTimeDesc();
        case "id": return callsRepository.findByOrderById();
//       // case "name": return callsRepository.findByOrderByName();
            //case "time": return callsRepository.findByOrderByRegistrationTimeDesc();
//            case "employee": return callsRepository.findByOrderById();
//            case "line": return callsRepository.findByOrderByName();
    }
        return callsRepository.findAll();
}

    @Override
    public eservice getCalls(Long callsId) {
        return callsRepository.findOne(callsId);

    }

//    @Override
//    public void update(Long callsId, NamesForm form) {
//        eservice calls = callsRepository.findOne(callsId);
//        //form.update(calls);
//        callsRepository.save(calls);
//    }


}