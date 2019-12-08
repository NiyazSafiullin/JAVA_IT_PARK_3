package coderestNiyaz.RestApi.Controller;


import coderestNiyaz.RestApi.Exceptions.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("message")
public class MessageController {
    private int counter = 4;
    private List<Map<String, String>> messages = new ArrayList<Map<String, String>>() {
        {
            add(new HashMap<String, String>() {{
                put("id", "1");
                put("city", "Kazan");
            }});
            add(new HashMap<String, String>() {{
                put("id", "2");
                put("city", "Moscow");
            }});

            add(new HashMap<String, String>() {{
                put("id", "3");
                put("city", "Minsk");
            }});


        }
    };

    @GetMapping
    public List<Map<String, String>> list() {
        return messages;
    }

    @GetMapping("{id}")
    public Map<String, String> getOne(@PathVariable String id) {
        return getMessage(id);
    }

    private Map<String, String> getMessage(@PathVariable String id) {
        return messages.stream()
                .filter(message -> message.get("id").equals(id))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

    @PostMapping
    public Map<String, String> create(@RequestBody Map<String, String> message) {
        message.put("id", String.valueOf(++counter));
        messages.add(message);
        return message;
    }


    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        Map<String, String> message = getMessage(id);
        messages.remove(message);
    }
}