package com.api.controller;

import com.api.exception.OwnerNotFoundException;
import com.api.service.OwnerService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping(value = "/owners")
@RequiredArgsConstructor
@RestController //@Controller + @ResponseBody
public class OwnerController {

    private final OwnerService ownerService;

    //    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public ResponseEntity<String> findOwner() {
        try {
            String response = ownerService.findOwner();
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (OwnerNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    //    @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public ResponseEntity<String> saveOwner() {
        String response = ownerService.saveOwner();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    //    @RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public ResponseEntity<String> updateOwner() {
        try {
            String response = ownerService.updateOwner();
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (OwnerNotFoundException e) {
            String response = e.getMessage();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
    }

    //    @RequestMapping(method = RequestMethod.PATCH)
    @PatchMapping
    public ResponseEntity<String> updatePetDetails() {
        try {
            String response = ownerService.updatePetDetails();
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (OwnerNotFoundException e) {
            String response = e.getMessage();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
    }

    //    @RequestMapping(method = RequestMethod.DELETE)
    @DeleteMapping
    public ResponseEntity<String> deleteOwner() {
        try {
            String response = ownerService.deleteOwner();
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (OwnerNotFoundException e) {
            String response = e.getMessage();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
    }

    //    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @GetMapping("/all")
    public ResponseEntity<String> findAllOwners() {
        String response = ownerService.findAllOwners();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
