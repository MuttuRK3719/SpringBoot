package com.abhishekverma.repository.repositoryimp;

import com.abhishekverma.exception.OwnerNotFoundException;
import com.abhishekverma.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;
@Profile("local")
@PropertySource("message.properties")
@Repository
public class OwnerRepositoryImp1 implements OwnerRepository {
    @Value("${owner.found}")
    String ownerFound;
    @Override
    public String findOwner(int ownerId) throws OwnerNotFoundException {
        if (ownerId % 2 == 1) throw new OwnerNotFoundException();
        return String.format("local "+ownerFound, ownerId);
    }

    public OwnerRepositoryImp1() {
        System.out.println("OwnerRepositoryImp bean is created ");
    }
}
