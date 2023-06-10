package com.example.restapi;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Validated
@RestController
public class NameController {

    @GetMapping("/names")
    public ResponseEntity<Map<String, String>> getNames(@Size(min = 1, max = 20, message = "1文字以上20文字以内で入力してください")
                                                            @NotBlank(message = "名前を入力してください")
                                                            @RequestParam("name") String name, @RequestParam("birthday") String birthday) {
        return ResponseEntity.ok(Map.of("message", name + ":" + birthday));
    }

    @ResponseStatus(code = HttpStatus.BAD_REQUEST , value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public Map<String, String> Exceptions(Exception ex) {
        Map<String, String> errors = new HashMap<>();
        errors.put("message", ex.getMessage());
        return errors;
    }

    @PostMapping("/names")
    public ResponseEntity<String> create(@RequestBody CreateForm create, UriComponentsBuilder uriComponentsBuilder) {
        URI url = uriComponentsBuilder
                .queryParam("name", "tanaka")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("name successfully created");
    }

    @PatchMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> update(@PathVariable("id") int id, @RequestBody UpdateForm form) {
        return ResponseEntity.ok(Map.of("message", "name successfully updated"));
    }

    @DeleteMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> delete(@PathVariable("id") int id) {
        return ResponseEntity.ok(Map.of("message", "name successfully delete"));
    }
}
