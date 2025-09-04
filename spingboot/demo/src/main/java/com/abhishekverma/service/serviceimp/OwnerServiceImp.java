package com.abhishekverma.service.serviceimp;

import com.abhishekverma.exception.OwnerNotFoundException;
import com.abhishekverma.repository.OwnerRepository;
import com.abhishekverma.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImp implements OwnerService {
    @Autowired
    OwnerRepository ownerRepository;
    @Value("10")
    private int ownerId;

    public OwnerServiceImp() {
        System.out.println("OwnerServiceImpl bean created.");
    }

    @Override
    public String findOwner() throws OwnerNotFoundException {
        return ownerRepository.findOwner(ownerId);
    }

    @Override
    public void setId(int id) {
        ownerId = id;
    }

}
