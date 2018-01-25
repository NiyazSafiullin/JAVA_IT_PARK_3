package temp;

import ru.itpark.callcenter.models.calls;

import java.util.List;

public interface CallsService {
    List<calls> getCalls(String orderBy);
}
