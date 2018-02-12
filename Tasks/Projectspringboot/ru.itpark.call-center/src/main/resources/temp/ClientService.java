package temp;

import ru.itpark.callcenter.forms.NamesForm;
import temp.Client;

import java.util.List;

public interface ClientService {
     List<Client> getClients(String orderBy);


     Client getClient(Long clientId);

     void update(Long clientId, NamesForm form);
}
