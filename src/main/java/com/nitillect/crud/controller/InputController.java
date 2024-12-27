package com.nitillect.crud.controller;

import com.nitillect.crud.service.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/input")
public class InputController {

    @Autowired

    private InputService inputService;

    /*@PostMapping
    public ResponseEntity<Input> create(@RequestBody Input input) {
        return ResponseEntity.ok(inputService.create(input));
    }
    
     */

    @GetMapping("/read")

    public ResponseEntity<String> read(@RequestParam String name) {
        return ResponseEntity.ok("Hello " + name);
    }

    /*@PutMapping
    public ResponseEntity<Input> update(@RequestBody Input input) {
        return ResponseEntity.ok(inputService.update(input));
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestParam Long id) {
        inputService.delete(id);
        return ResponseEntity.ok().build();
    }
    
     */

}
