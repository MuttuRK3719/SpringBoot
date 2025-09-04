package com.abhishekverma.repository.repositoryimp;

import com.abhishekverma.exception.OwnerNotFoundException;
import com.abhishekverma.repository.OwnerRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OwnerRepositoryImp implements OwnerRepository {
    @Override
    public String findOwner(int ownerId) throws OwnerNotFoundException {
        if (ownerId % 2 == 1) throw new OwnerNotFoundException();
        return String.format("Found owner with owner id %s", ownerId);
    }

    public OwnerRepositoryImp() {
        System.out.println("OwnerRepositoryImp bean is created ");
    }
}
