package com.abhishekverma.repository.repositoryimp;

import com.abhishekverma.repository.OwnerRepository;
import org.springframework.stereotype.Repository;

@Repository
public class OwnerRepositoryImp implements OwnerRepository {
    @Override
    public String findOwner(int ownerId) {
        return String.format("Found owner with owner id %s",ownerId);
    }

    public OwnerRepositoryImp() {
        System.out.println("OwnerRepositoryImp bean is created ");
    }
}
