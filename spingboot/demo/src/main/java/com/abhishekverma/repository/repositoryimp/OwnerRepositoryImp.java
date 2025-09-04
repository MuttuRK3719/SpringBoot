package com.abhishekverma.repository.repositoryimp;

import com.abhishekverma.exception.OwnerNotFoundException;
import com.abhishekverma.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;
@PropertySource("message.properties")
@Repository
public class OwnerRepositoryImp implements OwnerRepository {
    @Value("${owner.found}")
    String ownerFound;
    @Override
    public String findOwner(int ownerId) throws OwnerNotFoundException {
        if (ownerId % 2 == 1) throw new OwnerNotFoundException();
        return String.format(ownerFound, ownerId);
    }

    public OwnerRepositoryImp() {
        System.out.println("OwnerRepositoryImp bean is created ");
    }
}
