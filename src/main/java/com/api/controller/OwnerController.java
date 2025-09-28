package com.api.controller;

import com.api.exception.OwnerNotFoundException;
import com.api.service.OwnerService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequestMapping(value = "/owners")
@RequiredArgsConstructor
@RestController //@Controller + @ResponseBody
public class OwnerController {

    private final OwnerService ownerService;

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String findOwner() {
        try {
            return ownerService.findOwner();
        } catch (OwnerNotFoundException e) {
            return e.getMessage();
        }
    }

//    @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String saveOwner() {
        return ownerService.saveOwner();
    }

//    @RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String updateOwner() {
        try {
            return ownerService.updateOwner();
        } catch (OwnerNotFoundException e) {
            return e.getMessage();
        }
    }

//    @RequestMapping(method = RequestMethod.PATCH)
    @PatchMapping
    public String updatePetDetails() {
        try {
            return ownerService.updatePetDetails();
        } catch (OwnerNotFoundException e) {
            return e.getMessage();
        }
    }

//    @RequestMapping(method = RequestMethod.DELETE)
    @DeleteMapping
    public String deleteOwner() {
        try {
            return ownerService.deleteOwner();
        } catch (OwnerNotFoundException e) {
            return e.getMessage();
        }
    }

//    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @GetMapping("/all")
    public String findAllOwners() {
        return ownerService.findAllOwners();
    }

}
